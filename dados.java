
public class dados{
 
    private double altura;
    private double peso; 
    private double resultado;

    // construtor 
    public dados (){
        altura = 0;
        peso = 0; 
    }
     public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    public double getResultado(){
        return resultado;
    }

    public void calcula(){

        resultado = peso/(altura*altura); 
    }

}