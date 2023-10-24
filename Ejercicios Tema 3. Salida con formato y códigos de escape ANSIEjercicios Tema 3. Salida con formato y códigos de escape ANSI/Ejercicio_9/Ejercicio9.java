import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		
		String ciudad;
		String espacio = "";
        int dia, mes, year;
		int hora, minutos, segundos;
        int velocidadViento;
        double temperatura;
        double presionAtmosferica;
        int probabilidadLluvia;
        int indiceUVI;

		System.out.println("Ingrese una ciudad =");
		ciudad = lector.nextLine();
		
		System.out.println("Ingrese un dia =");
		dia = Integer.parseInt(lector.nextLine());
		System.out.println("Ingrese un mes =");
		mes = Integer.parseInt(lector.nextLine());
		System.out.println("Ingrese un año =");
		year = Integer.parseInt(lector.nextLine());
		
		System.out.println("Ingrese hora =");
		hora = Integer.parseInt(lector.nextLine());
		System.out.println("Ingrese minutos =");
		minutos = Integer.parseInt(lector.nextLine());
		System.out.println("Ingrese segundos =");
		segundos = Integer.parseInt(lector.nextLine());		

		System.out.println("Ingrese velocidad del viento =");
		velocidadViento = Integer.parseInt(lector.nextLine());

		System.out.println("Ingrese temperatura =");
		temperatura = Double.parseDouble(lector.nextLine());

		System.out.println("Ingrese presión atmosférica =");
		presionAtmosferica = Double.parseDouble(lector.nextLine());

		System.out.println("Ingrese probabilidad de lluvia =");
		probabilidadLluvia = Integer.parseInt(lector.nextLine());

		System.out.println("Ingrese índice de radiación ultravioleta  =");
		indiceUVI = Integer.parseInt(lector.nextLine());
		
		System.out.println("\u001B[1;37;44m ** DATOS ESTACIÓN METERELÓGICA ** \u001B[0m");
		System.out.println("Ciudad: " + espacio + ciudad);
		if(dia <= 31 && mes <= 12 && year > 0 && year < 9999){
			System.out.print("Fecha: " + espacio);
			System.out.printf("%02d/%02d/%04d", dia, mes, year);
		}else{	
			System.out.println("La fecha introducida no es correcta");
		}
		System.out.println();
		
		System.out.print("Hora de la medida: " + espacio);
		System.out.printf("%02d:%02d:%02d", hora, minutos, segundos);

		System.out.println();
		
		if(velocidadViento < 30){
			System.out.print("Velocidad del viento: " + espacio);
			System.out.printf("\u001B[1;32;40m", velocidadViento);
			System.out.printf("%d", velocidadViento);
			System.out.print(" km/h");
			System.out.printf("\u001b[0m");
		}
		else if(velocidadViento >= 30 && velocidadViento <= 60){
			System.out.print("Velocidad del viento: " + espacio);
			System.out.printf("\u001B[1;33;40m", velocidadViento);
			System.out.printf("%d", velocidadViento);
			System.out.print(" km/h");
			System.out.printf("\u001b[0m");
		}
		else if(velocidadViento > 60){
			System.out.print("Velocidad del viento: " + espacio);
			System.out.printf("\u001B[1;31;40m", velocidadViento);
			System.out.printf("%d", velocidadViento);
			System.out.print(" km/h");
			System.out.printf("\u001b[0m");
		}
		else{
			System.out.println("La velocidad del viento introducida no es correcta");
		}
		
		System.out.println();

		if(temperatura >= 22 && temperatura <= 27){
			System.out.print("Temperatura: " + espacio);
			System.out.printf("\u001B[1;32;40m", temperatura);
			System.out.printf("%.2f", temperatura);
			System.out.print(" Cº");
			System.out.printf("\u001b[0m");
		}
		else if(temperatura < 22){
			System.out.print("Temperatura: " + espacio);
			System.out.printf("\u001B[1;34;40m", temperatura);
			System.out.printf("%.2f", temperatura);
			System.out.print(" Cº");
			System.out.printf("\u001b[0m");
		}
		else if(temperatura >= 27 && temperatura <= 35){
			System.out.print("Temperatura: " + espacio);
			System.out.printf("\u001B[1;33;40m", temperatura);
			System.out.printf("%.2f", temperatura);
			System.out.print(" Cº");
			System.out.printf("\u001b[0m");
		}
		else if(temperatura > 35){
			System.out.print("Temperatura: " + espacio);
			System.out.printf("\u001B[1;31;40m", temperatura);
			System.out.printf("%.2f", temperatura);
			System.out.print(" Cº");
			System.out.printf("\u001b[0m");
		}
		else if(temperatura > 35){
			System.out.print("Temperatura: " + espacio);
			System.out.printf("\u001B[1;35;40m", temperatura);
			System.out.printf("%.2f", temperatura);
			System.out.print(" Cº");
			System.out.printf("\u001b[0m");
		}
		else{
			System.out.println("La temperatura introducida no es correcta");
		}
		System.out.println();
		
		System.out.print("Presión atmosférica: " + espacio);
		System.out.printf("%.1f", presionAtmosferica);
		System.out.print(" hPa");

		System.out.println();
		
		if(probabilidadLluvia < 35){
			System.out.print("Probabilidad de lluvia: " + espacio);
			System.out.printf("\u001B[1;32;40m", probabilidadLluvia);
			System.out.printf("%d", probabilidadLluvia);
			System.out.print("%");
			System.out.printf("\u001b[0m");
		}
		else if(probabilidadLluvia >= 35 && probabilidadLluvia <= 70){
			System.out.print("Probabilidad de lluvia: " + espacio);
			System.out.printf("\u001B[1;33;40m", probabilidadLluvia);
			System.out.printf("%d", velocidadViento);
			System.out.print("%");
			System.out.printf("\u001b[0m");
		}
		else if(probabilidadLluvia > 70){
			System.out.print("Probabilidad de lluvia: " + espacio);
			System.out.printf("\u001B[1;31;40m", probabilidadLluvia);
			System.out.printf("%d", probabilidadLluvia);
			System.out.print("%");
			System.out.printf("\u001b[0m");
		}
		else{
			System.out.println("La probabilidad de lluvia introducida no es correcta");
		}
		
		
		System.out.println();


		if(indiceUVI <= 2){
			System.out.print("UVI: " + espacio);
			System.out.printf("\u001B[1;32;40m", indiceUVI);
			System.out.printf("%2d", indiceUVI);
			System.out.printf("\u001b[0m");
		}
		else if(indiceUVI >= 3 && indiceUVI <= 5){
			System.out.print("UVI: " + espacio);
			System.out.printf("\u001B[1;34;40m", indiceUVI);
			System.out.printf("%2d", indiceUVI);
			System.out.printf("\u001b[0m");
		}
		else if(indiceUVI >= 6 && indiceUVI <= 7){
			System.out.print("UVI: " + espacio);
			System.out.printf("\u001B[1;33;40m", indiceUVI);
			System.out.printf("%2d", indiceUVI);
			System.out.printf("\u001b[0m");
		}
		else if(indiceUVI >= 8 && indiceUVI <= 10){
			System.out.print("UVI: " + espacio);
			System.out.printf("\u001B[1;31;40m", indiceUVI);
			System.out.printf("%2d", indiceUVI);
			System.out.printf("\u001b[0m");
		}
		else if(indiceUVI > 10){
			System.out.print("UVI: " + espacio);
			System.out.printf("\u001B[1;35;40m", indiceUVI);
			System.out.printf("%2d", indiceUVI);
			System.out.printf("\u001b[0m");
		}
		else{
			System.out.println("El índice de radiación ultravioleta introducido no es correcto");
		}
		lector.close();
	}

}