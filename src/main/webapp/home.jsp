<%-- 
    Document   : home
    Created on : Mar 29, 2016, 8:07:27 PM
    Author     : jairanderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Alunxs</title>
        <%@include file="head.jsp" %>
    </head>
    <body>
        <br>
        <div class="container-fluid bg-1 text-center">
            <h1 class="margin">Cadastro de Alunx</h1>
        </div>
        <br>
        <br>
        <br>

        <c:choose>
            <c:when test="${sessionScope.erro != null}">
                <div class="alert alert-danger col-sm-offset-3 col-sm-7">
                    ${sessionScope.erro}
                </div>
            </c:when>
            <c:when test="${sessionScope.sucesso != null}">
                <div class="alert alert-success col-sm-offset-3 col-sm-7">
                    ${sessionScope.sucesso}
                </div>
            </c:when>
        </c:choose>

        <form action="front?action=cadastrarAluno" method="post" class="form-horizontal" role="form">
            <div class="form-group">
                <label class="control-label col-sm-3" for="nome">Nome</label>
                <div class="col-sm-7">
                    <input type="text" class="form-control" name="nome" id="nome">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="cpf">CPF</label>
                <div class="col-sm-7"> 
                    <input type="text" class="form-control" id="cpf" name="cpf">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="dtNasc">Data De Nascimento</label>
                <div class="col-sm-7"> 
                    <input type="date" class="form-control" id="dtNasc" name="dtNasc">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-7">
                    <label for="sexo">Sexo</label>
                    <select class="form-control" id="sexo" name="sexo">
                        <option value="MASCULINO">Masculino</option>
                        <option value="FEMININO">Feminino</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-3 col-sm-7">
                    <label for="nacionalidade">Nacionalidade</label>
                    <select class="form-control" id="nacionalidade" name="nacionalidade">
                        <option value="ARG">Argentina</option>
                        <option value="PER">Peru</option>
                        <option value="BRA">Brasil</option>
                        <option value="COL">Colômbia</option>
                        <option value="VEN">Venezuela</option>
                        <option value="CHI">Chile</option>
                        <option value="EQU">Equador</option>
                        <option value="BOL">Bolívia</option>
                        <option value="URU">Usuguai</option>
                        <option value="PAR">Paraguai</option>
                        <option value="SUR">Suriname</option>
                        <option value="GUI">Guiana</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="identidade">Identidade</label>
                <div class="col-sm-7"> 
                    <input type="text" class="form-control" id="identidade" name="identidade">
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-3" for="dtNasc">Número do Documento Militar</label>
                <div class="col-sm-7"> 
                    <input type="text" class="form-control" id="dtNasc" name="numeroDocumentoMilitar">
                </div>
            </div>
            <div class="form-group"> 
                <div class="col-sm-offset-3 col-sm-7">
                    <button type="submit" class="btn btn-success">Enviar</button>
                </div>
            </div>
        </form>

        <c:remove scope="session" var="error"/>
        <c:remove scope="session" var="success"/>
    </body>
</html>
