/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.controller;

import io.github.jass2125.atividadepadroescriacional.core.dao.AlunoDao;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunoUnicoException;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Anderson Souza
 */
@Named
@SessionScoped
public class Teste implements Serializable {
    @EJB
    private AlunoDao dao;
    
    public void teste() throws AlunoUnicoException{
        System.out.println("Testando");
        dao.add(null);
    }
}
