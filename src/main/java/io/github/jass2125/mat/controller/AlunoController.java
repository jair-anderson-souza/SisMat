/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.controller;

import io.github.jass2125.mat.core.entity.Aluno;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunoUnicoException;
import io.github.jass2125.atividadepadroescriacional.core.service.AlunoService;
import io.github.jass2125.atividadepadroescriacional.core.util.AlunoBuilder;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Anderson Souza
 */
@Named
@RequestScoped
public class AlunoController implements Serializable {

    @EJB
    private AlunoService service;
    private Aluno aluno;

    @PostConstruct
    public void init() {
        this.aluno = new Aluno();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void cadastrarAluno() throws AlunoUnicoException {
        service.cadastrarAluno(null);
        System.out.println(aluno);
    }
}
