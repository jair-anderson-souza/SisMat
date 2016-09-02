/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.core.service;

import io.github.jass2125.mat.core.entity.Aluno;
import io.github.jass2125.mat.core.exceptions.PersistenciaException;
import io.github.jass2125.mat.core.repository.AlunoRepository;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@LocalBean
public class AlunoService {
    @EJB
    private AlunoRepository repository;

    public void cadastrarAluno(Aluno aluno) {
        try {
            repository.salvar(aluno);
        } catch (PersistenciaException e) {
            e.printStackTrace();
        }

    }

}
