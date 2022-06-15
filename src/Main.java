import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Plane plane = new Plane();

        boolean salida = false;

        while (!salida) {

            System.out.println("\n\t==================================");
            System.out.println("\tHola soldado seleccione una opción");
            System.out.println("\t==================================\n");

            System.out.println("1 - Inicializar F18");
            System.out.println("2 - Alternar estado de los flaps ");
            System.out.println("3 - Alternar estado del tren de aterrizaje");
            System.out.println("4 - Armar sistema de eyección");
            System.out.println("5 - Eyectar piloto");
            System.out.println("Q - Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Soldado introduzca el número de litros de combustible");
                    float fuel = scanner.nextFloat();

                    System.out.println("Ahora el apodo del piloto");
                    scanner.nextLine();
                    String pilotName = scanner.nextLine();

                    System.out.println("Por último el número de escuadron");
                    String squad = scanner.nextLine();

                    plane.generateF18(fuel, pilotName, squad);

                    System.out.println("\n\t--------------------------");
                    System.out.println("\tF18 inicializado con exito");
                    System.out.println("\t--------------------------");

                    break;
                case "2":
                    plane.toggleFlaps();
                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "Q":

                    break;
                default:
                    System.out.println("La opción introducida no esta entre las ofrecidas");
            }
        }
    }
}
