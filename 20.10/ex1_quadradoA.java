import java.util.Scanner;
public class ex1_quadradoA {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i]*a[i];
		}
		ler.close();
		System.out.print( "\nC = ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
		}
	}
}
