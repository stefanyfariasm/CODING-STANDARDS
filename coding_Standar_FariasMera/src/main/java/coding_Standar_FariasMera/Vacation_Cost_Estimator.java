package coding_Standar_FariasMera;

import java.util.Scanner;

public class Vacation_Cost_Estimator {
	
	private String destination;
	private int numTravelers;
	private int duration;
	public int base;
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumTravelers() {
		return numTravelers;
	}
	public void setNumTravelers(int numTravelers) {
		this.numTravelers = numTravelers;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	/**
	 * constructor
	 * @param destination
	 * @param numTravelers
	 * @param duration
	 */
	public Vacation_Cost_Estimator(String destination, int numTravelers, int duration) {
		super();
		this.destination = destination;
		this.numTravelers = numTravelers;
		this.duration = duration;
	}
	
	/**
	 * metodo para calcular el costo del viaje
	 * @param Person
	 * @return
	 */
	public static int calculate(Vacation_Cost_Estimator Person) {
	
		int base = 1000;
		
		if (Person.getDestination().equals("Paris"))
			return base + 500;
		
		else if (Person.getDestination().equals("New York City"))
			return base +600;
		
		else if ((Person.getNumTravelers() >= 4) && (Person.getNumTravelers() < 10))
			return (base *10)/100;
		
		else if (Person.getNumTravelers() > 10)
			return (base *20)/100;
		
		else if (Person.getDuration()<7)
			return base +200;
		
		else if (Person.getDuration()>30 || Person.getNumTravelers() == 2)
			return base -200;
		
		else if (Person.getNumTravelers() > 80)
			System.out.println("No está disponible el servicio para tantas personas. ");
			return 0;

	}
	
	
	//CHECKSTYLE: OFF
	/**
	 * metodo main
	 * @param args
	 */
	public static void main(String[] args) {
	//CHECKSTYLE: ON
			Scanner sc = new Scanner (System.in);
	
			System.out.println("Ingrese el número de pasajeros: ");
			int travelers = sc.nextInt();
	
			System.out.println("Ingrese el destino: ");
			String destination = sc.next();
	
			System.out.println("Ingrese la duración del viaje: ");
			int duration = sc.nextInt();
	
			Vacation_Cost_Estimator person = new Vacation_Cost_Estimator(destination,travelers,duration);
			
			System.out.println("Valor a pagar " +calculate(person));
			
	}
	
}
