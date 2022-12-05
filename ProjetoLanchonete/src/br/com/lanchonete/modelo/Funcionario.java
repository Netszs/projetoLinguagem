/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lanchonete.modelo;

/**
 *
 * @author sebas
 */
public class Funcionario extends Pessoa{
     
    private String numeroCartaoPonto;

    
    
    public Funcionario(int id, String nome, String numeroCartaoPonto)
    {
        super(id, nome);
        this.numeroCartaoPonto = numeroCartaoPonto;
    }
    
    public String getNumeroCartaoPonto() {
        return numeroCartaoPonto;
    }

    public void setNumeroCartaoPonto(String numeroCartaoPonto) {
        this.numeroCartaoPonto = numeroCartaoPonto;
    }
}
