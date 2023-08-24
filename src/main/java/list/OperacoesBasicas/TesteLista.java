package main.java.list.OperacoesBasicas;

public class TesteLista {
    public static void main(String[] args) {

        ListaTarefa listaTarefa= new ListaTarefa();

        listaTarefa.adicionarNaLista("Lucas");
        listaTarefa.adicionarNaLista("Aline");
        listaTarefa.adicionarNaLista("Liz");
        listaTarefa.adicionarNaLista("João");
        listaTarefa.adicionarNaLista("Bacon");
        listaTarefa.adicionarNaLista("Bob");



        listaTarefa.obterdescricaoTarefas();
        System.out.println("A lista cóntem: " + listaTarefa.obterTamanhoList());
        listaTarefa.removerNaLista("João");
        listaTarefa.obterdescricaoTarefas();
        System.out.println("A lista cóntem: " + listaTarefa.obterTamanhoList());
    }
}
