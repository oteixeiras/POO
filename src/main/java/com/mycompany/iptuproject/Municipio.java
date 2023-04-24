/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iptuproject;

import java.util.UUID;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author oteixeiras
 */
public class Municipio {
    String nome;
    Map<UUID, Imovel> registroImovel;
    
   public Municipio(){
       registroImovel = new HashMap<>();
   }
    
    public Municipio(String nome) {
        this();
        this.nome = nome;
    }
    
    public void addImovel(Imovel objImovel){
        UUID codImovel = UUID.randomUUID();    
        registroImovel.put(codImovel, objImovel);   
        
        System.out.println("Imovel adicionado com SUCESSO" );
        objImovel.print();      
    }
    
    public Imovel buscarImovel(UUID codImovel) {
        Imovel  imovel = registroImovel.get(codImovel);
        
        if (imovel !=null){
            System.out.println("Imovel com o código" + codImovel.toString() + " encontrado: " );
            imovel.print();
            
        }else{
            System.out.println("Imovel com o id: " + codImovel.toString() + "não encontrado: " );
        }       
        return imovel;
   }
    
   public void removeImovel(UUID codImovel) {
       if (registroImovel.containsKey(codImovel)) {
            registroImovel.remove(codImovel);
        } else {
           InOut.MsgDeErro("not found", "Imovel Não encontrado");
        }
   }
//   public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Imóveis cadastrados no município:\n");
//        for (Imovel imovel : registroImovel.values()) {
//            sb.append(imovel.toString()).append("\n");
//        }
//        return sb.toString();
//    }
}