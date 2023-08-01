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
public class ConversionTemperatura {
    
    public void convertirT (String temp){
        try {
            double num = Double.parseDouble(temperatura.jTextField1.getText());
            if(num!=0){
                temperatura.jLabel4.setText("");
                double convT;
                if(temp=="C a F"){
                    convT = num*1.8+32;
                    System.out.println(convT);
                    temperatura.jLabel4.setText("Su temperatura es: "+convT+" F.");
                }else{
                    if(temp=="F a C"){
                        convT = (num-32)/1.8; 
                        System.out.println(convT);
                        temperatura.jLabel4.setText("Su temperatura es: "+convT+" C.");
                    }else{
                        if(temp=="K a C"){
                            convT = num -273.15;
                            System.out.println(convT);
                            temperatura.jLabel4.setText("Su temperatura es: "+convT+" C.");
                        }else{
                            if(temp=="C a K "){
                                convT = num + 273.15;
                                System.out.println(convT);
                                temperatura.jLabel4.setText("Su temperatura es: "+convT+" K.");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Seleccione opcion a convertir");
                            }
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "El valor a convertir tiene que ser diferente de 0");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese temperatura a convertir");
        }
        
    }
}
