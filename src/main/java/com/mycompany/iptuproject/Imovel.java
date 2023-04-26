/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iptuproject;

import static com.mycompany.iptuproject.InOut.MsgSemIcone;

/**
 *
 * @author oteixeiras
 */
public class Imovel {
    Municipio municipio;
    String nome;
    boolean  ativo;
    int numero;
    int mesesAtraso;
    double imposto;
    double valorIptu;
    double valorFinal;
    
    public Imovel(){
    }
    
    public Imovel(String nome, int numero, Integer mesesAtraso){
        this.nome = nome;
        this.imposto = calculoImposto(mesesAtraso);
        this.mesesAtraso = mesesAtraso;     
        this.valorIptu = 600.00;
        this.numero = numero;
        this.ativo = true;
        this.valorFinal = valorDevedor(this.imposto, this.valorIptu);
    }
    
    private double valorDevedor(double imposto, double valorIptu){ 
        double valorImposto = (valorIptu*imposto)/100;
        double valorTotal = valorIptu + valorImposto;
        
        return valorTotal;
    }
    
    private double calculoImposto(Integer valor){
        double valorImposto;
        
        if (valor >= 0 && valor <= 5) {
            valorImposto = 1;
        } else if (valor >= 6 && valor <= 8) {
            valorImposto = 3.3;
        } else if (valor >= 9 && valor <= 10) {
            valorImposto = 3;
        } else if (valor >= 11 && valor <= 12) {
            valorImposto = 5.4;
        } else {
            valorImposto =  10;
        }
        
        return valorImposto;
    }
    
        void associacaoMunicipio(Municipio municipio){
        this.municipio = municipio;
    }
    
    public void alteraValorAnual(double valorAnual){
        this.valorIptu = valorAnual;
    }
    
    public void printDadosImovel(){
        InOut.MsgSemIcone(
 "Dados do Imóvel", 
               "\nNome: " + this.nome +
               "\nNúmero de identificação: " + this.numero +
               "Situação do cadastro: " + formatSituacaoCadastro(this.ativo) +
               "\n Município: " + this.municipio + " - ES" +
               "\nImposto aplicado: " + this.imposto + "%" +
               "\nMeses em atraso: " + this.mesesAtraso +
               "\nValor do IPTU: R$" + this.valorIptu +
               "\nValor total a ser pago: R$" + this.valorFinal
        );
    }
    
    private String formatSituacaoCadastro(boolean ativo){
        String situacao;
        
        if (ativo){
            situacao = "Cadastro ativado";
        }else{
            situacao = "Cadastro desativado";
        }
        
        return situacao;
    }
    
    public void dadosImovel(){
        System.out.println( 
              "\nNome: " + this.nome +
               "\nNúmero de identificação: " + this.numero +
               "\n Município: " + this.municipio + " - ES" +
               "\nImposto aplicado: " + this.imposto + "%" +
               "\nMeses em atraso: " + this.mesesAtraso +
               "\nValor do IPTU: R$" + this.valorIptu +
               "\nValor total a ser pago: R$" + this.valorFinal 
        );
    }
}
