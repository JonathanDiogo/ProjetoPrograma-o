package projeto;

public class ItensEstoques {
    private int id;
    private String nome;
    private String valor;
    

    

    public ItensEstoques(int id, String nome, String valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public ItensEstoques(String nome, String valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public ItensEstoques(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    @Override
    public String toString(){
        return this.nome;
    }
}
