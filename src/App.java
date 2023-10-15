import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaración de una variable para almacenar el número ingresado por el usuario
        int dato;

        // Mostrar una ventana de diálogo para que el usuario ingrese un número
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite su número: "));

        // Estructura de control switch para determinar qué mensaje mostrar
        switch(dato)  {
            case 1:
                // Si dato es 1, muestra un mensaje específico
                JOptionPane.showMessageDialog(null, "Este es el número 1");
                break;
            case 2:
                // Si dato es 2, muestra un mensaje específico
                JOptionPane.showMessageDialog(null, "Este es el número 2");
                break;
            case 3:
                // Si dato es 3, muestra un mensaje específico
                JOptionPane.showMessageDialog(null, "Este es el número 3");
                break;
            case 4:
                // Si dato es 4, muestra un mensaje específico
                JOptionPane.showMessageDialog(null, "Este es el número 4");
                break;
            case 5:
                // Si dato es 5, muestra un mensaje específico
                JOptionPane.showMessageDialog(null, "Este es el número 5");
                break;
            default:
                // Si dato no coincide con ningún caso anterior, muestra un mensaje genérico
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}
