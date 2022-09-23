package pooprojeto1;

import javax.swing.JOptionPane;

public class Aluno {
    
    String ra, nome, curso, email;
    
    public void pagar(){
        JOptionPane.showMessageDialog(null,"Pagamento da mensalidade do aluno: " + nome);
    }
    
    public void acessarAula(){
        JOptionPane.showMessageDialog(null,"Acessando a aula do curso " + curso);
        
    }
    
    public void exibirDados(){
        JOptionPane.showMessageDialog(null,"RA: " + ra + "\n Nome:" + nome + "\n Curso: " + curso + "\n E-mail: " + email);
    }
    
    
    
}
