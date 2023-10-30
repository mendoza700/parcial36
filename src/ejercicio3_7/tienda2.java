package ejercicio3_7;
import java.util.Vector;
public class tienda2 {
    String nombre;
    String propietario;
    int identificadorTributario;
    Vector<computador> computadores;
    public tienda2(String nombre, String propietario, int identificadorTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        computadores = new Vector<>();
    }

    public void añadir(computador computador) {
        computadores.add(computador);
    }

    public boolean eliminar(String marcaComputador) {
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).marca.equals(marcaComputador)) {
                computadores.removeElementAt(i);
                return true;
            }
        }
        return false;
    }

    public int buscar(String marcaComputador) {
        for (int i = 0; i < computadores.size(); i++) {
            if (computadores.get(i).marca.equals(marcaComputador)) {
                return i;
            }
        }
        return -1;
    }
    public boolean tiendaVacio() {
        return computadores.isEmpty();
    }
}



