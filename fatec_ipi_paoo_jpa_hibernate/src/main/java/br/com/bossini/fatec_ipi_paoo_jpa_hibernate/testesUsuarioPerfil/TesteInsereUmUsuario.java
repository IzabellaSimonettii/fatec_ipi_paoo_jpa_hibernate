package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesUsuarioPerfil;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula.Usuario;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUmUsuario {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Usuario u = new Usuario();
        u.setNome("Ana");
        u.setFone("11223344");
        u.setEmail("ana@usjt.br");
        manager.persist(u);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
