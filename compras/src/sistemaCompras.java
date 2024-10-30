/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUIZATAUCHERTSCHOLL
 */
public class sistemaCompras {

    public static void main(String[] args) {

        ArrayList<mercado> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean Produto = false;

        while (!Produto) {
            System.out.println("1. Adicionar  /n 2.Remover /n 3. Ver carrinho /n 4. Pagar");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("1. Produtos  de limpeza  /n 2.pet /n 3. cosmeticos /n 4. comidas /n 5. bazar");
                    int escolha2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (escolha2) {
                        case 1:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhaLimpeza = scanner.nextLine();
                            int precoC = 100;
                            mercado produto = new produtosLimpeza(escolhaLimpeza, precoC);
                            produtos.add(produto);
                            break;
                        case 2:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhapet = scanner.nextLine();
                            int precob = 100;
                            mercado produto2 = new pet(escolhapet, precob);
                            produtos.add(produto2);
                            break;
                        case 3:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhaCosmeticos = scanner.nextLine();
                            int precoe = 100;
                            mercado produto3 = new cosmeticos(escolhaCosmeticos, precoe);
                            produtos.add(produto3);
                            break;
                        case 4:
                            System.out.println("Qual comida vc quer adicionar? ");
                            String escolhaComida = scanner.nextLine();
                            int precod = 100;
                            mercado produto4 = new comidas(escolhaComida, precod);
                            produtos.add(produto4);
                        case 5:
                            System.out.println("Qual produto vc quer adicionar? ");
                            String escolhabazar = scanner.nextLine();
                            int precol = 100;
                            mercado produto5 = new bazar(escolhabazar, precol);
                            produtos.add(produto5);
                    }
                    break;

                case 2:
                    System.out.println("Qual produto vc quer excluir? ");
                    int excuirProduto = scanner.nextInt();
                    scanner.nextLine();

                    break;

                case 3:
                    System.out.println("Seu carrinho: ");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).nome + "Preço: " + produtos.get(i).preco);
                    }
                    break;

                case 4:
                    System.out.println("O carrinho foi pago com sucesso!");
                    produtos.clear();
                    break;
            }
        }
    }
}
