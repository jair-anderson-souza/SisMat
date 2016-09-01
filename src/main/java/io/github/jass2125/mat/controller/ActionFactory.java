/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.controller;

import io.github.jass2125.atividadepadroescriacional.core.actions.Action;
import io.github.jass2125.atividadepadroescriacional.core.actions.CadastrarAlunoAction;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Anderson Souza
 */
public class ActionFactory {

    public static Action getAction(HttpServletRequest request) {
        Map<String, Action> actions = new HashMap<>();
        actions.put("cadastrarAluno", new CadastrarAlunoAction());
        return actions.get(request.getParameter("action"));
    }
}
