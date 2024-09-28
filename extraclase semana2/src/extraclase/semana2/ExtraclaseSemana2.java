
package extraclase.semana2;

import javax.swing.JOptionPane;

public class ExtraclaseSemana2 {
    
    public static void main(String[] args) {
        //Se le pide la información al usuario
        String anios = JOptionPane.showInputDialog("Digite la cantidad de años laborando en la empresa: ");
        String horas = JOptionPane.showInputDialog("Digite la cantidad de horas que trabaja por semana: ");
        String salario = JOptionPane.showInputDialog("Digite la cantidad que se le paga por hora: ");

        //Convertir los valores a double
        double Anios = Double.parseDouble(anios);
        double Horas = Double.parseDouble(horas);
        double salarioHora = Double.parseDouble(salario);

        //Calcular Salario bruto
        double Salariobruto = (Horas * 4);
        double horasMensuales = (Salariobruto * salarioHora);
        //se inicaliza la variable para empezsar a trabajarla
        double salarioBruto = 0;
        double deducciones = 0;
        double Deducciones =0;

        if (Anios > 12) {
            salarioBruto = (salarioHora * 0.055);            
        }if (salarioBruto > 2500) {
            Deducciones = (salarioBruto - 0.027);  
        JOptionPane.showMessageDialog(null,"Su salario neto es de: "+Deducciones);
            if (salarioBruto > 3500) {
                deducciones = (salarioBruto - 0.038);
        JOptionPane.showMessageDialog(null,"Su salario neto es de: "+deducciones);
            }
        }        
        
    }
    
}
