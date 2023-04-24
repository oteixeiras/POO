/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iptuproject;

/**
 *
 * @author oteixeiras
 */
public class Imovel {
    String nome;
    double imposto;
    Integer mesesAtraso;
    double valorIptu;
    Municipio municipio;
    
    public Imovel(){
    }
    
    public Imovel(String nome, Integer mesesAtraso){
        this.nome = nome;
        this.imposto = calculoImposto(mesesAtraso);
        this.mesesAtraso = mesesAtraso;     
        this.valorIptu = 600.00;
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
    
    public void alteraValorAnual(double valorAnual){
        this.valorIptu = valorAnual;
    }
    
    void associacaoMunicipio(Municipio municipio){
        this.municipio = municipio;
    }
    
    public void print(){
        System.out.println("nome: " + this.nome +
               "\nimposto: " + this.imposto +
               "\nmesesAtraso: " + this.mesesAtraso +
                "\nvalorIptu: " + this.valorIptu);
        
    }
}
