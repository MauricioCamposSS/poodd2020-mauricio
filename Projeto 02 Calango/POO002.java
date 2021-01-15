package poo002;

import java.util.Scanner;

public class POO002 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in); 
       Carro carrotest=new Carro();
          
       while(true){
       String linha=ler.nextLine();
       String[] vetordestring=linha.split(" ");
           
       
       if(vetordestring[0].equals("fim")){
       break;
       }
       else if(vetordestring[0].equals("iniciar")){
           carrotest=new Carro();
       }
        else if(vetordestring[0].equals("mostrar")){
           carrotest.status();
       }
       else if(vetordestring[0].equals("entrar")){
           carrotest.embarcar(Integer.parseInt(vetordestring[1]));
       }
       else if(vetordestring[0].equals("sair")){
           carrotest.desembarcar(Integer.parseInt(vetordestring[1]));
       }
       else if(vetordestring[0].equals("abastecer")){
           carrotest.abastecer(Integer.parseInt(vetordestring[1]));
       }
       else if(vetordestring[0].equals("dirigir")){
           carrotest.dirigir(Integer.parseInt(vetordestring[1]));
       }
       
      
       
       
}}}
