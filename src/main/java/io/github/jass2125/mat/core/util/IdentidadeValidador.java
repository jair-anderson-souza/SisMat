package io.github.jass2125.mat.core.util;


import java.math.BigInteger;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author <a href="mailto:jair_anderson_bs@hotmail.com">Anderson Souza</a>
 * @author 16/11/2017 01:43:13
 */
@FacesValidator("identidade.validator")
public class IdentidadeValidador implements Validator {

    private BigInteger identidade;
    private FacesMessage message;

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String val = (String) value;
        try {
            identidade = new BigInteger(val);
        } catch (NumberFormatException e) {
            this.message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "O número da identidade deve possuir apenas números.");
            throw new ValidatorException(message);
        }

    }

}
