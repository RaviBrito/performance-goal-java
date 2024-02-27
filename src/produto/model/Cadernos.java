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
    public void listarTodas() {

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

    public void reposiçãoProduto(int quantidade) { //adcionando produto
        this.setEstoque(this.getEstoque() + quantidade);
    }

    public boolean vendaProduto(int quantidade) {   //subtraindo produto
        if (this.getEstoque() < quantidade) {
            return false;
        } else {
            this.setEstoque(this.getEstoque() - quantidade);
            return true;
        }
    }
}