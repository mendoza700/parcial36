package ejercicio3_6;

public class prueba {
        public static void main(String[] args) {
            tienda tienda = new tienda("Tienda Cuántica", "juan lopez", 123456, 5);
            computador computador1 = new computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
            computador computador2 = new computador("Dell", 64, "AMD Ryzen 5", "Linux", 20000000);

            tienda.agregar(computador1);
            tienda.agregar(computador2);

            tienda.imprimir();
        }
    }


