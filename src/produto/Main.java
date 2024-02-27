package produto;

import produto.controller.ProductController;
import produto.model.Cadernos;
import produto.model.SmartPhones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void keyPress(){
        try {
            System.out.println("\n\n Pressione Enter para continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("Voce precionou uma tecla diferente");

        }
    }

    public static void main(String[] args) {



        Scanner read = new Scanner(System.in);
        ProductController produto = new ProductController();


        int codProduto, estoque, numeroInput, folhas,tamanho, anoLançamento, qtdsaida, opcao, tipo=0;
        String nomeProduto, descricao,marca;
        float valor;

        System.out.println("\n \n Criando Produtos");
        Cadernos c1 =new Cadernos(produto.gerarCod(), "Caderno Sereia", "Caderno mais lindo",
                12.99f, 50,80,3);
        Cadernos c2 =new Cadernos(produto.gerarCod(), "Caderno Miranha", "Caderno do omiAranha",
                15.99f, 50,80,3);
        SmartPhones s1 =new SmartPhones(produto.gerarCod(), "Xiaomi 18U", "Smartponhe ultra plu melhor que iphone",
                2599.99f, 50,2024,"Xiaomi");
        SmartPhones s2 =new SmartPhones(produto.gerarCod(), "Sansung 87Lite", "Trava só depois de 6 meses",
                2499.99f, 50,2023,"Sansung");

        try {
            opcao = read.nextInt();
        }catch (InputMismatchException e){
            System.out.println("\nDigite valos inteiros");
            read.nextLine();
            opcao=0;
        }

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
            System.out.println("*     6. Saida estoque                     *");
            System.out.println("*     7. Incluir no Estoque               *");
            System.out.println("*     8. Sair                              *");
            System.out.println("********************************************");
            System.out.println("*                                          *");
            System.out.println("*     Escolha a Opção desejada             *");
            System.out.println("*                                          *");
            System.out.println("********************************************");


            opcao = read.nextInt();

            switch (opcao) { //Escolha do Menu
                case 1:
                    System.out.println("Insira o nome do produto");
                    read.skip("\\R?");   //skip para ignorar "\r" quebra de linha e ler palavras compostas
                    nomeProduto = read.nextLine();
                    System.out.println("Insira a decrição do produto");
                    descricao = read.nextLine();
                    System.out.println(" Insira o codigo do produto");
                    codProduto = read.nextInt();
                    System.out.println("Insira o valor do produto");
                    valor = read.nextFloat();
                    System.out.println("Insira o estoque do produto");
                    estoque = read.nextInt();

                    //TIPO DO PRODUTO
                    do {
                        System.out.println("Insira o tipo do produto\n 1.Caderno \n2.Smartphone");
                        opcao = read.nextInt();
                    } while (tipo < 1 && tipo > 2);
                    switch (tipo) {
                        case 1:
                            System.out.println("Insira a quantidade de folhas");
                            folhas = read.nextInt();
                            System.out.println("Insira tamanho: \n 1.Pequeno 2.Medio 3.Grande ");
                            tamanho = read.nextInt();
                            produto.cadastrar(new Cadernos(produto.gerarCod(), nomeProduto, descricao, valor, estoque, folhas, tamanho));
                        case 2:
                            System.out.println("Insira a ano de lançamento:");
                            anoLançamento = read.nextInt();
                            System.out.println("Insira o nome da marca: ");
                            read.skip("\\R?");
                            marca = read.nextLine();
                            produto.cadastrar(new SmartPhones(produto.gerarCod(), nomeProduto, descricao, valor, estoque, anoLançamento, marca));

                    }

                    keyPress();
                    break;


                case 2://Listar
                    System.out.println("Produtos cadastrados \n\n");
                    produto.listarTodos();
                    keyPress();
                    break;


                case 3://Buscar

                    System.out.println("Digite o código do Produto: ");
                    numeroInput = read.nextInt();
                    produto.procurarPorCod(numeroInput);
                    keyPress();
                    break;


                case 4://Atualizar
                    System.out.println("Digite o numero do produto a ser atualizado:");
                    numeroInput = read.nextInt();
                keyPress();
                break;


                case 5://Apagar
                    System.out.println("Voce deletou" + produto);
                    keyPress();
                    break;

                case 6://Saida estoque
                   // estoque -= qtdsaida;
                    System.out.println("Quantidade no estoque:");
                    keyPress();
                    break;

                case 7://Incluir estoque
                    System.out.println("Insira o codigo do produto que deja incluir");
                    numeroInput = read.nextInt();
                    produto.buscarNaCollection(numeroInput);

                    System.out.println("Insira a quantidade");
                    estoque = read.nextInt();

                    keyPress();
                    break;

                default://Sair
                    System.out.println("Opção Inválida");
                    keyPress();
                    break;


            }
            if (opcao == 9) {

                System.out.println("Volte Sempre!");
                read.close();
                System.exit(0);
            }


        }

        //Produto produto1 = new Produto(1,"Cadernos 1/4", "Com o caderno 1/4 Princesas " +
          //      "você vai fazer suas anotações com muito mais alegria.",12,100);

    }
}