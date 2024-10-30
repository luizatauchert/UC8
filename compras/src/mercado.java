/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LUIZATAUCHERTSCHOLL
 */
abstract class mercado {
     String nome;
     double preco;

    public mercado(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void getProduto() {
        System.out.println("nome: "+nome +"preco: "+preco) ;
    }
}
   
