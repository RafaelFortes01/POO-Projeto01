package pooprojeto1;

import javax.swing.JOptionPane;


public class TesteAluno {
    
    
    
    public static void main(String[] args){
        
        int alternativa;
        
        Ulife novoUlife = new Ulife();
        
        novoUlife.exibirMensagem();
        novoUlife.tipo = "Professor";  
     
        Aluno novoAluno = new Aluno();
        
        novoAluno.ra = JOptionPane.showInputDialog(null, "Digite seu RA:");
        novoAluno.nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        novoAluno.curso = JOptionPane.showInputDialog(null, "Digite seu curso:");
        novoAluno.email = JOptionPane.showInputDialog(null, "Digite seu email:");
        
        
        alternativa = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Pagar mensalidade. \n 2- Acessar aula ao vivo. \n 3- Exibir seus dados."));
        
        switch(alternativa){
            case 1:
                novoAluno.pagar();
                break;
            case 2:
                novoAluno.acessarAula();
                break;
            case 3:
                novoAluno.exibirDados();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite uma alternativa válida.");
        }
        
        
        
        
        
    }
    
}
