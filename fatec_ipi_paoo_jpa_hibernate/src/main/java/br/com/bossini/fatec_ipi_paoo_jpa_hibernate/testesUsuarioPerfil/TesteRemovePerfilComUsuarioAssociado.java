package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesUsuarioPerfil;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula.Perfil;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteRemovePerfilComUsuarioAssociado {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        Perfil p = manager.find(Perfil.class, 1L);
        manager.remove(p);
        manager.close();
        JPAUtil.close();
    }
}
