
public class exibe extends dados {
    
    dados dados = new dados();
    
    public exibe(){
        dados.calcula();

        dados.setAltura(1.55);
        dados.setPeso(45);
        
        dados.calcula();
        calcula();

         System.out.printf("Resultado: %.2f\n ", dados.getResultado());
         if (dados.getResultado()<17){
            System.out.println("Muito abaixo do peso");
        } else if (dados.getResultado()>17 && dados.getResultado()<18.49){
            System.out.println("Abaixo do peso");
        } else if (dados.getResultado()>18.5 && dados.getResultado()<24.99){
            System.out.println("Peso normal");
        } else if (dados.getResultado()>25 && dados.getResultado()<29.99){
            System.out.println("Acima do Peso");
        } else if (dados.getResultado()>30 && dados.getResultado()<34.99){
            System.out.println("Obesidade");
        } else if(dados.getResultado()>35 && dados.getResultado()<39.99){
            System.out.println("Obesidade Severa");
        } else if (dados.getResultado()>40){
            System.out.println("Obesidade Mormida"); 
        }
       
    }
    
}
