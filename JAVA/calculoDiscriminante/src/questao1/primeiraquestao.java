package questao1;
import java.util.Scanner;
public class primeiraquestao {
	
	public static void main (String[] args) {
		
	 Scanner teclado = new Scanner(System.in);
		
	// -b +- raiz b�-4ac / 2a 
	
	int a; // primeiro coeficiente da equa��o
	int b; // segundo coeficiente da equa��o
	int c; //terceiro coeficiente da equa��o
	double x1; // 1� raiz da equa��o
	double x2; // 2� raiz da equa��o
	int delta; // discriminante de uma equa��o do 2� grau
	
	System.out.println("CALCULO DO DISCRIMINANTE");
	System.out.println();
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.println(); // recebendo os valores dos coeficientes
	System.out.println("Insira o valor do 1� coeficiente da equa��o: ");
	 a = teclado.nextInt();
	System.out.println("Insira o valor do 2� coeficiente da equa��o: ");
	 b = teclado.nextInt();
	System.out.println("Insira o valor do 3� coeficiente da equa��o: ");
	 c = teclado.nextInt();
    System.out.println("----------------------------------------------------------------------------------------------------");
	
	 delta = ((b*b) - (4*a*c)); // calculo do discriminante
	 
	 System.out.println("O valor do discriminante � :"+ delta);
	 
	 // calculo das ra�zes
	 
	 x1 = (-b - Math.sqrt(delta) )/ 2*a;
	 x2 = (-b + Math.sqrt(delta) )/ 2*a;
	 
	 if (delta < 0) {
		 System.out.println(" Raizes imagin�rias ");
	 }else {
		 System.out.println("Ra�ses reais");

		 if (delta == 0) {
			 System.out.printf("As ra�ses s�o iguais, e valem : X= %.2f", x1);
		 }else {
			 System.out.print("As ra�ses s�o diferentes, e valem :");
			 System.out.println();
			 System.out.printf("x1 =  %.2f", x1);
			 System.out.println();
			 System.out.printf("x2 =  %.2f", x2);
			 
		 }
		 
	 }
	
	 

	}
}
