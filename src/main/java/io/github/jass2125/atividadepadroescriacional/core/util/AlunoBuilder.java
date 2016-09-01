/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.util;

import br.com.caelum.stella.validation.CPFValidator;
import io.github.jass2125.atividadepadroescriacional.core.entity.Aluno;
import io.github.jass2125.atividadepadroescriacional.core.exception.CPFInvalidoException;
import io.github.jass2125.atividadepadroescriacional.core.exception.NomeInvalidoException;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Anderson Souza
 */
public class AlunoBuilder {

    private String nome;
    private SexoEnum sexo;
    private Date dtNasc;
    private NacionalidadeEnum nacionalidade;
    private String identidade;
    private String CPF;
    private String numeroDocumentoMilitar;

    public AlunoBuilder() {
    }

    public AlunoBuilder CPFBuilder(String cpf) throws CPFInvalidoException {
        try {
            CPFValidator val = new CPFValidator();
            val.assertValid(cpf);
            this.CPF = cpf;
            return this;
        } catch (IllegalStateException e) {
            throw new CPFInvalidoException("O CPF digitado é inválido", e);
        }
    }

    public AlunoBuilder dtNascBuilder(Date dtNasc) {
        this.dtNasc = dtNasc;
        return this;
    }

    public AlunoBuilder identidadeBuilder(String identidade) {
        this.identidade = identidade;
        return this;
    }

    public AlunoBuilder nacionalidadeBuilder(NacionalidadeEnum nacionalidade) {
        this.nacionalidade = nacionalidade;
        return this;
    }

    public AlunoBuilder nomeBuilder(String nome) throws NomeInvalidoException {
        Pattern pattern = Pattern.compile("^[a-zA-Zã-ũá-úà-àâ-ûÃ-ŨÁ-ÚÀ-ÙÂ-Û}]+ {1}[a-zA-Z0-9Â-Ûâ-û]+$");
        Matcher matcher = pattern.matcher(nome);
        if (!matcher.find()) {
            throw new NomeInvalidoException("O nome precisa ter pelo menos um sobrenome separado por espaço!");
        }
        this.nome = nome;
        return this;
    }

    /**
     *
     * @param numeroDocumentoMilitar
     * @return
     * @throws AlunaSexoException
     * @throws NumeroDocumentoMilitarVazioException
     */
//    public AlunoBuilder numeroDocumentoMilitarBuilder(String numeroDocumentoMilitar) throws AlunaSexoException, NumeroDocumentoMilitarVazioException {
//        if (sexo.equals(SexoEnum.FEMININO) && !numeroDocumentoMilitar.trim().isEmpty()) {
//            this.numeroDocumentoMilitar = null;
//            throw new AlunaSexoException("Mulher nao precisa de documento militar!");
//
//        } else if (sexo.equals(SexoEnum.MASCULINO) && numeroDocumentoMilitar.trim().isEmpty()) {
//            throw new NumeroDocumentoMilitarVazioException("Homens precisam informar o numero do documento militar!");
//        }
//        this.numeroDocumentoMilitar = numeroDocumentoMilitar;
//        return this;
//    }
    /**
     *
     * @param sexo
     * @return
     */
    public AlunoBuilder sexoBuilder(SexoEnum sexo) {
        this.sexo = sexo;
        return this;
    }
    
    public Aluno getAluno(){
        return new Aluno(nome, sexo, dtNasc, nacionalidade, identidade, CPF);
    }

}
