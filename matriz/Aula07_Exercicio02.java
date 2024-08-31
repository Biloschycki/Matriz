package fiap;

import java.util.Scanner;

public class Aula07_Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[][] m = new int [2][2];
		int[][] r = new int [2][2];
		int maiorNumero = 0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.println("Informe um número ["+i+","+j+"]:");
			m[i][j]=entrada.nextInt();
			
			if(m[i][j]>maiorNumero) {
				maiorNumero=m[i][j];
			}
			
			
			
			
			
			
			
			
			}
		}
		System.out.println("Maior elemento:"+maiorNumero);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				r[i][j]=m[i][j]*maiorNumero;
				System.out.println("Resultado - Matriz R["+i+ ","+j+"]:"+r[i][j]);
			}
			
		}
		
		
		
		
		
		
		
		
	}//class

}///main
