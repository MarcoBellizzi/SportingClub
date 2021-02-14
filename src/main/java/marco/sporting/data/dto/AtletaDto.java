package marco.sporting.data.dto;

import java.io.Serializable;

public class AtletaDto implements Serializable {

    private Long id;

    private String nome;

    private String cognome;

    private String username;

    private Long telefono;

    private String email;

    private String password;

    private boolean admin;

    private String livello;

    public AtletaDto() {
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    // per essere sicuri
    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getLivello() {
        return livello;
    }

    public void setLivello(String livello) {
        this.livello = livello;
    }

    @Override
    public String toString() {
        return "AtletaDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", username='" + username + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", admin=" + admin +
                ", livello='" + livello + '\'' +
                '}';
    }
}
