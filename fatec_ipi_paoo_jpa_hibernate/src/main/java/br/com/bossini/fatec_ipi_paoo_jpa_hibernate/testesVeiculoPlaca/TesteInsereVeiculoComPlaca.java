package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesVeiculoPlaca;

import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.exercicios.Placa;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.exercicios.Veiculo;
import br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.repository.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TesteInsereVeiculoComPlaca {

    public static void main(String[] args) {

        EntityManager manager = JPAUtil.getEntityManager();
        EntityTransaction transaction = manager.getTransaction();

        transaction.begin();

        Placa p = new Placa();
        p.setCidade("São Paulo");
        manager.persist(p);
        Veiculo car = new Veiculo();
        car.setMarca("Hyundai");
        car.setModelo("Karens");
        car.setAnoModelo(2020);
        car.setPlaca(p);
        manager.persist(car);

        transaction.commit();
        manager.close();
        JPAUtil.close();
    }

}
