package lista;

import dominio.Aluno;

public class ListaCircular {
    
    No inicio;
    No fim;
    
    public ListaCircular(){
        inicio = null;
        fim = null;
    }
    
    public void add(Aluno aluno){
        No no = new No();
        no.setAluno(aluno);
        if(inicio == null){
            inicio = no;
            fim = no;
            no.setProximo(inicio);
        }else{
            no.setProximo(inicio);
            inicio = no;
            fim.setProximo(inicio);
        }
    }
    
    public void remover(Aluno aluno){
        No noAtual = inicio;
        if(inicio == null){
            //retorna que ta vazio
        }else {
            if(aluno.equals(inicio.getAluno()) && fim.getProximo() == inicio){
                inicio = null;
                fim = null;
            }
            
            //INCOMPLETOOOOOOOO
        }

    }
    
    
    
}
