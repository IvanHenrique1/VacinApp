
package model;

public class Usuario {
    
    private int id;
    private String cpf;
    private String senha;
    private boolean admin;
    private String permissao;

    public Usuario() {
    }

    public Usuario(String cpf, String senha, String permissao) {
        this.cpf = cpf;
        this.senha = senha;
        this.permissao = permissao;
    }
    
    public Usuario(int id, String cpf, String senha, boolean admin) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
        this.admin = admin;
    }
    
    public Usuario(String cpf, String senha, boolean admin) {
        this.cpf = cpf;
        this.senha = senha;
        this.admin = admin;
    }

    public Usuario(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
    
    
    
    
    
}
