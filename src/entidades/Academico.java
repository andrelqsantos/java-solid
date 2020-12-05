package entidades;

// Classe da entidade acadêmico
public class Academico {

    private String nome;
    private String email;
    private String rga;

    //Construtor da classe
    public Academico(String nome, String email, String rga) {
        this.nome = nome;
        this.email = email;
        this.rga = rga;
    }

    // Métodos modificadores da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }
}
