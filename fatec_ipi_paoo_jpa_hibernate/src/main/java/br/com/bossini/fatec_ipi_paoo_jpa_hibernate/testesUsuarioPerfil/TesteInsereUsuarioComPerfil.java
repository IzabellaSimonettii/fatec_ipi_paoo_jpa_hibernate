package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesUsuarioPerfil;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula.Perfil;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula.Usuario;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereUsuarioComPerfil {

    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Perfil p = new Perfil();
        p.setDescricao("Perfil do José");
        manager.persist(p);
        Usuario u = new Usuario();
        u.setNome("José");
        u.setFone("11332244");
        u.setEmail("jose@usjt.br");
        u.setPerfil(p);
        manager.persist(u);
        transaction.commit();
        manager.close();
        JPAUtil.close();
    }
}
