package calculadoraCirculo;

import java.util.Scanner;


public class CalculadoraArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = entrada.nextDouble();

        Circulo circulo = new Circulo(radio);
        double area = circulo.calcularArea();

        System.out.println("El área del círculo es: " + area);
        
        entrada.close();
    }
}
