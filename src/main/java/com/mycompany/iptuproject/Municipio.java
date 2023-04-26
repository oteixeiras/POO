/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iptuproject;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author oteixeiras
 */
public class Municipio {
    String nome;
    String cep;
    
    Imovel imovel;
    Map<Integer, Imovel> registroImovel;
    List<Imovel> listamoveis;
    
   public Municipio(){
       registroImovel = new HashMap<>();
   }
    
    public Municipio(String nome, String cep) {
        this();
        this.nome = nome;
        this.cep = cep;
    }
    
    public Imovel addImovel(String nome, Integer mesesAtraso){
        int  numeroImovel = registroImovel.size() + 1;         
        imovel = new Imovel(nome,numeroImovel, mesesAtraso);
        
        this.registroImovel.put(numeroImovel, imovel); 
        return imovel;
        
//        System.out.println("Imovel adicionado com SUCESSO" );
//        imovel.printDadosImovel();      
    }
    
//    public Imovel buscarImovel(int numeroImovel) {
//        imovel = registroImovel.get(numeroImovel);
//        
//        if (imovel != null) && (imovel.ativo== true){
//            imovel.printDadosImovel();
//            
//        }else if (imovel !=null) && (imovel.ativo== false){
//            InOut.MsgDeErro("Error", "Imovel com o id: " + numeroImovel + " esta desativado" );
//            
//        }else{
//            InOut.MsgDeErro("Error", "Imovel com o id: " + numeroImovel + " não encontrado" );
//        }       
//        return imovel;
//   }
    
   public void removeImovel(int numeroImovel) {
       if (registroImovel.containsKey(numeroImovel)) {
            registroImovel.remove(numeroImovel);
        } else {
           InOut.MsgDeErro("Error", "Município não encontrado");
        }
   }
   
   public Municipio buscarMunicipio(String cep){
       Municipio municipio;
       
       if (this.cep.equals(cep)){
            municipio = this;
       }else{
            municipio = null;
       }
       return municipio;
   }
   
   public Municipio buscarDadosMunicipio(String cep){
       if (this.cep == cep){
           System.out.println( 
                   "\nNome do municipio: " + this.nome +
                   "\nCEP: " + this.cep + " - ES" + 
                   "\nImóveis: " + buscarImoveis()
           );
       }else{
            InOut.MsgDeErro("Error", "Município não encontrado");
       }
        return null;
   }
   
   private List<Imovel> buscarImoveis(){
        listamoveis = new ArrayList<>();
       
       for (Imovel imovel : registroImovel.values()) {
           listamoveis.add(imovel);
       }
       return listamoveis;
   }
}
