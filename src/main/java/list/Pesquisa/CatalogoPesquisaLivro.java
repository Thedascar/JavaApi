package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoPesquisaLivro {

    private List<Livro> livrosList;

    public CatalogoPesquisaLivro() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarNovoLivro(String titulo,String autor,int anoPublicacao){
        livrosList.add(new Livro(titulo,autor,anoPublicacao));
    }


    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial,int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }


    public Livro pesquisaLivroPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
