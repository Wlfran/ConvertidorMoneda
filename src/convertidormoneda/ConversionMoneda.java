/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidormoneda;

import javax.swing.JOptionPane;

/**
 *
 * @author Wlfran
 */
public class ConversionMoneda {
    //monedas m = new monedas();
    double valor;
    public void convertirM(String moneda){
        
        try {
            double num = Double.parseDouble(monedas.jTextField1.getText());
            if(num!=0){
                switch(moneda){
                    case "COP a USD": 
                        valor = num * 0.00025;
                        System.out.println(valor);
                        monedas.jLabel4.setText("Tiene: "+valor+" USD");
                        break;
                    case "COP a EUR":
                        valor = num * 0.00023;
                        monedas.jLabel4.setText("Tiene: "+valor+" EUR");
                        break;
                    case "COP a BRL":
                        valor = num * 0.0012;
                        monedas.jLabel4.setText("Tiene: "+valor+" BRL");
                    break;
                    case "COP a ARS":
                        valor = num * 0.069;
                        monedas.jLabel4.setText("Tiene: "+valor+" ARS");
                        break;
                    case "COP a MXN":
                        valor = num * 0.0042;
                        monedas.jLabel4.setText("Tiene: "+valor+" MXN");
                        break;
                    case "USD a COP":
                        valor = num * 3940.56;
                        monedas.jLabel4.setText("Tiene: "+valor+" COP");
                        break;
                    case "EUR a COP":
                        valor = num * 4344.27;
                        monedas.jLabel4.setText("Tiene: "+valor+" COP");
                        break;
                    case "BRL a COP":
                        valor = num * 833.86;
                        monedas.jLabel4.setText("Tiene: "+valor+" COP");
                        break;
                    case "ARS a COP":
                        valor = num * 14.47;
                        monedas.jLabel4.setText("Tiene: "+valor+" COP");
                        break;
                    case "MXN a COP":
                        valor = num * 236.12;
                        monedas.jLabel4.setText("Tiene: "+valor+" COP");
                        break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Seleccione opcion a convertir");
                        break;
        }
        }else{
                JOptionPane.showMessageDialog(null, "El valor a convertir tiene que ser diferente de 0");
        }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese dinero a convertir");
        }
        
        
    }
}
