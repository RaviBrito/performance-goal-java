package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
    //CRUD - CRIAR LER PROCESSAR DELETAR
    public void cadastrar(Produto novoProduto);
    public void listarTodos();
    public void procurarPorCod (int numero);
    public void atualizar(Produto novoProduto);
    public void deletar(int numero);

    //METODOS DO Produto
    public void reposiçãoProduto (int quantidade);
    public boolean vendaProduto (int quantidade);


    }
