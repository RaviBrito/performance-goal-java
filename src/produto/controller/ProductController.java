/* package produto.controller;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

import java.util.ArrayList;

public class ProductController implements ProdutoRepository {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    int numero=0;
    int numeroInput;
    int codProduto;

    public Produto buscarNaCollection(int numero) {
        for (var conta : listaProdutos ){
            if (conta.getCodProduto() == numero) {
                return conta;
            }
        } return null;

    public void listarTodas() {
        for(var produto : listaProdutos){
            produto.exibirFicha();
        }

    }
    public void cadastrar(Produto produto) {
         listaProdutos.add(produto);
            System.out.println("Produto: " + pro() + " ,foi inserido com sucesso");

        }




}

