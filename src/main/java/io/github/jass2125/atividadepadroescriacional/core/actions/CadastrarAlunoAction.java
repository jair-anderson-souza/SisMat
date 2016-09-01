/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.actions;

import io.github.jass2125.atividadepadroescriacional.core.dao.AlunoDao;
import io.github.jass2125.atividadepadroescriacional.core.entity.Aluno;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunoUnicoException;
import io.github.jass2125.atividadepadroescriacional.core.exception.CPFInvalidoException;
import io.github.jass2125.atividadepadroescriacional.core.exception.NomeInvalidoException;
import io.github.jass2125.atividadepadroescriacional.core.util.AlunoBuilder;
import io.github.jass2125.atividadepadroescriacional.core.util.NacionalidadeEnum;
import io.github.jass2125.atividadepadroescriacional.core.util.SexoEnum;
import java.sql.Date;
import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 */
public class CadastrarAlunoAction implements Action {
    @EJB
    private AlunoDao dao;
    
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            SexoEnum s = SexoEnum.valueOf(request.getParameter("sexo"));
            Date dt = Date.valueOf(request.getParameter("dtNasc"));
//            LocalDate dtNasc = LocalDate.from(Instant.ofEpochMilli(dt.getTime()));
            String identidade = request.getParameter("identidade");
            NacionalidadeEnum nacionalidade = NacionalidadeEnum.valueOf(request.getParameter("nacionalidade"));
            String numeroDocumentoMilitar = request.getParameter("numeroDocumentoMilitar");

            Aluno aluno = aluno = new AlunoBuilder()
                    .nomeBuilder(nome)
                    .CPFBuilder(cpf)
                    .identidadeBuilder(identidade).sexoBuilder(s)
                    .dtNascBuilder(dt)
                    .nacionalidadeBuilder(nacionalidade)
                    .getAluno();

            if (s.name().equals(SexoEnum.MASCULINO)) {
                aluno.setNumeroDocumentoMilitar(numeroDocumentoMilitar);
            }

            dao.add(aluno);
            request.getSession().setAttribute("sucesso", "O cadastro do aluno foi efetuado com sucesso!");
            return "home.jsp";
        } catch (AlunoUnicoException | CPFInvalidoException | NomeInvalidoException e) {
            request.getSession().setAttribute("erro", e.getMessage());
            return "home.jsp";
        }
    }

}
