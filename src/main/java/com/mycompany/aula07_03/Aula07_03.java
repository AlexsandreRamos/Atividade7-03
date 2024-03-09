package com.mycompany.aula07_03;

import java.util.Scanner;


public class Aula07_03 {

    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("EXEMPLO 1\n");
        int num1;
       
        System.out.println("Digite um número:");
        num1 = teclado.nextInt();
        
        while (num1 != 0){
            System.out.println("escreva outro número ou 0 para finalizar.");
          num1 = teclado.nextInt();
            
        }
        
     ////////////////////////////////////////////////////////////////////////////
     
      Scanner teclado1 = new Scanner(System.in);
      
        System.out.println("ATIVIDADE 1 \n");
      
        System.out.println("Digite de 1 a 10:");
              int num9 = teclado1.nextInt();
      
      while (num9 != 10){
          System.out.println("Digite outro número ou 10 para finalizar.");
          num9 = teclado1.nextInt();
          
      }
          
     
      //////////////////////////////////////////////////////////////////////
      
      
      Scanner teclado2 = new Scanner(System.in);
     
        System.out.println("ATIVIDADE 2\n"); 
        System.out.println("Digite sua senha:(A senha é 1204)");
      int senha = teclado2.nextInt();
      
     
      
      
      while (senha != 1204){
          System.out.println("Senha incorreta, tente novamente:");
          
          senha = teclado2.nextInt();
      }
      
        System.out.println("Senha correta");
  
        
        
    /////////////////////////////////////////////////////////////////////////////////////////////  
              System.out.println("\nATIVIDADE 3\n\n");
   
        Scanner teclado3 = new Scanner(System.in);
        String enter;
        enter = " ";
        
        int num2;
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;
        
        System.out.println("Menu: "
                + "\n1 = Álcool"
                + "\n2 = Gasolina"
                + "\n3 = Disel"
                + "\n4 = Finalizar"
                + "\n\n Faça seu pedido um a um abaixo:");
        
        
        num2 = teclado3.nextInt();
            
        while (num2 != 4){
          
            
        
        
        
        if (num2 == 1){
           
            System.out.println("\n\nVocê adicionou um Álcool!");
            alcool += 1;
             System.out.println("\nAdicione mais itens ou finalize clicando o número 4");
        }
        else{
        
            if(num2 == 2){
               System.out.println("\n\nVocê adicionou uma Gasolina!");
                gasolina += 1;
                 System.out.println("\nAdicione mais itens ou finalize clicando o número 4.");
            }
            else{    
                
                if(num2 == 3){
                   System.out.println("\n\nVocê adicionou um Disel!");
                    disel += 1;
                    System.out.println("\nAdicione mais itens ou finalize clicando o número 4.");
                }
                else{
                 if (num2 > 4){
                     System.out.println("\n\nValor inválido");      
                     System.out.println("Tente Novamente abaixo:");
                 }   
                 else{ 
                   if(num2 <= 0){
                       System.out.println("\n\nValor inválido");
                       System.out.println("Tente novamente abaixo:");
                   }     
            }}}}
                    
        
            num2 = teclado3.nextInt();
        }
        
        System.out.println("muito obrigado!");
        System.out.printf("alcool: %d \ngasolina: %d \ndisel: %d",alcool, gasolina, disel);
                
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////             
                 
              
                Scanner teclado4 = new Scanner(System.in);
               
            int num0;
            System.out.println("\n\nATIVIDADE 4");
           System.out.println("\nDigite um número para saber sua tabuada:");
            num0 = teclado4.nextInt(); 
            
            
            while (num0 != 0){
                System.out.printf("tabuada do: %d",num0);          
               System.out.printf("\n%d x 0 = %d",num0, num0 * 0);
                System.out.printf("\n%d x 1 = %d",num0, num0 * 1);
                System.out.printf("\n%d x 2 = %d",num0, num0 * 2);
                 System.out.printf("\n%d x 3 = %d",num0, num0 * 3);
                  System.out.printf("\n%d x 4 = %d",num0, num0 * 4);
                   System.out.printf("\n%d x 5 = %d",num0, num0 * 5);
                    System.out.printf("\n%d x 6 = %d",num0, num0 * 6);
                     System.out.printf("\n%d x 7 = %d",num0, num0 * 7);
                      System.out.printf("\n%d x 8 = %d",num0, num0 * 8);
                       System.out.printf("\n%d x 9 = %d",num0, num0 * 9);
                        System.out.printf("\n%d x 10 = %d",num0, num0 * 10);
                        break;
                     
                        
           
                
            }
           
              
                                      
            
        
        
        
        
        
        
       
    }
}
