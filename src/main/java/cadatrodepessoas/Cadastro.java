/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadatrodepessoas;

/**
 *
 * @author Jose Teixeira
 */
public class Cadastro {
    private int codigo;
    private String nome;
    private String Telefone;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Cadastro(int codigo, String nome, String Telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.Telefone = Telefone;
    }

    public Cadastro() {
    }
    
}
