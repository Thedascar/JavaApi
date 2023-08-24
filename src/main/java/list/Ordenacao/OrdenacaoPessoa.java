package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {

        this.pessoasList = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> oerdenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> oerdenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura,new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}



