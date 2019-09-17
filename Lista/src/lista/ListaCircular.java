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
            fim.setProximo(inicio);
        }else{
            no.setProximo(inicio);
            inicio = no;
            fim.setProximo(inicio);
        }
    }
    
    public void remover(Aluno aluno) {
        No noAtual = inicio;
        No noAnterior = inicio;
        if (inicio == null) {
            //retorna que ta vazio
            System.out.println("vazio");
        } else {
            
            while (noAtual != null) {
                if(aluno.equals(inicio.getAluno()) && fim.getProximo() == inicio){
                    inicio = null;
                    fim = null;
                }else {
                    if (aluno.equals(inicio.getAluno())) {
                        System.out.println("inicio");
                    }
                    
                }
            }

        }

    }
    
    
    
}
