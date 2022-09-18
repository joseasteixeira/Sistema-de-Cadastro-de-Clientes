/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadatrodepessoas;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Main {
    /*
    Faça um sistema em Java com as seguintes especificações:     
    A) Cadastro para 100 pessoas com código, nome e telefone.(utilize vetor).     
    B) O código será o identificador da pessoa.     
    C) O sistema deverá ter um menu com as seguintes opções:     
    1. Cadastrar pessoa.     
    2. Listar pessoa.     
    3. Alterar pessoa.     
    4. Excluir pessoa.     
    5. Sair.     
    D) O sistema deverá listar apenas as pessoa cadastradas.     
    E) O sistema deverá informar quando a agenda estiver cheia.
    */
    
    public static void main(String[] args){
        int opcoes=0;
        
        FuncoesMenuPrincipal menuPricipal=new FuncoesMenuPrincipal();
        do{
            opcoes=Integer.parseInt(JOptionPane.showInputDialog("Opções:"
                    + "\n1. Cadastrar pessoa."
                    + "\n2. Listar pessoa."
                    + "\n3. Alterar pessoa."
                    + "\n4. Excluir pessoa."
                    + "\n5. Sair."));
            switch(opcoes){
                case 1:
                    menuPricipal.cadastrarPessoa();
                break;
                case 2:
                    menuPricipal.listarPessoa();
                break;
                case 3:
                    menuPricipal.alterarPessoa();
                break;
                case 4:
                    menuPricipal.excluirPessoa();
                break;
            }
        }while(opcoes!=5);
    }
}
