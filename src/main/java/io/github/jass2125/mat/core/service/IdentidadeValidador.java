package io.github.jass2125.mat.core.service;

import io.github.jass2125.mat.core.exceptions.LetterException;
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
@FacesValidator("identidadeValidator")
public class IdentidadeValidador implements Validator {

    private BigInteger identidade;
    private FacesMessage message;

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String val = (String) value;
        try {
            String[] valor = val.split("/");
            identidade = new BigInteger(valor[0]);
            boolean allMatch = valor[1].chars().allMatch(Character::isLetter);
            if(!allMatch || valor[1].length() != 2){
                throw new LetterException("Você não preencheu o Órgão Emissor corretamente, siga o exemplo!!!");
            }
        } catch (NumberFormatException | LetterException e) {
            this.message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Você não preencheu o Órgão Emissor corretamente, siga o exemplo!!!");
            throw new ValidatorException(message);
        }

    }

}
