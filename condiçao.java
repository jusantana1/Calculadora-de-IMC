import javax.swing.JOptionPane;
public class condiçao extends dados {
    
    dados dados = new dados();
    
    public condiçao(){

        String a,b;
        double x, y; 

        JOptionPane.showMessageDialog (null, "*Calculadora de IMC*");

        a = JOptionPane.showInputDialog(null, "Digite sua altura: ");
        b = JOptionPane.showInputDialog(null, "Digite seu peso: ");
      
        x = Double.parseDouble(a);
        y = Double.parseDouble(b);

        dados.setAltura(x);
        dados.setPeso(y);
        
        dados.calcula();
        calcula();

        String msg = String.format("Resultado: %.2f", dados.getResultado()); // delimitar as casas decimais no JoptionPane.

        JOptionPane.showMessageDialog (null, msg);

         if (dados.getResultado()<17){
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso");
        } else if (dados.getResultado()>17 && dados.getResultado()<18.49){
           JOptionPane.showMessageDialog(null, "Abaixo do peso");
        } else if (dados.getResultado()>18.5 && dados.getResultado()<24.99){
            JOptionPane.showMessageDialog(null, "Peso normal");
        } else if (dados.getResultado()>25 && dados.getResultado()<29.99){
            JOptionPane.showMessageDialog(null, "Acima do peso");
        } else if (dados.getResultado()>30 && dados.getResultado()<34.99){
            JOptionPane.showMessageDialog(null, "Obesidade");
        } else if(dados.getResultado()>35 && dados.getResultado()<39.99){
            JOptionPane.showMessageDialog(null, "Obesidade Severa");
        } else if (dados.getResultado()>40){
            JOptionPane.showMessageDialog(null, "Obesidade Morbida"); 
        }
       
    }
    
}
