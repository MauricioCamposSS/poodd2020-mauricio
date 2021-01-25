package projeto5_junkfood;

public class Espiral {
    String nome;
    int qtd;
    float preço;
  

    public Espiral(String nome, int qtd, float preço) {
        
        this.setNome(nome);
        this.setQtd(qtd);
        this.setPreço(preço);
    }

 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        if (this.getNome()==""){
        this.setNome("-------");
        
        }
        return "Espiral{" + "nome=" + nome + ", qtd=" + qtd + ", pre\u00e7o=" + preço + '}';
    }
    
    
}
