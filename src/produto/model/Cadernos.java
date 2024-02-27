package produto.model;

import produto.repository.ProdutoRepository;

public class Cadernos extends Produto implements ProdutoRepository {
    private int folhas;
    private int tamanho; //(P, M, G)

    public Cadernos(int codProduto, String nomeProduto, String descriçao, float valor, int estoque, int folhas, int tamanho) {
        super(codProduto, nomeProduto, descriçao, valor, estoque);
        this.folhas = folhas;
        this.tamanho = tamanho;
    }

    //get e set
    public int getFolhas() {
        return folhas;
    }

    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void cadastrar(Produto novoProduto) {

    }

    @Override
    public void listarTodos() {

    }

    @Override
    public void procurarPorCod(int numero) {

    }

    @Override
    public void atualizar(Produto novoProduto) {

    }

    @Override
    public void deletar(int numero) {

    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
    }

    @Override
    public void reposiçãoProduto(int quantidade) {
        super.reposiçãoProduto(quantidade);
    }

    @Override
    public boolean vendaProduto(int quantidade) {
        return super.vendaProduto(quantidade);
    }

}