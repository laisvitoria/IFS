package questao1;
import java.util.Scanner;
public class primeiraquestao {
	
	public static void main (String[] args) {
		
	 Scanner teclado = new Scanner(System.in);
		
	// -b +- raiz b²-4ac / 2a 
	
	int a; // primeiro coeficiente da equação
	int b; // segundo coeficiente da equação
	int c; //terceiro coeficiente da equação
	double x1; // 1° raiz da equação
	double x2; // 2° raiz da equação
	int delta; // discriminante de uma equação do 2° grau
	
	System.out.println("CALCULO DO DISCRIMINANTE");
	System.out.println();
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.println(); // recebendo os valores dos coeficientes
	System.out.println("Insira o valor do 1° coeficiente da equação: ");
	 a = teclado.nextInt();
	System.out.println("Insira o valor do 2° coeficiente da equação: ");
	 b = teclado.nextInt();
	System.out.println("Insira o valor do 3° coeficiente da equação: ");
	 c = teclado.nextInt();
    System.out.println("----------------------------------------------------------------------------------------------------");
	
	 delta = ((b*b) - (4*a*c)); // calculo do discriminante
	 
	 System.out.println("O valor do discriminante é :"+ delta);
	 
	 // calculo das raízes
	 
	 x1 = (-b - Math.sqrt(delta) )/ 2*a;
	 x2 = (-b + Math.sqrt(delta) )/ 2*a;
	 
	 if (delta < 0) {
		 System.out.println(" Raizes imaginárias ");
	 }else {
		 System.out.println("Raíses reais");

		 if (delta == 0) {
			 System.out.printf("As raíses são iguais, e valem : X= %.2f", x1);
		 }else {
			 System.out.print("As raíses são diferentes, e valem :");
			 System.out.println();
			 System.out.printf("x1 =  %.2f", x1);
			 System.out.println();
			 System.out.printf("x2 =  %.2f", x2);
			 
		 }
		 
	 }
	
	 

	}
}
