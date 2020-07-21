package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.testesUsuarioPerfil;

import javax.persistence.Persistence;

public class TesteCriarBaseETabela {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("usjtPU");
    }
}
