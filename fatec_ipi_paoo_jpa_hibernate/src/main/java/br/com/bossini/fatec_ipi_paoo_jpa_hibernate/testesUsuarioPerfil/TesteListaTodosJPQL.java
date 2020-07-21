package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesUsuarioPerfil;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula.Usuario;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class TesteListaTodosJPQL {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Query query = manager.createQuery("from Usuario");
        List<Usuario> usuarios = query.getResultList();
        for (Usuario u : usuarios) System.out.println(u);
        manager.close();
        JPAUtil.close();
    }
}
