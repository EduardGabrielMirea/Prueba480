import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //¿Qué campos comparten ambos tipos de discos y cuáles son exclusivos de cada clase?.
            //-> Los campos compartidos  son el de nombre, marca, tipo y capacidad. Pero el campo de velocidad de giro de sus platillos es expecifico del disco duro.
        //¿Alguno de los campos representan constantes?.
            //-> El campo que he considerado una costante es de hecho la velocidad del disco duro y lo he implementado como final lo que quiere decir que es fija.
        System.out.println("Introduce la marca del CD:");
         String cdBrand = scanner.nextLine();
        System.out.println("Introduce el nombre del CD:");
            String cdNombre = scanner.nextLine();
        System.out.println("Introduce la capacidad en MB del CD:");
            int cdCapacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

        CD cd = new CD(cdBrand, cdNombre, cdCapacidad, "Contenido CD");

        System.out.println("Introduce la marca del disco duro:");
            String ddBrand = scanner.nextLine();
        System.out.println("Introduce el nombre del disco duro:");
            String ddNombre = scanner.nextLine();
        System.out.println("Introduce la capacidad en MB del disco duro:");
            int ddCapacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

        DiscoDuro discoDuro = new DiscoDuro(ddBrand, ddNombre, ddCapacidad, "Contenido Disco Duro");

        System.out.println("\n\n");
        System.out.println("Comportamientos del CD:");
            cd.girar();
                cd.escribirDatos("Empleado láser.");
        System.out.println("Leyendo datos para CD: " + cd.leerDatos());
        System.out.println("Información del CD: " + cd.obtenerInformacion());

        System.out.println("\n\n");

        System.out.println("Comportamientos del disco duro:");
            discoDuro.girar();
                discoDuro.escribirDatos("Empleado cabezal magnetico");
        System.out.println("Leyendo datos para disco duro: " + discoDuro.leerDatos());
        System.out.println("Información del disco duro: " + discoDuro.obtenerInformacion());
    }
}