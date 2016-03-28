/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.atividadepadroescriacional.entity;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Anderson Souza
 */
public class Loader {

    public static void main(String[] args) {
        Pessoa p = new Aluna();
        p.setNacionalidade("Brasileira");
        p.setCPF("45");
        p.setDtNasc(LocalDate.now());
        p.setIdade(20);
        p.setIdentidade("3456789");
        p.setNome("Juiana");
        EntityManager em = Persistence.createEntityManagerFactory("default-mysql").createEntityManager();
        em.getTransaction().begin();

        em.persist(p);
        em.getTransaction().commit();
    }

}
