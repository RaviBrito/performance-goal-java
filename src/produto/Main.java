package produto;

import produto.controller.ProductController;
import produto.model.Cadernos;
import produto.model.Produto;
import produto.model.SmartPhones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ProductController produto = new ProductController();


        int codProduto, estoque, numeroImput, folhas,tamanho, anoLançamento;

        String nomeProduto, descricao,marca;
        float valor;

        boolean continuar = true;
        while (continuar) {
            System.out.println("********************************************");
            System.out.println("                   EletroPaper              ");
            System.out.println("********************************************");
            System.out.println("*                                          *");
            System.out.println("*     1. Criar Produto                     *");
            System.out.println("*     2. Listar todos Produtos             *");
            System.out.println("*     3. Buscar Produtos por Codigo        *");
            System.out.println("*     4. Atualizar Produto                 *");
            System.out.println("*     5. Apagar Produto                    *");
            System.out.println("*     6. Registrar Venda                   *");
            System.out.println("*     7. Reposição de Estoque               *");
            System.out.println("*     8. Sair                              *");
            System.out.println("********************************************");
            System.out.println("*                                          *");
            System.out.println("*     Escolha a Opção desejada             *");
            System.out.println("*                                          *");
            System.out.println("********************************************");


            int opcao = read.nextInt();

            switch (opcao) { //Escolha do Menu
                case 1:
                    System.out.println("Insira o nome do produto");
                    read.skip("\\R?");   //skip para ignorar "\r" quebra de linha e ler palavras compostas
                    nomeProduto = read.nextLine();
                    System.out.println("Insira a decrição do produto");
                    descricao = read.nextLine();
                    System.out.println(" Insira o codigo do produto");
                    codProduto= read.nextInt();
                    System.out.println("Insira o valor do produto");
                    valor= read.nextFloat();
                    System.out.println("Insira o estoque do produto");
                    estoque= read.nextInt();
                    System.out.println("Insira o tipo do produto\n 1.Caderno \n2.Smartphone");
                    opcao= read.nextInt();
                    if (opcao == 1 ){
                        System.out.println("Insira a quantidade de folhas");
                        folhas=read.nextInt();
                        System.out.println("Insira tamanho: \n 1.Pequeno 2.Medio 3.Grande ");
                        tamanho= read.nextInt();
                        Cadernos carderno =new Cadernos(codProduto,nomeProduto,descricao,valor, estoque,folhas,tamanho);

                    } else if (opcao == 2) {
                        System.out.println("Insira a ano de lançamento:");
                        anoLançamento=read.nextInt();
                        System.out.println("Insira o nome da marca: ");
                        read.skip("\\R?");
                        marca= read.nextLine();

                        SmartPhones smartPhones = new SmartPhones(codProduto,nomeProduto,descricao,valor, estoque,anoLançamento,marca);


                    }
                break;

                case 2://Listar
                    System.out.println("Lista de Todas as Contas \n\n");
                    produto.listarTodas();
                    break;


                case 3://Buscar

                    System.out.println("Digite o coodigo do Produto: ");
                    int numeroInput;
                    numeroInput = read.nextInt();
                    produto.buscarNaCollection(numeroInput);


                case 4://Atualizar
                    System.out.println("Digite o numero da conta a ser atualizada:");


                case 5://Apagar

                case 6://Registrar

                case 7://Repor

                case 8://Sair


            }


        }

    }
}