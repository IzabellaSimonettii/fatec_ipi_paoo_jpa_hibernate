package br.com.bossini.fatec_ipi_paoo_jpa_hibernate.model.beans.Aula;

import javax.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(nullable = false, length = 30)
    private String fone;

    @Column(nullable = true, length = 100)
    private String email;

    @OneToOne(optional = false)
    @JoinColumn(name = "id_do_perfil")
    private Perfil perfil;

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return getId().equals(usuario.getId()) &&
                getNome().equals(usuario.getNome()) &&
                getFone().equals(usuario.getFone()) &&
                getEmail().equals(usuario.getEmail());
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", fone=" + fone + ", email=" + email + ", perfil=" + perfil
                + "]";
    }

}