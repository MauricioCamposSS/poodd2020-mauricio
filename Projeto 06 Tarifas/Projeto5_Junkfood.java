package projeto5_junkfood;

public class Projeto5_Junkfood {

    public static void main(String[] args) {
        Maquina testando=new Maquina(10, 8);
        testando.alterarEspiral(0, "xilito", 10, 6.30f);
        System.out.println(testando);
        testando.inserirDinheiro(10);
        testando.vender("xilito");
        System.out.println(testando);
        testando.inserirDinheiro(15);
        testando.vender("xilito");
        System.out.println(testando);
        testando.alterarEspiral(2, "pitchula", 7, 2.30f);
        System.out.println(testando);
        testando.limparEspiral(0);
        System.out.println(testando);
        testando.troco();
        System.out.println(testando);
        
 
    }
    
}
