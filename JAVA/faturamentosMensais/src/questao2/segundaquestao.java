package questao2;
import java.util.Scanner;
import java.util.ArrayList;
public class segundaquestao {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Float> faturamentos = new ArrayList<Float>(); // ArrayList para receber os faturamentos
		float faturamento = 0;// faturamento atual
		float somafat = 0; // soma dos faturamentos
		double mediafat; // media dos faturamentos
		float maiorfat = -1; //maior faturamento
		float menorfat; //menor faturamento
		int meses = 0; // contador para os meses
		int mesmaiorfat; // mes do maior faturamento
		int anomaiorfat; // ano do maior faturamento
		int mesmenorfat; // mes do menor faturamento
		int anomenorfat; // ano do menor faturamento
		ArrayList<Integer>ano = new ArrayList<Integer>(); // ano do faturamento
		int cont = 0;
		
	  
		// coletando os faturamentos mensais
		System.out.println("FATURAMENTOS MENSAIS");
		System.out.println("---------------------------------------------------------------------------------------- ");
		System.out.println("Insira o ano: ");
		ano.add(teclado.nextInt());
	    System.out.println("Insira o faturamento do " + (meses+1) +"° mês de "+ ano+": (para encerrar - faturamento neg)");
		faturamentos.add(teclado.nextFloat());
		menorfat =faturamentos.get(cont);
		mesmenorfat = meses+1;
		anomenorfat = ano.get(cont);
		maiorfat = faturamentos.get(cont);
		mesmaiorfat = meses+1;
		anomaiorfat = ano.get(cont);
		somafat += faturamentos.get(cont);
		
		while ( faturamentos.get(cont) > -1 ) {
			if( meses == 0 ) {
			 System.out.println("---------------------------------------------------------------------------------------- ");
			 System.out.println("Insira o ano: ");
			 ano.add(teclado.nextInt());
			 System.out.println("Insira o faturamento do " + (meses+1) +"° mês de "+ ano +": (para encerrar - faturamento neg)");
			 faturamentos.add(teclado.nextFloat());
			}
		 while ( faturamentos.get(cont) > -1 && meses < 11 ) {
			 meses++ ;
			 cont ++;
		   System.out.println("Insira o faturamento do " + (meses+1) +"° mês de " + ano+": (para encerrar - faturamento neg)");
			faturamentos.add(teclado.nextFloat());
			somafat += faturamentos.get(cont);
			
			if(faturamentos.get(cont) >= maiorfat) {
				maiorfat = faturamentos.get(cont);
				mesmaiorfat = meses+1;
				anomaiorfat = ano.get(cont);
			}
			
			if(faturamentos.get(cont) <= menorfat) {
				menorfat = faturamentos.get(cont);
				mesmenorfat = meses+1;
				anomenorfat = ano.get(cont);
			}
     
	     }
		 meses =0;
		
		 if(faturamentos.get(cont) >= maiorfat) {
				maiorfat = faturamentos.get(cont);
				mesmaiorfat = meses+1;
				anomaiorfat =ano.get(cont);
			}
			
			if(faturamentos.get(cont) <= menorfat) {
				menorfat = faturamentos.get(cont);
				mesmenorfat = meses+1;
				anomenorfat = ano.get(cont);
			}
	    }
			
		mediafat = somafat/faturamentos.size();
		
		for(cont = 0; cont <= faturamentos.size(); cont ++) {
			System.out.printf("Faturamento do %2d ° mês:  %.2f ", (cont+1), faturamentos.get(cont) );
			System.out.println();
		}
		
		System.out.println("O menor faturamento foi: " + menorfat);
		 System.out.println();
		System.out.println("E ocorreu no " + mesmenorfat+ "° mês de "+ anomenorfat);
		 System.out.println();
		System.out.println("O maior faturamento foi: " + maiorfat);
		 System.out.println();
		System.out.println("E ocorreu no " + mesmaiorfat+ "° mês de "+ anomaiorfat);
		System.out.println();
		System.out.println("A media dos faturamentos foi: " + mediafat);
      }
}
	
