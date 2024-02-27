package produto;

import produto.controller.ProductController;
import produto.model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        int codProduto, estoque, numeroImput;
        ;
        String nomeProduto, descriçao;
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
                case 1://Criar


                case 2://Listar
                    System.out.println("Lista de Todas as Contas \n\n");

                case 3://Buscar

                    System.out.println("Digite o coodigo do Produto: ");


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