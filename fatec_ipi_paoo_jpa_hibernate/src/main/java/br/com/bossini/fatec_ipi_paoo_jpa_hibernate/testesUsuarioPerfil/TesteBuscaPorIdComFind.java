package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesUsuarioPerfil;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula.Usuario;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;

public class TesteBuscaPorIdComFind {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Usuario u = manager.find(Usuario.class, 1L);
        System.out.println(u);
        manager.close();
        JPAUtil.close();
    }
}
