/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.entity;

import io.github.jass2125.atividadepadroescriacional.core.util.NacionalidadeEnum;
import io.github.jass2125.atividadepadroescriacional.core.util.SexoEnum;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Anderson Souza
 */
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private SexoEnum sexo;
    private Date dtNasc;
    @Enumerated(EnumType.STRING)
    private NacionalidadeEnum nacionalidade;
    private String identidade;
    private String CPF;
    private String numeroDocumentoMilitar;

    public Aluno() {
    }

    public Aluno(String nome, SexoEnum sexo, Date dtNasc, NacionalidadeEnum nacionalidade, String identidade, String CPF) {
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
        this.nacionalidade = nacionalidade;
        this.identidade = identidade;
        this.CPF = CPF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public NacionalidadeEnum getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeEnum nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNumeroDocumentoMilitar() {
        return numeroDocumentoMilitar;
    }

    public void setNumeroDocumentoMilitar(String numeroDocumentoMilitar) {
        this.numeroDocumentoMilitar = numeroDocumentoMilitar;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dtNasc=" + dtNasc + ", nacionalidade=" + nacionalidade + ", identidade=" + identidade + ", CPF=" + CPF + ", numeroDocumentoMilitar=" + numeroDocumentoMilitar + '}';
    }
    
    
}
