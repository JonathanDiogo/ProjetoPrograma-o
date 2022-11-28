package projeto;

public class Users {
    private String nome_usuario;
    private String senha_usuario;
    
    public Users(String nome, String senha){
        this.nome_usuario=nome;
        this.senha_usuario=senha;
    }

    public String getNome() {
        return nome_usuario;
    }

    public void setNome(String nome) {
        this.nome_usuario = nome;
    }

    public String getSenha() {
        return senha_usuario;
    }

    public void setSenha(String senha) {
        this.senha_usuario = senha;
    }
    
}
