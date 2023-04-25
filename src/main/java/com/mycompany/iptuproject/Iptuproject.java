/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iptuproject;

/**
 *
 * @author oteixeiras
 */

import static com.mycompany.iptuproject.InOut.leInt;
import static com.mycompany.iptuproject.InOut.leString;

public class Iptuproject {
    public static void main(String args[]){
        Municipio municipio = new Municipio("Vila velha", "29102345");
        Imovel imovel;
        
        String nomeImovel;
        String cep;
        
        int mesesAtraso;
        int numeroImovel; 
        int opcaoSelecionada;     
        
        do{
            opcaoSelecionada = menu();
            
            switch(opcaoSelecionada) {
                case 1:
                    String cepMunicipio = leString("Digite o cep do municipio que queira cadastrar o imóvel");
                    municipio.buscarMunicipio(cepMunicipio);
                    
                    if (municipio != null){
                        nomeImovel = leString("Digite o nome do imóvel: ");
                        mesesAtraso = leInt("Digite a quantidade dos meses atrasados, caso houver: ");
                    
                        imovel = municipio.addImovel(nomeImovel, mesesAtraso);  
                        imovel.associacaoMunicipio(municipio);
                        imovel.printDadosImovel();     
                        
                    }else{
                        InOut.MsgDeErro("Município não encontrado", "Cadastre um município primeiro (opção 4)");
                    }
                    
                    break;
                case 2:
//                    numeroImovel = leInt("Digite o número do imóvel que deseja buscar os dados: ");
//                    municipio.buscarImovel(numeroImovel);
//                    break;
                
                case 3:
                     numeroImovel= leInt("Digite o número do imóvel que deseja excluir: ");
                     municipio.removeImovel(numeroImovel);
                     break;
                
                case 4:
                    String nomeMunicipio = leString("Digite o nome do novo municipio: ");
                    cep = leString("Digite o cep do municipio: ");
                    
                    municipio = new Municipio(nomeMunicipio, cep );
                     
//                    municipio.addImovel("Puerto", 0);
//                    municipio.addImovel("Carreno", 1);
//                    municipio.addImovel("Puerto", 13);
//                    municipio.addImovel("fernando", 10);                   
//                    municipio.buscarMunicipio("23");          
                    break;
                    
                case 5:
                    cep = leString("Digite o cep do município para buscar os dados: ");
                    municipio.buscarMunicipio(cep);
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    InOut.MsgDeAviso("Sair",  "Programa encerrado" );
                    break;
                    
                default:
                    InOut.MsgDeErro("Opção inválida.", "Tente novamente com uma opção válida.\n");
                    break;
            }
        }while (opcaoSelecionada != 7);
    }

    public static  int menu(){        
        int opcao = leInt(
                "1 - Adicionar um novo imóvel\n"
                + "2 - Buscar informações sobre um imóvel\n"
                + "3 - Excluir imóvel\n"
                + "4 - Adicionar um novo Município\n"
                + "5 - Buscar dados de município\n"
                + "6 - Atualizar taxa de IPTU\n"
                + "7 - Sair"
        );
        return opcao;       
    }
}



