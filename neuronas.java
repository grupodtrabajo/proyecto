import javax.swing.*;

public class DecimalABinario {
    public static void main(String[] args) {
        String continuar;
        do {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número decimal"));
            String binario = Integer.toBinaryString(numero);
            JOptionPane.showMessageDialog(null, "El número binario es: " + binario);
            continuar = JOptionPane.showInputDialog("¿Desea continuar? (s/n)");
        } while (continuar.equalsIgnoreCase("s"));
    }
}
