package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesVeiculoPlaca;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.exercicios.Veiculo;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;

public class TesteBuscaVeiculoComPlaca {

    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();

        Veiculo car = manager.find(Veiculo.class, 1L);
        System.out.println(car);
        manager.close();
        JPAUtil.close();
    }

}
