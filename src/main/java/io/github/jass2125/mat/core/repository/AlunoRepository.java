/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.core.repository;

import io.github.jass2125.mat.core.entity.Aluno;
import io.github.jass2125.mat.core.exceptions.PersistenciaException;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@LocalBean
public class AlunoRepository {

    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    private EntityManager em;

    public void salvar(Aluno aluno) throws PersistenciaException {
        try {
            em.persist(aluno);
        } catch (Exception e) {
            throw new PersistenciaException(e, "Verifique os dados e tente novamente.");
        }
    }
}
