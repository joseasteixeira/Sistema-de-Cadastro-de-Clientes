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
public class FuncoesMenuPrincipal {
    private Cadastro[] cadastro=new Cadastro[100];
    private int cont=0, aux=-1;
    
    public void cadastrarPessoa(){
        if(cont<cadastro.length){
            cadastro[cont]=new Cadastro(Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo (números):")),
                                JOptionPane.showInputDialog("Informe o nome:"),
                                JOptionPane.showInputDialog("Informe o telefone:"));
            cont++;
        }else{
            JOptionPane.showMessageDialog(null,"Infelismente não podemos "
                        + "cadastrar novas pessoas por falta de espaço!");
        }
    }
    
    public void listarPessoa(){
        if(this.verificarCodigo()){
        JOptionPane.showMessageDialog(null,"Dados da pessoa procurada:"
                                + "\nCodigo: "+cadastro[aux].getCodigo()
                                + "\nNome: "+cadastro[aux].getNome()
                                + "\nTelefone: "+cadastro[aux].getTelefone());
        }
    }
    
    public void alterarPessoa(){
        if(this.verificarCodigo()){
            int opcoesDeEdicao=0;
            do{
                opcoesDeEdicao=Integer.parseInt(JOptionPane.showInputDialog("Opções:"
                                        + "\n1. Editar Codigo."
                                        + "\n2. Editar Nome."
                                        + "\n3. Editar Telefone"
                                        + "\n4. Retornar ao Menu Principal."));
                switch(opcoesDeEdicao){
                    case 1:
                        cadastro[aux].setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o novo codigo:")));
                        JOptionPane.showMessageDialog(null,"Alteração realizada com scesso!");
                    break;
                    case 2:
                        cadastro[aux].setNome(JOptionPane.showInputDialog("Informe o novo nome:"));
                        JOptionPane.showMessageDialog(null,"Alteração realizada com scesso!");
                    break;
                    case 3:
                        cadastro[aux].setNome(JOptionPane.showInputDialog("Informe o novo telefone:"));
                        JOptionPane.showMessageDialog(null,"Alteração realizada com scesso!");
                    break;
                }
            }while(opcoesDeEdicao!=4);
        }
    }
    
    public void excluirPessoa(){
        if(this.verificarCodigo()){
            if(aux<(cont-1)){
                Cadastro cadastroAux=new Cadastro();
                for(int i=aux;i<(cont-1);i++){
                    cadastroAux=new Cadastro(cadastro[i+1].getCodigo(),
                                             cadastro[i+1].getNome(),
                                             cadastro[i+1].getTelefone());
                    cadastro[i]=cadastroAux;
                }
            
            }
            cont--;
            cadastro[cadastro.length-1]=null;
            JOptionPane.showMessageDialog(null,"Cadastro excluido com scesso!");
        }
    }
    
    public boolean verificarCodigo(){
        boolean bool=false;
        if(cont==0){
            JOptionPane.showMessageDialog(null,"Ainda nõ existe pessoas cadastradas!");
        }else{
            int codigo;
            aux=-1;
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da pessoa:"));
            for(int i=0;i<cont;i++){
                if(cadastro[i].getCodigo()==codigo){
                    aux=i;
                    bool=true;
                }
            }
            if(aux==-1){
                JOptionPane.showMessageDialog(null,"Cadastro não encontrada!");
            }
        }
        return bool;
    }
}
