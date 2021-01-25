package projeto5_junkfood;

import java.util.ArrayList;

public class Maquina {
   private float saldoCliente;
   private float lucro;
   private int maxProdutos;
   private ArrayList<Espiral> espirais;
   

    public Maquina(int maxProdutos, int qtdEspirais) {
        
        this.maxProdutos = maxProdutos;
        this.espirais = new ArrayList<>();
        for(int i = 0; i < qtdEspirais; i++){
            this.espirais.add(new Espiral("", 0, 0f));
    }}

    public void alterarEspiral(int indice,String nome, int qtd, float preco){
        if(qtd>this.getMaxProdutos()){
             qtd=this.getMaxProdutos();
            System.out.println("quantidade de produtos maxima ajustada");
         } 
        if(indice < 0 || (indice) >= espirais.size()){
            System.out.println("fail: indice inexistente");           
        } 
         else{
         this.espirais.set(indice, new Espiral(nome, qtd, preco));
         }
    }
    
     public void limparEspiral(int indice){
         if(indice < 0 || (indice) >= espirais.size()){
            System.out.println("fail: indice inexistente");           
        }else{

        this.espirais.set(indice, new Espiral("",0,0f));}
     }
     
     public void inserirDinheiro(float valor){
     float totvalor=saldoCliente+valor;
     this.setSaldoCliente(totvalor);
     }

     public void vender(String indicenome){
          for (Espiral espiral : espirais) {
             // if(espirais.indexOf(espiral)==indicenome){
                  //System.out.println("produto encontrado!");
            // } 
            
            if(espiral.nome.equals(indicenome)){
              System.out.println("produto encontrado!");
              
              if(espiral.preço<=this.getSaldoCliente()){
                  System.out.println("comprou um: "+espiral.getNome()+" de indice: "+espirais.indexOf(espiral));
                  this.setLucro(this.getLucro()+espiral.preço);
                  this.setSaldoCliente(this.getSaldoCliente()-espiral.preço);
                  espiral.qtd-=1;
             }
              else{
                  System.out.println("voce nao tem saldo suficiente pra um: "+espiral.getNome());}
              
              
              
             break;
             
          }
          else{
              System.out.println("procurando produto, não é este");}
             }
          }
          
          public void troco(){
              System.out.println("seu saldo era: "+this.getSaldoCliente());
              saldoCliente=0;
          }
     
     
    @Override
    public String toString() {
        String saida = "";
        for(int i = 0; i < espirais.size(); i++)
            saida += i + ":" + espirais.get(i) +" // ";
        
        return "Maquina{" + "saldoCliente=" + saldoCliente + ", lucro=" + lucro + ", maxProdutos=" + maxProdutos + ", espirais=" + saida + '}';
        
    }

    public float getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(float saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public int getMaxProdutos() {
        return maxProdutos;
    }

    public void setMaxProdutos(int maxProdutos) {
        this.maxProdutos = maxProdutos;
    }

    public ArrayList<Espiral> getEspirais() {
        return espirais;
    }

    public void setEspirais(ArrayList<Espiral> espirais) {
        this.espirais = espirais;
    }
 
}
