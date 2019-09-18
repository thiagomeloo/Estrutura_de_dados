package lista;

import dominio.Aluno;

public class ListaCircular {

    No inicio;
    No fim;

    public ListaCircular() {
        inicio = null;
        fim = null;
    }

    public void add(Aluno aluno) {
        No no = new No();
        no.setAluno(aluno);
        if (inicio == null) {
            inicio = no;
            fim = no;
            fim.setProximo(inicio);
        } else {
            no.setProximo(inicio);
            inicio = no;
            fim.setProximo(inicio);
        }
    }

    public String remover(Aluno aluno) {
        
        String retorno = "";
        
        if (inicio == null) {
            
            return ("vazio");
            
        }
        if (aluno.equals(inicio.getAluno())) {

            if (aluno.equals(fim.getAluno())) {

                inicio = null;
                fim = null;

            } else {

                inicio = inicio.getProximo();
                fim.setProximo(inicio);

            }
            
            No noAtual = inicio.getProximo();
            No noAnterior = inicio;
            
            while(noAtual != inicio){
                if(aluno.equals(noAtual.getAluno())){
                    
                    if(noAtual == fim){
                      fim = noAnterior;  
                    }
                    
                    noAnterior = noAtual.getProximo();
                    
                    retorno = "Removido";
                    
                }else{
                    
                    noAnterior = noAtual;
                    noAtual = noAtual.getProximo();

                }
            }
        }
        
        return retorno;
    }
}
