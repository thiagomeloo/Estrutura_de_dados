package testes;

import dominio.Aluno;
import lista.Lista;
import lista.No;

public class Principal {

    
    public static void main(String[] args) {
        Aluno a1 = new Aluno("A1");
        Aluno a2 = new Aluno("A2");
        
        Lista lista = new Lista();
        lista.add(a1);
        lista.add(a2);
        
        lista.remover(a1);
        //lista.remover(a2);
        
        No n = lista.buscar(a2);
        if(n != null){
            System.out.println(n.getAluno().getNome());
            
        }else{
            System.out.println("n achou");
        }
        
        
        
    }

    
}
