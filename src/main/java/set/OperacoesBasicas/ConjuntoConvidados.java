package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidadeSet(String nome,int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadePorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c :convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidades(){
        System.out.println(convidadoSet);
    }
}
