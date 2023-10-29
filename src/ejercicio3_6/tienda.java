package ejercicio3_6;

public class tienda {
    String nombre;
    String propietario;
    int identificadorTributario;
    computador[] computadores;
    static int numeroComputadores;

    public tienda(String nombre, String propietario, int identificadorTributario, int tamaño) {
        if (tamaño < 1) {
            System.out.println("Cantidad de computadores insuficientes.");
        } else {
            this.nombre = nombre;
            this.propietario = propietario;
            this.identificadorTributario = identificadorTributario;
            computadores = new computador[tamaño];
            numeroComputadores = 0;
        }
    }

    public boolean tiendaLlena() {
        return numeroComputadores == computadores.length;
    }

    public boolean tiendaVacia() {
        return numeroComputadores == 0;
    }

    public void agregar(computador computador) {
        if (tiendaLlena()) {
            System.out.println("La tienda está llena. No se puede añadir elemento.");
        } else {
            computadores[numeroComputadores] = computador;
            numeroComputadores++;
        }
    }

    public boolean eliminar(String marcaComputador) {
        int pos = buscar(marcaComputador);
        if (pos < 0 ) {
            return false;
        }
        for (int i = pos; i < numeroComputadores; i ++) {
            computadores[i] = computadores[i+1];
        }
        numeroComputadores--;
        return true;
    }

    public int buscar(String marcaComputador) {
        for (int i = 0; i < numeroComputadores; i ++) {
            if (computadores[i].marca.equals(marcaComputador)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimir() {
        for (int i = 0; i < numeroComputadores; i ++) {
            System.out.println("Computador " + i);
            System.out.println(" la Marca = " + computadores[i].marca);
            System.out.println("la Cantidad de memoria = " + computadores[i].cantidadMemoria);
            System.out.println(" la Características del procesador = " + computadores[i].caracteristicasProcesador);
            System.out.println("la Sistema operativo = " + computadores[i].sistemaOperativo);
            System.out.println("Precio = " + computadores[i].precio);
        }
    }
}



