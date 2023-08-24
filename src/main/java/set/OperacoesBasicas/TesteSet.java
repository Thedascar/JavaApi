package main.java.set.OperacoesBasicas;

public class TesteSet {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


        conjuntoConvidados.adicionarConvidadeSet("Lucas",159753);
        conjuntoConvidados.adicionarConvidadeSet("ALine",159754);
        conjuntoConvidados.adicionarConvidadeSet("Liz",159754);
        conjuntoConvidados.adicionarConvidadeSet("Dogs",159755);
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadePorCodigoConvite(159753);

        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidades();
    }
}
