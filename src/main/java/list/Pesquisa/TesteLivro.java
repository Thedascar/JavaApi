package main.java.list.Pesquisa;

public class TesteLivro {
    public static void main(String[] args) {
        CatalogoPesquisaLivro catalogoPesquisaLivro = new CatalogoPesquisaLivro();

        catalogoPesquisaLivro.adicionarNovoLivro("Livro 1","Autor 1",2019);
        catalogoPesquisaLivro.adicionarNovoLivro("Livro 1","Autor 1",2020);
        catalogoPesquisaLivro.adicionarNovoLivro("Livro 2","Autor 2",2021);
        catalogoPesquisaLivro.adicionarNovoLivro("Livro 3","Autor 3",2022);
        catalogoPesquisaLivro.adicionarNovoLivro("Livro 4","Autor 4",2023);
        catalogoPesquisaLivro.adicionarNovoLivro("Livro 5","Autor 5",1993);

        System.out.println(catalogoPesquisaLivro.pesquisaLivroPorTitulo("Livro 1"));
        System.out.println(catalogoPesquisaLivro.pesquisaPorAutor("Autor 3"));
        System.out.println(catalogoPesquisaLivro.pesquisaPorIntervaloDeAnos(1992,2021));

    }
}
