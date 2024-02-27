package produto.model;

import produto.repository.ProdutoRepository;

public class SmartPhones extends Produto implements ProdutoRepository {
    public SmartPhones(int codProduto, String nomeProduto, String descriçao, float valor, int estoque, int anoLançamento, String marca) {
        super(codProduto, nomeProduto, descriçao, valor, estoque);
        this.anoLançamento = anoLançamento;
        this.marca = marca;

    }

    int anoLançamento;
    String marca;

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
