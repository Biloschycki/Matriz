package fiap;

import java.util.Scanner;

public class Aula07_Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int[][] milhagem = new int [4][5];
		
for(int i=0;i<4;i++) {
	System.out.println("Digite o código do "+(i+1)+"° cliente:");
	milhagem[i][0]=entrada.nextInt();
	System.out.println("Digite a quantidade de milhagem:");
	milhagem[i][1]=entrada.nextInt();
	System.out.println("Digite a categoria:");
	milhagem[i][2]=entrada.nextInt();
	while(milhagem[i][2]>3 || milhagem[i][2]<1) {
		System.out.println("Digite a categoria corretamente 1/2/3:");
		milhagem[i][2]=entrada.nextInt();
	}//enquanto
	if(milhagem[i][2]==1) {
		milhagem[i][3]=10000;
	}else {
		if(milhagem[i][2]==2) {
			milhagem[i][3]=5000;
		}else {
			milhagem[i][3]=0;
		}
	}
	
	milhagem[i][4]=milhagem[i][1] +	milhagem[i][3];
	
    System.out.println("Dados do cliente " + (i + 1) + ":");
    System.out.println("Código: " + milhagem[i][0]);
    System.out.println("Milhagem: " + milhagem[i][1]);
    System.out.println("Categoria: " + milhagem[i][2]);
    System.out.println("Bônus: " + milhagem[i][3]);
    System.out.println("Total: " + milhagem[i][4]);
    System.out.println();
}
		
		
		
		
		
		
		
		
		
		
	}//class

}//main
