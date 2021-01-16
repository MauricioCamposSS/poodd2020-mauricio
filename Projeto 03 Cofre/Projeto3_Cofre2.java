package projeto3_cofre2;

import java.util.Scanner;

public class Projeto3_Cofre2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in); 
        Grafite grafiteira=new Grafite(0.0f, "",0);
        Lapiseira lapiseira=new Lapiseira(0.0f);
        
       while(true){
           
           System.out.println("Bem vindo, escolha uma das opções a seguir: \n"
               + "Digite fim se deseja encerrar o programa \n"
               + "Digite iniciar e um calibre se deseja comprar uma lapiseira \n"
               + "Digite mostrar se deseja exibir o status da sua lapiseira \n"
               + "Digite grafite acompanhado de um calibre, uma dureza e um tamanho se deseja comprar uma ponta de grafite \n"
               + "Digite inserir se deseja colocar a ponta comprada na lapiseira \n"
               + "Digite remover se deseja remover a ponta colocada na lapiseira \n"
               + "Digite escrever e a quantidade de folhas se deseja escrever com a lapiseira \n");
           
           
       String linha=ler.nextLine();
       String[] vetordestring=linha.split(" ");
  
       if (vetordestring[0].equals("fim")){
       break;
       }
           
       else if(vetordestring[0].equals("iniciar")){
           lapiseira=new Lapiseira(Float.parseFloat(vetordestring[1]));
       }
        else if(vetordestring[0].equals("mostrar")){
           System.out.println(lapiseira);;
       }
       else if(vetordestring[0].equals("grafite")){
            grafiteira=new Grafite(Float.parseFloat(vetordestring[1]),vetordestring[2],Integer.parseInt(vetordestring[3]));
       }
       else if(vetordestring[0].equals("inserir")){
           lapiseira.Inserir(grafiteira);
       }
       else if(vetordestring[0].equals("remover")){
           lapiseira.Remover();
       }
       else if(vetordestring[0].equals("escrever")){
           lapiseira.Escrever(Integer.parseInt(vetordestring[1]));
       }
       
       
       
       
       
       
        
        
        //Grafite grafiteira= new Grafite(0.7f, "2B", 8);

        //Lapiseira lapis=new Lapiseira(0.7f);
       //lapis.Inserir(grafiteira);
        
      //  lapis.Escrever(9);
 
        
        
        
    }
    
}}
