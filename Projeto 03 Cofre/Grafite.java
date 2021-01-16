package projeto3_cofre2;

public class Grafite {
  
   public float calibre;
   public String dureza;
   public int tamanho;
    
    Grafite(float calibre, String dureza, int tamanho){
        this.calibre=calibre;
        this.dureza=dureza;
        this.tamanho=tamanho;
    }
    
    public void DesgastePorFolha(){
            if (this.dureza.equals("HB")){
                this.tamanho-=1;
            }
            
            else if (this.dureza.equals("2B")){
                this.tamanho-=2;    
            }
            
            else if (this.dureza.equals("4B")){
                this.tamanho-=4;    
            }
            
            else if (this.dureza.equals("6B")){
                this.tamanho-=6;
    }}

    public float getCalibre() {
        return calibre;
    }

    public void setCalibre(float calibre) {
        this.calibre = calibre;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void Statusgrafite(){
        System.out.println("calibre"+this.getCalibre());
        System.out.println("dureza"+this.getDureza());
        System.out.println("tamanho"+this.getTamanho());
        
    }

    @Override
    public String toString() {
        return "Grafite{" + "calibre=" + calibre + ", dureza=" + dureza + ", tamanho=" + tamanho + '}';
    }
    
     
    
}
