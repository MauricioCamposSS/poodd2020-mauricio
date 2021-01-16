package projeto3_cofre2;

public class Lapiseira {
    
    public float calibre;
    public Grafite grafitinho;
    
    Lapiseira(float calibre){
        this.calibre=calibre;
        this.grafitinho=null;   
    }
    
    public void Inserir(Grafite g){
        
        if (g.getCalibre() !=  this.getCalibre()){
            System.out.println("erro, calibre inserido maior ou menor que o calibre da lapiseira");
        }
        else{
        this.grafitinho=g;}
       
    
    }
    
    public void Remover(){
        this.grafitinho=null;
    }
    
    public void Escrever(int folhas){
        if (this.grafitinho==null){
            System.out.println("da pra escrever não ó, sem ponta");
 
        }
        
        else{
            int i;
            int recebetotal=0;
            
            for (i=folhas; i>0; i--){
            grafitinho.DesgastePorFolha();
                System.out.println("escrevendo: "+grafitinho.tamanho);
                
               recebetotal +=1 ;
                
               if((grafitinho.tamanho<1)&&(i>0)){
                   System.out.println("texto ficou incompleto, foram escritas: "+recebetotal+" folhas");
                  
            } 
                             

               if(grafitinho.tamanho<1){
                   System.out.println("acabou-se minhas ponta");
                   grafitinho=null;
                   break;

               }
               
               
            }
            
            }
    }
    


    
    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }

    public Grafite getGrafitinho() {
        return grafitinho;
    }

    public void setGrafitinho(Grafite grafitinho) {
        this.grafitinho = grafitinho;
    }
    
    //public void Status(){
     //   System.out.println(this.getCalibre());
   //     System.out.println(this.getGrafitinho());
        
   // }

    @Override
    public String toString() {
        return "Lapiseira{" + "calibre=" + calibre + ", grafitinho=" + grafitinho + '}';
    }
    
    
}
