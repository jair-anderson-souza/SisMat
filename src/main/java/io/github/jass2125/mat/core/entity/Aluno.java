/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.mat.core.entity;

import io.github.jass2125.mat.core.utils.NacionalidadeEnum;
import io.github.jass2125.mat.core.utils.SexoEnum;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Anderson Souza
 */
@Entity
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false, unique = false, length = 40)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo", nullable = false, unique = false, length = 20)
    private SexoEnum sexo;

    @Column(name = "dataDeNascimento", nullable = false, unique = false, length = 20)
    private String dataDeNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "nacionalidade", nullable = false, unique = false, length = 20)
    private NacionalidadeEnum nacionalidade;

    @Column(name = "identidade", nullable = false, unique = false, length = 20)
    private String identidade;

    @Column(name = "cpf", nullable = false, unique = false, length = 20)
    private String cpf;

    @Column(name = "numeroDoDocumentoMilitar", nullable = false, unique = false, length = 20)
    private String numeroDocumentoMilitar;

    public Aluno(String nome, SexoEnum sexo, String dtNasc, NacionalidadeEnum nacionalidade, String dataDeNascimento, String identidade, String CPF) {
        setNome(nome);
        setSexo(sexo);
        setDataDeNascimento(dataDeNascimento);
        setNacionalidade(nacionalidade);
        setIdentidade(identidade);
        setCpf(CPF);
    }

    public Aluno(String nome, SexoEnum sexo, NacionalidadeEnum nacionalidade, String identidade, String cpf, String numeroDocumentoMilitar) {
        setNome(nome);
        setSexo(sexo);
        setNacionalidade(nacionalidade);
        setIdentidade(identidade);
        setCpf(cpf);
        setNumeroDocumentoMilitar(numeroDocumentoMilitar);
    }

    public Aluno() {
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDocumentoMilitar() {
        return numeroDocumentoMilitar;
    }

    public void setNumeroDocumentoMilitar(String numeroDocumentoMilitar) {
        this.numeroDocumentoMilitar = numeroDocumentoMilitar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataDeNascimento=" + dataDeNascimento + ", nacionalidade=" + nacionalidade + ", identidade=" + identidade + ", cpf=" + cpf + ", numeroDocumentoMilitar=" + numeroDocumentoMilitar + '}';
    }

}
