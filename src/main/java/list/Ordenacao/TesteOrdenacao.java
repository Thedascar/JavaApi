package main.java.list.Ordenacao;

public class TesteOrdenacao {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Lucas",28,1.65);
        ordenacaoPessoa.adicionarPessoa("Aline",26,1.65);
        ordenacaoPessoa.adicionarPessoa("Bob",9,0.85);
        ordenacaoPessoa.adicionarPessoa("Bacon",5,0.50);
        ordenacaoPessoa.adicionarPessoa("Liz",1,0.35);


        System.out.println(ordenacaoPessoa.oerdenarPorAltura());
        System.out.println(ordenacaoPessoa.oerdenarPorIdade());


    }
}
