/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.dao;

import io.github.jass2125.atividadepadroescriacional.core.entity.Aluno;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunoUnicoException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@Local(AlunoDao.class)
public class AlunoDaoImpl implements AlunoDao {

    @PersistenceContext(name = "pu")
    private EntityManager em;

    public AlunoDaoImpl() {
    }

    /**
     *
     * @param aluno
     * @throws io.github.jass2125.atividadepadroescriacional.core.exception.AlunoUnicoException
     */
    @Override
    public void add(Aluno aluno) throws AlunoUnicoException {
        try {
            System.out.println("Teste de injeção");
//            em.persist(aluno);
        } catch (Exception e) {
            e.printStackTrace();

        }
//        try {
//            Connection con = facConnection.getConnection();
//            String sql = "insert into alunx(cpf, identidade, nome, numeroDocumentoMilitar, dtNasc, nacionalidade, sexo) values(?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, aluno.getCPF());
//            ps.setString(2, aluno.getIdentidade());
//            ps.setString(3, aluno.getNome());
//            ps.setString(4, aluno.getNumeroDocumentoMilitar());
//            ps.setDate(5, aluno.getDtNasc());
//            ps.setString(6, aluno.getNacionalidade().name());
//            ps.setString(7, aluno.getSexo().getSexo());
//            ps.execute();
//            ps.close();
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new AlunxUnicoException("Alunx ja cadastrado!", e);
//        }
//
    }
}
