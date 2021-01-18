package projeto4_tamagotchi;

import java.util.Scanner;

public class Projeto4_Tamagotchi {

    public static void main(String[] args) {

         /*Tamagotchi carlin=new Tamagotchi(10, 10, 15);
         System.out.println(carlin);
         carlin.Comendo();
         System.out.println(carlin);
         carlin.Jogando();
         System.out.println(carlin);
         carlin.Jogando();
         System.out.println(carlin);
         carlin.Jogando();
         System.out.println(carlin);
         carlin.Jogando();
         System.out.println(carlin);
         carlin.Jogando();
         carlin.Status();*/
         
        Scanner ler = new Scanner(System.in); 
        Tamagotchi tamagotchi=new Tamagotchi(0,0,0);
        
       while(true){
           
           System.out.println("Bem vindo, escolha uma das opções a seguir: \n"
               + "Digite fim se deseja encerrar o programa \n"
               + "Digite iniciar, a energia max, a saciedade max e a limpeza max de um tamagotchi para iniciar um tamagotchi \n"
               + "Digite mostrar se deseja exibir o status do seu tamagotchi \n"
               + "Digite comer se deseja colocar o tamagotchi pra comer \n"
               + "Digite dormir se deseja que o tamagotchi durma \n"
               + "Digite jogar se quer que o tamagotchi brinque \n"
               + "Digite banho para fazer o tamagotchi banhar \n");
           
           
       String linha=ler.nextLine();
       String[] vetordestring=linha.split(" ");
  
       if (vetordestring[0].equals("fim")){
       break;
       }
           
       else if(vetordestring[0].equals("iniciar")){
           tamagotchi=new Tamagotchi(Integer.parseInt(vetordestring[1]),Integer.parseInt(vetordestring[2]),Integer.parseInt(vetordestring[3]));
       }
        else if(vetordestring[0].equals("mostrar")){
           tamagotchi.Status();
       }
       else if(vetordestring[0].equals("comer")){
            tamagotchi.Comendo();
       }
       else if(vetordestring[0].equals("dormir")){
          tamagotchi.Dormindo();
       }
       else if(vetordestring[0].equals("jogar")){
           tamagotchi.Jogando();
       }
       else if(vetordestring[0].equals("banho")){
           tamagotchi.TomandoBanho();}

    }
    
}}
