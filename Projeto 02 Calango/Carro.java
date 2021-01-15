package poo002;
import java.util.Scanner;

public class Carro {
    public int gas;
    public int maxgas=100;  
    public int passageiros;
    public int maxpassageiros=2;
    public int km;

   // public Carro(int gas, int passageiros, int km) {
    //    this.setGas(gas);
    //    this.setPassageiros(passageiros);
     //   this.setKm(km);
    //}
    
    public Carro() {
        this.gas=0;
        this.passageiros=0;
        this.km=0;
    }
    
    
    
    public void embarcar(int p){
    if(this.getPassageiros()<this.maxpassageiros){
        if(p>1){
        System.out.println("não pode embarcar mais de uma pessoa");
        
    } else if(p==1){
        System.out.println("embarcou uma pessoa");
        this.setPassageiros(this.getPassageiros()+p);
    }
  
    }else{System.out.println("quantidade de passageiros excedida");}}
   
    public void desembarcar(int p){
    if(this.getPassageiros()>0){
        if(p>1){
        System.out.println("não pode desembarcar mais de uma pessoa");
    } else if((p==1) && (this.getPassageiros()>0)){
        System.out.println("desembarcou uma pessoa");
        this.setPassageiros(this.getPassageiros()-p);
    }
    }else{System.out.println("não da pra sair mais ninguem");}}
    
 
    
    
    public void abastecer(int c){
    if(this.getGas()< this.maxgas){
        this.setGas(this.getGas()+c);
        
        if(this.getGas()>100){
            this.setGas(this.maxgas);
        }
    }//else{
        //System.out.println("é muito gas");}
    }
   //if(this.getGas()+c>=100){System.out.println("alcançou o limite do tanque");}
   
   
    
   
    
    public void dirigir(int km){
    if((this.getPassageiros()>=1) && this.getGas()>0){
        if(this.getGas()<km){
            System.out.println("Tanque vazio após andar "+ this.getGas());
            this.setKm(this.getGas()+this.getKm());
            this.setGas(0);
        
        }else if(this.getGas()==km){
            
            this.setKm(this.getKm()+km);
            this.setGas(0);
        
        }else if(this.getGas()>km){
            this.setKm(this.getKm()+km);
            this.setGas(this.getGas()-km);
        
        }
    
    }else if((this.getPassageiros()<=0) || this.getGas()<=0){
        System.out.println("Não há passageiros ou gás");
        
    }
        
        
        
    }
    
    public void status(){
        System.out.println("gas: "+this.getGas());
        System.out.println("passageiros: "+this.getPassageiros());
        System.out.println("km: "+this.getKm());
    }
    
    public int getGas(){
        return this.gas;}
    
    public void setGas(int g){
        this.gas=g;}

    public int getMaxgas() {
        return maxgas;
    }

    public void setMaxgas(int maxgas) {
        this.maxgas = maxgas;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getMaxpassageiros() {
        return maxpassageiros;
    }

    public void setMaxpassageiros(int maxpassageiros) {
        this.maxpassageiros = maxpassageiros;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
}
