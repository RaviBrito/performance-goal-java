package produto.model;

import produto.repository.ProdutoRepository;

public class SmartPhones extends Produto implements ProdutoRepository {
    public SmartPhones(int codProduto, String nomeProduto, String descriçao, float valor, int estoque, int anoLançamento, int marca, boolean temCamera) {
        super(codProduto, nomeProduto, descriçao, valor, estoque);
        this.anoLançamento = anoLançamento;
        this.marca = marca;
        this.temCamera = temCamera;
    }

    int anoLançamento;
    int marca;
    boolean temCamera;

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public boolean isTemCamera() {
        return temCamera;
    }

    public void setTemCamera(boolean temCamera) {
        this.temCamera = temCamera;
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
}
