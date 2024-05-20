package Vista;
import javax.swing.JOptionPane;


public class InOut {
    
    public int pedirEntero(String m){ 
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    
    public String pedirString(String m){
        return JOptionPane.showInputDialog(m);
    }
    
    
    public void mostraDatos(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    
     public static int mostrarPantallaInicial() {
        InOut data = new InOut();
        int opcion;
        do {
            opcion = data.pedirEntero("Digite una opcion:\n1. Registrar producto\n2. Registrar familia\n3. Cargar familias con ayuda\n4.Mostrar Familias\n5. Salir");
        }while(opcion>5 || opcion <1 );
        return opcion;
    }
    
     
}
