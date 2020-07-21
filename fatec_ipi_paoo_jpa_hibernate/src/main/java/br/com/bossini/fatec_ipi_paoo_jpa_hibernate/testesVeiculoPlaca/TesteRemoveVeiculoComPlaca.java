package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesVeiculoPlaca;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.exercicios.Placa;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class TesteRemoveVeiculoComPlaca {

    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        Placa p = manager.find(Placa.class, 1L);
        manager.remove(p);

        transaction.commit();
        manager.close();
        JPAUtil.close();

    }

}
