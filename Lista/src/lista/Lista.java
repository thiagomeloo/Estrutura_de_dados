package lista;

import dominio.Aluno;

public class Lista {

    private No primeiro;
    
    public void add(Aluno aluno){
        
        No no = new No();
        no.setAluno(aluno);
        no.proximo = primeiro;
        primeiro = no;
        
    }

    
    public No buscar(Aluno aluno){
        No noTemp = primeiro;
        while(noTemp != null){
            if(aluno.equals(noTemp.getAluno())){
                return noTemp;
            }
            noTemp = noTemp.getProximo();
        }
        return null;
    }
    
    
    public No remover(Aluno aluno) {
        if (primeiro != null) {
            if (aluno.equals(primeiro.getAluno())) {
                primeiro = primeiro.getProximo();
                return primeiro;
            }
            
            
            No noTemp = primeiro.getProximo();
            No noAnt = primeiro;
            
            while (noTemp != null) {
                if (aluno.equals(noTemp.getAluno())) {
                    noAnt.setProximo(noTemp.getProximo());
                    return noTemp;
                }
                noAnt = noTemp;
                noTemp = noTemp.getProximo();
            }
            
        }

        return null;

    }
    
    
    
}
