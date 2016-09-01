/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Anderson Souza
 */
@FacesValidator("nome.validador")
public class ValidadorNome implements Validator {

    private Pattern pattern;
    private Matcher matcher;
    private FacesMessage message;
    
    public ValidadorNome() {
        this.pattern = Pattern.compile("^[a-zA-Zã-ũá-úà-àâ-ûÃ-ŨÁ-ÚÀ-ÙÂ-Û}]+ {1}[a-zA-Z0-9Â-Ûâ-û]+$");
    }

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String nome = (String) String.valueOf(value);
        matcher = pattern.matcher(nome);
        if (!matcher.find()) {
            this.message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "O nome precisa ter pelo menos um sobrenome separado por espaço!");
            throw new ValidatorException(message);
        }
    }

}
