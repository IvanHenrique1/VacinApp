
package model;

import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.TGerarRelatorio;

public class Paciente {
    
    private int id;
    private String nome;
    private int idade;
    private boolean area_saude;
    private boolean nao_area_saude;
    private String endereco;
    private int nivel;
    private String data_inicial;
    private String data_final;
    private String data_vacinacao;
    private boolean vacinado;

    public Paciente() {
    }

    public Paciente(String data_inicial, String data_final) {
        this.data_inicial = data_inicial;
        this.data_final = data_final;
    }

    public Paciente(String nome, int idade, boolean area_saude, boolean nao_area_saude, String endereco, int nivel) {
        this.nome = nome;
        this.idade = idade;
        this.area_saude = area_saude;
        this.nao_area_saude = nao_area_saude;
        this.endereco = endereco;
        this.nivel = nivel;
    }

    public Paciente(int idade, String data_inicial, String data_final) {
        this.idade = idade;
        this.data_inicial = data_inicial;
        this.data_final = data_final;
    }
    
    public Paciente(String nome, int idade, boolean area_saude, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.area_saude = area_saude;
        this.endereco = endereco;
    }
    
    public Paciente(int nivel) {
        this.nivel = nivel;
    }

    public Paciente(String nome, int idade, boolean area_saude, String endereco, int nivel) {
        this.nome = nome;
        this.idade = idade;
        this.area_saude = area_saude;
        this.endereco = endereco;
        this.nivel = nivel;
    }
    
    public Paciente(int id, String nome, int idade, boolean area_saude, String endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.area_saude = area_saude;
        this.endereco = endereco;
    }

    Paciente(String nome, boolean area_saude, String endereco) {
        this.nome = nome;
        this.area_saude = area_saude;
        this.endereco = endereco;
    }

    public Paciente(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public Paciente(int id, boolean vacinado) {
        this.id = id;
        this.vacinado = vacinado;
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

    public String getData_vacinacao() {
        return data_vacinacao;
    }

    public void setData_vacinacao(String data_vacinacao) {
        this.data_vacinacao = data_vacinacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getArea_saude() {
        return area_saude;
    }

    public void setArea_saude(boolean area_saude) {
        this.area_saude = area_saude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public String getData_inicial() {
        return data_inicial;
    }

    public void setData_inicial(String data_inicial) {
        this.data_inicial = data_inicial;
    }

    public String getData_final() {
        return data_final;
    }

    public void setData_final(String data_final) {
        this.data_final = data_final;
    }
    
    
    
    
}
    
