/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.service;

import io.github.jass2125.mat.core.entity.Aluno;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@LocalBean
public class AlunoService {
    
    public void cadastrarAluno(Aluno aluno){
        
        
        System.out.println("Service Teste");
        
   }

}
