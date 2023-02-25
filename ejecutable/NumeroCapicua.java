package ejecutable;

import javax.swing.JOptionPane;

public class NumeroCapicua {

    public static void main(String[] args) {
        
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Dijite un número positivo: "));
    
        if(capicua(n)){
            JOptionPane.showMessageDialog(null, "El número " + n + " es capicúa" );
        }else {
            JOptionPane.showMessageDialog(null, "El número " + n + " NO es capicúa" );
        }

    }
    public static boolean capicua(int n) {

        int temp = n;

        int reverse = 0;


        while ( temp != 0){

            int lastDigit = temp % 10;

            reverse = reverse * 10 + lastDigit;

            // Eliminar el último dígito del número usando el operador /
            temp = temp / 10;
        }
        // Comparar el número original con el reverso y devolver true o false
        return n == reverse;
            
        }

    }

