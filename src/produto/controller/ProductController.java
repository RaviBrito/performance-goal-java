 package produto.controller;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

import java.util.ArrayList;

public class ProductController implements ProdutoRepository {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    int numero = 0;
    int numeroInput;
    int codProduto;



    @Override
    public void cadastrar(Produto novoProduto) {
        listaProdutos.add(novoProduto);
        System.out.println("Produto " + novoProduto.getCodProduto() + "incluido com sucesso");

    }

    @Override
    public void listarTodos() {
        for(var produto : listaProdutos){
            produto.exibirFicha();
        }

    }

    @Override
    public void procurarPorCod(int numero) {
        var produto =buscarNaCollection(numero);
        if (produto != null){
            produto.exibirFicha();
        }else {
            System.out.println("\n O produto com codigo "+ numero +"não foi cadastrado");
        }

    }

    @Override
    public void atualizar(Produto produto) {
        var buscaProduto = buscarNaCollection(produto.getCodProduto());

        if (buscaProduto != null){
            listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
            System.out.println("Produto codigo:" + produto.getCodProduto()+ " foi atualizado com sucesso");
        } else {
            System.out.println("Produto codigo:" + produto.getCodProduto()+ " não foi encontrado");
        }

    }

    @Override
    public void deletar(int numero) {
        var produto = buscarNaCollection(numero);

        if (produto!= null){
            if (listaProdutos.remove(produto) == true){
                System.out.println("Produto codigo: "+numero+" removido com sucesso.");
            }else {
                System.out.println("Produto codigo: "+numero+" não foi encontrado.");
            }
        }

    }

    @Override
    public void reposiçãoProduto(int numero, int quantidade) {
        var produto =buscarNaCollection(numero);

        if (produto != null){
            produto.reposiçãoProduto(quantidade);
            System.out.println("Voce incluiu" + quantidade + "do produto" + numero);
          }else {
            System.out.println("Produto codigo:" + numero +" não foi localizado no sistema");
        }

    }

    @Override
    public boolean vendaProduto(int numero,int quantidade) {
        var produto=buscarNaCollection(numero);

        if (produto != null){
            if (produto.vendaProduto(quantidade) == true){
                System.out.println("\n Venda do produto: " + numero + "foi efetuada.");
            }
        }else {
            System.out.println("Produto" + "não encontrado.");
        }

        return false;
    }
    public int gerarCod(){
        return ++ numero;
    }
    public Produto buscarNaCollection(int numero) {
        for (var conta : listaProdutos) {
            if (conta.getCodProduto() == numero) {
                return conta;
            }
        }
        return null;

    }


    //   public void cadastrar (Produto produto) {
     //       listaProdutos.add(produto);
     //       System.out.println("Produto: " + pro() + " ,foi inserido com sucesso");

        }






