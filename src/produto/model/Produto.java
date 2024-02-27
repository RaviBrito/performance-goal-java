package produto.model;

public class Produto {
    private int codProduto;
    private String nomeProduto;
    private String descriçao;
    private float valor;
    private int estoque;

    //constructor
    public Produto(int codProduto, String nomeProduto, String descriçao, float valor, int estoque) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.descriçao = descriçao;
        this.valor = valor;
        this.estoque = estoque;
    }

    //Getter e setter
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //METODOS
    public void exibirFicha(){
        System.out.println(" ");
        System.out.println("********************");
        System.out.println("* Codigo do Produto: " + this.codProduto );
        System.out.println("**********************");
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Descrição" + this.descriçao);
        System.out.println("Valor: " + this.valor);  //feature custo
        System.out.println("Quantidade em Estoque:" + this.estoque);

    }
    public void reposiçãoProduto (int quantidade){ //adcionando produto
        this.setEstoque(this.estoque + quantidade );
    }
    public boolean vendaProduto(int quantidade){   //subtraindo produto
        if (this.estoque < valor){
            return false;
        } else {
            this.setEstoque(this.estoque - quantidade);
            return true;
        }





    }






}

