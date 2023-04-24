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
import java.util.UUID;
import java.util.Scanner;

public class Iptuproject {
    public static void main(String args[]){
        Municipio municipio = new Municipio("Vila velha");
        Imovel imovel;
        
        int opcao = menu();
        
        if (opcao == 1){          
            String nome= leString("Digite o nome do imóvel: ");
            int mesesAtraso = leInt("Digite a quantidade dos meses atrasados, caso houver: ");
 
            imovel = new Imovel(nome, mesesAtraso); 
//            municipio.addImovel(imovel);

            municipio.addImovel(imovel);
            
        }else{
             InOut.MsgDeErro("not found", "Tente novamente com uma opção válida");
        }
                
    }
  
    public static  int menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Adicionar um novo imóvel\n2 - Buscar informações sobre um imóvel\n3 - Excluir imóvel\n4 - Atualizar valor do IPTU\n");
        System.out.print("Digite a opção desejada: ");
        int opcao = input.nextInt();

        return opcao;
        
    }
}


//Rascunho

//import java.util.Scanner;
//import java.util.UUID;

//public class Iptuproject {
//    public static void main(String args[]){
//        Municipio municipio = new Municipio("Vila velha");
//        int opcao;
//        
//        do {
//            opcao = menu();
//            
//            switch(opcao) {
//                case 1:
//                    String nome = InOut.leString("Digite o nome do imóvel: ");
//                    int mesesAtraso = InOut.leInt("Digite a quantidade de meses atrasados, caso houver: ");
//                    Imovel imovel = new Imovel(nome, mesesAtraso);
//                    municipio.addImovel(imovel);
//                    System.out.println("Imóvel cadastrado com sucesso!\n");
//                    break;
//                case 2:
//                    UUID codigo = InOut.leUUID("Digite o código do imóvel: ");
//                    Imovel imovelBusca = municipio.buscarImovel(codigo);
//                    if(imovelBusca != null) {
//                        System.out.println(imovelBusca.toString());
//                    } else {
//                        System.out.println("Imóvel não encontrado.\n");
//                    }
//                    break;
//                case 3:
//                    UUID codigoExclusao = InOut.leUUID("Digite o código do imóvel a ser excluído: ");
//                    if(municipio.excluirImovel(codigoExclusao)) {
//                        System.out.println("Imóvel excluído com sucesso!\n");
//                    } else {
//                        System.out.println("Imóvel não encontrado.\n");
//                    }
//                    break;
//                case 4:
//                    UUID codigoAtualizacao = InOut.leUUID("Digite o código do imóvel a ter o valor do IPTU atualizado: ");
//                    Imovel imovelAtualizacao = municipio.buscarImovel(codigoAtualizacao);
//                    if(imovelAtualizacao != null) {
//                        double novoValor = InOut.leDouble("Digite o novo valor do IPTU: ");
//                        imovelAtualizacao.setValorIPTU(novoValor);
//                        System.out.println("Valor do IPTU atualizado com sucesso!\n");
//                    } else {
//                        System.out.println("Imóvel não encontrado.\n");
//                    }
//                    break;
//                case 5:
//                    System.out.println(municipio.registroImovel);
//                    break;
//                case 6:
//                    System.out.println("Programa finalizado.");
//                    break;
//                default:
//                    InOut.MsgDeErro("Opção inválida.", "Tente novamente com uma opção válida.\n");
//                    break;
//            }
//            
//        } while (opcao != 6);
//                
//    }
//  
//    public static int menu(){
//        Scanner input = new Scanner(System.in);
//        System.out.println("1 - Adicionar um novo imóvel\n2 - Buscar informações sobre um imóvel\n3 - Excluir imóvel\n4 - Atualizar valor do IPTU\n5 - Exibir todos os imóveis cadastrados\n6 - Sair\n");
//        System.out.print("Digite a opção desejada: ");
//        int opcao = input.nextInt();
//
//        return opcao;   
//    }
//}
