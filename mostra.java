
public class mostra extends dados {
    
    dados dados = new dados();
    

    public mostra(){
        dados.calcula();

        dados.setAltura(1.53);
        dados.setPeso(50.1);
        
        dados.calcula();
        calcula();

        System.out.println("Resultado: "  + dados.getResultado());
    }
    
}
