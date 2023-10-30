package ejercicio3_7;
public class prueba2 {
    public static void main(String[] args) {
        tienda2 tienda = new tienda2("Tienda Cuántica", "juan lopez", 123456);
        computador computador1 = new computador("Acer", 50, "Intel iCore 7", "Windows", 18500000);
        computador computador2 = new computador("Toshiba", 80, "Intel iCore 5", "Windows", 15500000);
        computador computador3 = new computador("Mac", 100, "Intel iCore 7", "Mac", 25000000);

        tienda.añadir(computador1);
        tienda.añadir(computador2);
        tienda.añadir(computador3);

        System.out.println("Tienda vacía: " + tienda.tiendaVacio());

        System.out.println("Buscar Mac: " + tienda.buscar("Mac"));

        System.out.println("Eliminar Acer: " + tienda.eliminar("Acer"));

        System.out.println("Tienda vacía: " + tienda.tiendaVacio());

        System.out.println("Buscar Acer: " + tienda.buscar("Acer"));
    }
}

