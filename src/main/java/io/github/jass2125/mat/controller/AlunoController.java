/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.controller;

import io.github.jass2125.mat.core.entity.Aluno;
import io.github.jass2125.mat.core.service.AlunoService;
import io.github.jass2125.mat.core.utils.SexoEnum;
import java.io.Serializable;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.PersistenceException;

/**
 *
 * @author Anderson Souza
 */
@Named
@ConversationScoped
public class AlunoController implements Serializable {

    @EJB
    private AlunoService service;
    private Aluno aluno;
    private FacesMessage message;
    private FacesContext context;
    private boolean obrigatorioNumeroDoDocumentoMilitar;

    @PostConstruct
    public void init() {
        this.context = FacesContext.getCurrentInstance();
        this.aluno = new Aluno();
        this.message = new FacesMessage();
    }

    @PreDestroy
    public void destroy() {
        this.aluno = null;
        this.obrigatorioNumeroDoDocumentoMilitar = true;

    }

    public void verificaSeNumeroDoDocumentoEstaPreenchido() {
        String[] dataQuebrada = aluno.getDataDeNascimento().split("/");
        Integer ano = Integer.parseInt(dataQuebrada[2]);
        Integer mes = Integer.parseInt(dataQuebrada[1]);
        Integer dia = Integer.parseInt(dataQuebrada[0]);
        if ((aluno.getSexo().equals(SexoEnum.MASCULINO))
                && (LocalDate.now().getYear() - ano >= 18 && LocalDate.now().getMonthValue() - mes >= 0 && LocalDate.now().getDayOfMonth() - dia >= 0)) {
            if (this.aluno.getNumeroDocumentoMilitar() == null || this.aluno.getNumeroDocumentoMilitar().equals("")) {
                throw new RuntimeException("O número do documento militar deve ser preenchido!!!");
            }
        }
    }

    public boolean isObrigatorioNumeroDoDocumentoMilitar() {
        return obrigatorioNumeroDoDocumentoMilitar;
    }

    public void setObrigatorioNumeroDoDocumentoMilitar(boolean obrigatorioNumeroDoDocumentoMilitar) {
        this.obrigatorioNumeroDoDocumentoMilitar = obrigatorioNumeroDoDocumentoMilitar;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String cadastrarAluno() {
        try {
            verificaSeNumeroDoDocumentoEstaPreenchido();
            service.cadastrarAluno(aluno);
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "O aluno foi salvo com sucesso.", null);
            context.addMessage("message", message);
        } catch (RuntimeException e) {
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), null);
            context.addMessage("message", message);
        }
        context.getExternalContext().getFlash().setKeepMessages(true);
        return "index.html?faces-redirect=true";
    }

    public void validaNumeroDoDocumento(String numeroDocumentoMilitar) {

    }
}
