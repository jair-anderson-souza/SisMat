/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.dao;

import io.github.jass2125.atividadepadroescriacional.core.entity.Alunx;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunxUnicoException;
import io.github.jass2125.atividadepadroescriacional.core.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Anderson Souza
 */
public class AlunxDaoImpl implements AlunxDao {

    private final ConnectionFactory facConnection;

    public AlunxDaoImpl() {
        facConnection = new ConnectionFactory();
    }

    /**
     *
     * @param alunx
     * @throws AlunxUnicoException
     */
    @Override
    public void add(Alunx alunx) throws AlunxUnicoException {

        try {
            Connection con = facConnection.getConnection();
            String sql = "insert into alunx(cpf, identidade, nome, numeroDocumentoMilitar, dtNasc, nacionalidade, sexo) values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, alunx.getCPF());
            ps.setString(2, alunx.getIdentidade());
            ps.setString(3, alunx.getNome());
            ps.setString(4, alunx.getNumeroDocumentoMilitar());
            ps.setDate(5, alunx.getDtNasc());
            ps.setString(6, alunx.getNacionalidade().name());
            ps.setString(7, alunx.getSexo().getSexo());
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new AlunxUnicoException("Alunx ja cadastrado!", e);
        }

    }
}
//create table alunx(
//    cpf varchar(15) primary key,
//    identidade varchar(30) not null unique,
//    nome varchar(40) not null,
//    numeroDocumentoMilitar varchar(30),
//    dtNasc date not null,
//    nacionalidade varchar(30) not null,
//    sexo varchar(30) not null
//);
