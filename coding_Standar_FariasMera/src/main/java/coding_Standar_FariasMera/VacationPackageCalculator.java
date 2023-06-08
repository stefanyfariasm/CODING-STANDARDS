package coding_Standar_FariasMera;

import java.util.Scanner;
/**
 * 
 * @author stefanynfm
 *
 */
public class VacationPackageCalculator {
	/**
	 * 
	 * @author stefanynfm
	 *
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el destino de las vacaciones: ");
        String destination = scanner.nextLine();

        System.out.print("Ingrese el n�mero de viajeros: ");
        int numOfTravelers = scanner.nextInt();

        System.out.print("Ingrese la duraci�n de las vacaciones en d�as: ");
        int duration = scanner.nextInt();

        int totalCost = 1000;

        if ("Paris".equalsIgnoreCase(destination)) {
            totalCost += 500;
        } else if ("New York City".equalsIgnoreCase(destination)) {
            totalCost += 600;
        }

        if (numOfTravelers > 4 && numOfTravelers < 10) {
            totalCost -= totalCost * 0.1;
        } else if (numOfTravelers > 10) {
            totalCost -= totalCost * 0.2;
        }

        if (duration < 7) {
            totalCost += 200;
        } else if (duration > 30 || numOfTravelers == 2) {
            totalCost -= 200;
        }
        
        /**
         * 
         * @author stefanynfm
         *
         */
        if (numOfTravelers > 80) {
            System.out.println("El paquete de vacaciones no est� disponible para grupos de m�s de 80 personas.");
            totalCost = -1;
        } else {
            System.out.print("�Desea agregar el paquete Todo Incluido? (S�/No): ");
            String allInclusiveChoice = scanner.next();

            System.out.print("�Desea agregar el paquete de Actividades de Aventura? (S�/No): ");
            String adventurePackageChoice = scanner.next();

            System.out.print("�Desea agregar el paquete de Spa? (S�/No): ");
            String spaPackageChoice = scanner.next();

            if ("S�".equalsIgnoreCase(allInclusiveChoice)) {
                totalCost += 200 * numOfTravelers;
            }

            if ("S�".equalsIgnoreCase(adventurePackageChoice)) {
                totalCost += 150 * numOfTravelers;
            }

            if ("S�".equalsIgnoreCase(spaPackageChoice)) {
                totalCost += 100 * numOfTravelers;
            }
        }
        
        /**
         * 
         * @author stefanynfm
         *
         */
        if (totalCost != -1) {
            System.out.println("El costo total del paquete de vacaciones es: $" + totalCost);
        } else {
            System.out.println("Los datos ingresados no son v�lidos.");
        }
    }
}