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

    @PostConstruct
    public void init() {
        this.context = FacesContext.getCurrentInstance();
        this.aluno = new Aluno();
        this.message = new FacesMessage();
    }

    @PreDestroy
    public void destroy() {
        this.aluno = null;

    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String cadastrarAluno() {
        try {
            service.cadastrarAluno(aluno);
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "O aluno foi salvo com sucesso.");
            context.addMessage("message", message);
        } catch (PersistenceException e) {
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Ocorreu um erro.");
            context.addMessage("message", message);
        }
        context.getExternalContext().getFlash().setKeepMessages(true);
        return "index.html?faces-redirect=true";
    }

    public void validaNumeroDoDocumento(String numeroDocumentoMilitar) {

    }
}
