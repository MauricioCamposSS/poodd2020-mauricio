package projeto4_tamagotchi;

public class Tamagotchi {
    
    private int energiamax;
    private int saciedademax;
    private int limpezamax;
    private int energia;
    private int saciedade;
    private int limpeza;
    private int diamantes;
    private int idade;
    private Boolean vivo;

    public Tamagotchi(int energiamax, int saciedademax, int limpezamax) {
        this.setEnergiamax(energiamax);
        this.setSaciedademax(saciedademax);
        this.setLimpezamax(limpezamax);
        
        this.setEnergia(this.getEnergiamax());
        this.setSaciedade(this.getSaciedademax());
        this.setLimpeza(this.getLimpezamax());
        this.setDiamantes(0);
        this.setIdade(0);
        this.setVivo(true);
    }

    
    public void Comendo(){
        // O Comando "$eat" altera em -1 a energia, +4 a saciedade, -2 a limpeza, +0 diamantes,  +1 a idade
        
        if (this.getVivo()){
        
            System.out.println("estou comendo");
            this.setIdade(this.getIdade()+1);
            System.out.println("mais 1 ano, to vei");
            
            if (this.getEnergia()>=1){ //&& (this.getEnergia()<this.getEnergiamax())){
                this.setEnergia(this.getEnergia()-1);
                System.out.println("perdi 1 energia");
            }   else{
                this.setEnergia(0);
                this.setVivo(false);
                System.out.println("morri, energia zerou");}
            
            
                
                
            

            if (this.getSaciedade()==this.getSaciedademax()){       
                System.out.println("ja estou no meu limite, buxin chei");   
            
            if (this.getSaciedade()<this.getSaciedademax()){
                this.setSaciedade(this.getSaciedade()+4);
                System.out.println("ganhei mais 4 de saciedade");

                if (this.getSaciedade()>this.getSaciedademax()){
                    System.out.println("estorei o limite da saciedade, agora ta no maximo");
                    this.setSaciedade(this.getSaciedademax());}}
            
            if (this.getLimpeza()>=1){ //&& (this.getEnergia()<this.getEnergiamax())){
                this.setLimpeza(this.getLimpeza()-1);
                System.out.println("perdi 1 limpeza");
                
            if(this.getLimpeza()<=0){
                    this.setLimpeza(0);
                    this.setVivo(false);
                    System.out.println("morri, limpeza zerou");
                    
                }
            }

        }
        
    }else{System.out.println("erro, não foi possivel realizar a operação");}}
    
    
    public void Jogando(){
        // O comando "$play" altera em -2 energia, -1 saciedade, -3 limpeza, +1 diamante, +1 idade.
        if (this.getVivo()){
        
            System.out.println("estou jugando");
          
            
            
            this.setIdade(this.getIdade()+1);
            System.out.println("mais 1 ano, to vei");
            this.setDiamantes(this.getDiamantes()+1);
            System.out.println("mais 1 dima");
            
            if (this.getEnergia()>=2){ 
                this.setEnergia(this.getEnergia()-2);
                System.out.println("perdi 2 energia");   
            }
                else {
                this.setEnergia(0);
                System.out.println("morri, energia zerou");
                this.setVivo(false);}
            
             if (this.getLimpeza()>=3){ 
                this.setLimpeza(this.getLimpeza()-3);
                System.out.println("perdi 3 limpeza");   
            }
                else{
                this.setLimpeza(0);
                this.setVivo(false);
                System.out.println("morri, limpeza zerou");}
            
            
            
            
            if (this.getSaciedade()>=1){ 
                this.setSaciedade(this.getSaciedade()-1);
                System.out.println("perdi 1 saciedade");   
            }
                else{
                System.out.println("morri, saciedade zerou");
                this.setSaciedade(0);
                this.setVivo(false);}

            }
            else{System.out.println("erro, não foi possivel realizar a operação");
        }

        }

        
    
    
    
    public void Dormindo(){
        //O Comando "$sleep" aumenta energia até o máximo e idade aumenta do número de turnos que o pet dormiu.
         if (this.getVivo()){
            int turnos=this.getEnergiamax()-this.getEnergia();
            if(turnos>=5){
        
            System.out.println("a mimir");
            
  
            this.setIdade(this.getIdade()+turnos);
            
            this.setEnergia(this.getEnergiamax());
    }
            else{System.out.println("erro, nao tenho sono");}}
         else{System.out.println("erro, não foi possivel realizar a operação");}}
         
        
        
        
        
    public void TomandoBanho(){
        //O comando "$clean" alteram em -3 energia, -1 na saciedade, MAX na limpeza, +0 diamantes, +2 na idade.
        
        if (this.getVivo()){
        
            System.out.println("estou tomando bain");
            this.setLimpeza(this.getLimpezamax());
            this.setIdade(this.getIdade()+2);
            System.out.println("mais 2 ano, to vei");
            
            if (this.getEnergia()>=3){ 
                this.setEnergia(this.getEnergia()-3);
                System.out.println("perdi 3 energia");   
            }
                else{
                this.setEnergia(0);
                System.out.println("morri, energia zerou");
                this.setVivo(false);}
            
            if (this.getSaciedade()>=1){ 
                this.setSaciedade(this.getSaciedade()-1);
                System.out.println("perdi 1 saciedade");   
            }
                else{
                this.setSaciedade(0);
                System.out.println("morri, saciedade zerou");
                this.setVivo(false);}

            }else{System.out.println("erro, não foi possivel realizar a operação");}

        }
        
    
        public void Status(){
            System.out.println(this.toString());
        }
    
  
    
    public int getEnergiamax() {
        return energiamax;
    }

    public void setEnergiamax(int energiamax) {
        this.energiamax = energiamax;
    }

    public int getSaciedademax() {
        return saciedademax;
    }

    public void setSaciedademax(int saciedademax) {
        this.saciedademax=saciedademax;
    }

    public int getLimpezamax() {
        return limpezamax;
    }

    public void setLimpezamax(int limpezamax) {
        this.limpezamax = limpezamax;
    }

    public int getDiamantes() {
        return diamantes;
    }

    public void setDiamantes(int diamantes) {
        this.diamantes = diamantes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getSaciedade() {
        return saciedade;
    }

    public void setSaciedade(int saciedade) {
        this.saciedade = saciedade;
    }

    public int getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(int limpeza) {
        this.limpeza = limpeza;
    }

    @Override
    public String toString() {
        return "Tamagotchi{" + "energiamax=" + energiamax + ", saciedade=" + saciedademax + ", limpezamax=" + limpezamax + ", energia=" + energia + ", saciedade=" + saciedade + ", limpeza=" + limpeza + ", diamantes=" + diamantes + ", idade=" + idade + ", vivo=" + vivo + '}';
    }
    
    
    
    
    
    
}
