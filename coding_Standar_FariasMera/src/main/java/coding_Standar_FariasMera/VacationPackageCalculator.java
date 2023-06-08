package coding_Standar_FariasMera;

import java.util.Scanner;

public class VacationPackageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener la información del usuario
        System.out.print("Ingrese el destino de las vacaciones (Paris, New York City): ");
        String destination = scanner.nextLine();

        System.out.print("Ingrese el número de viajeros: ");
        int numOfTravelers = scanner.nextInt();

        System.out.print("Ingrese la duración de las vacaciones en días: ");
        int duration = scanner.nextInt();

        // Calcular el costo base
        int totalCost = 1000;

        // Verificar si el destino es un lugar turístico popular y agregar el costo adicional
        if (destination.equalsIgnoreCase("Paris")) {
            totalCost += 500;
        } else if (destination.equalsIgnoreCase("New York City")) {
            totalCost += 600;
        }

        // Verificar el descuento de grupo
        if (numOfTravelers > 4 && numOfTravelers < 10) {
            totalCost -= totalCost * 0.1;
        } else if (numOfTravelers > 10) {
            totalCost -= totalCost * 0.2;
        }

        // Verificar la duración de las vacaciones y agregar o restar los costos correspondientes
        if (duration < 7) {
            totalCost += 200;
        } else if (duration > 30 || numOfTravelers == 2) {
            totalCost -= 200;
        }

        // Verificar si el número de personas excede el límite de 80
        if (numOfTravelers > 80) {
            System.out.println("El paquete de vacaciones no está disponible para grupos de más de 80 personas.");
            totalCost = -1;
        } else {
            // Obtener la selección de los complementos opcionales
            System.out.print("¿Desea agregar el paquete Todo Incluido? (Sí/No): ");
            String allInclusiveChoice = scanner.next();

            System.out.print("¿Desea agregar el paquete de Actividades de Aventura? (Sí/No): ");
            String adventurePackageChoice = scanner.next();

            System.out.print("¿Desea agregar el paquete de Spa? (Sí/No): ");
            String spaPackageChoice = scanner.next();

            // Calcular el costo de los complementos seleccionados
            if (allInclusiveChoice.equalsIgnoreCase("Sí")) {
                totalCost += 200 * numOfTravelers;
            }

            if (adventurePackageChoice.equalsIgnoreCase("Sí")) {
                totalCost += 150 * numOfTravelers;
            }

            if (spaPackageChoice.equalsIgnoreCase("Sí")) {
                totalCost += 100 * numOfTravelers;
            }
        }

        // Mostrar el costo total o el mensaje de error si corresponde
        if (totalCost != -1) {
            System.out.println("El costo total del paquete de vacaciones es: $" + totalCost);
        } else {
            System.out.println("Los datos ingresados no son válidos.");
        }
    }
}

