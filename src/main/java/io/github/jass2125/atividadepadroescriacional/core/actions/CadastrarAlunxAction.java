/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.core.actions;

import io.github.jass2125.atividadepadroescriacional.core.util.AlunxBuilder;
import io.github.jass2125.atividadepadroescriacional.core.dao.AlunxDao;
import io.github.jass2125.atividadepadroescriacional.core.dao.AlunxDaoImpl;
import io.github.jass2125.atividadepadroescriacional.core.entity.Alunx;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunxUnicoException;
import io.github.jass2125.atividadepadroescriacional.core.exception.NumeroDocumentoMilitarVazioException;
import io.github.jass2125.atividadepadroescriacional.core.exception.AlunaSexoException;
import io.github.jass2125.atividadepadroescriacional.core.exception.CPFInvalidException;
import io.github.jass2125.atividadepadroescriacional.core.exception.NomeInvalidoException;
import io.github.jass2125.atividadepadroescriacional.core.util.NacionalidadeEnum;
import io.github.jass2125.atividadepadroescriacional.core.util.SexoEnum;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 */
public class CadastrarAlunxAction implements Action {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            SexoEnum s = SexoEnum.valueOf(request.getParameter("sexo"));
            Date dtNasc = Date.valueOf(request.getParameter("dtNasc"));
            String identidade = request.getParameter("identidade");

            NacionalidadeEnum nacionalidade = NacionalidadeEnum.valueOf(request.getParameter("nacionalidade"));
            String numeroDocumentoMilitar = request.getParameter("numeroDocumentoMilitar");

            Alunx aluno = new AlunxBuilder().nomeBuilder(nome).CPFBuilder(cpf).
                    identidadeBuilder(identidade).sexoBuilder(s).
                    dtNascBuilder(dtNasc).nacionalidadeBuilder(nacionalidade).
                    numeroDocumentoMilitarBuilder(numeroDocumentoMilitar).getAlunx();

            AlunxDao dao = new AlunxDaoImpl();
            dao.add(aluno);
            request.getSession().setAttribute("success", "O cadastro do alunx foi efetuado com sucesso!");
            return "home.jsp";
        } catch (AlunaSexoException | AlunxUnicoException | CPFInvalidException | NumeroDocumentoMilitarVazioException | NomeInvalidoException e) {
            request.getSession().setAttribute("error", e.getMessage());
            return "home.jsp";
        }
    }

}
