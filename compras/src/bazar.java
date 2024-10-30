/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUIZATAUCHERTSCHOLL
 */
public class bazar extends mercado{
     String nome;
     double preco;

    public bazar(String nome, double preco){
        super(nome, preco);
    }

    public void getProduto() {
        System.out.println("nome: "+ nome +"preco: "+ preco) ;
    }
}