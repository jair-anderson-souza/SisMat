/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.atividadepadroescriacional.core.dao;

import io.github.jass2125.atividadepadroescriacional.core.entity.Aluno;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunxUnicoException;

/**
 *
 * @author Anderson Souza
 */
public interface AlunoDao {
    public void add(Aluno aluno) throws AlunxUnicoException;
}
