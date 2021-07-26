import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
		      
		System.out.print("****** BEM VINDOS AO JOGO DE PAR OU IMPAR!!!! ****** \n ");
		System.out.print("---DECIDAM QUEM SERÁ O JOGADOR 1 E O JOGADOR 2 --- \n" );
		System.out.print("  - JOGADOR 1 SERÁ PAR E O JOGADOR 2 SERÁ IMPAR - \n \n " );
		
		
		    
		String jogador1;
		String jogador2;    
    	int numJog1, numJog2, resultado, resp;
		
		do{
		System.out.println("Jogador 1 digite seu Nome : ");
		jogador1 = sc.nextLine();
		
     	System.out.println("Jogador 2 digite seu Nome : ");
	    jogador2 = sc.nextLine();
	    
	    
		System.out.println(jogador1 + " voce vai ser PAR!! ");
	    System.out.println(jogador2 + " voce vai ser IMPAR!!\n ");
	    
		do{
		    
		System.out.println(jogador1 + " escolha um numero de 1 a 5 :");	
		numJog1 = leitor.nextInt();
		
		}while(numJog1<1||numJog1>5);
		
	    
	    do{
	    
	    System.out.println(jogador2 + " escolha um numero de 1 a 5 : ");
	    numJog2 = leitor.nextInt();
	    
    	} while(numJog2<1||numJog2>5);
    
	    resultado = (numJog1+numJog2);
	    
	    if(resultado%2==0){
	    System.out.println("resultado do jogo foi = " + resultado + " --> " + " PAR  " );
        System.out.println("Parabens " + jogador1 + " voce venceu !!! \n");
	    }else{
	    System.out.println("resultado do jogo foi = " + resultado + " --> " + " IMPAR  ");
	    System.out.println("Parabens " + jogador2 + " voce venceu!!! \n");
	    }
	    
	    
	    System.out.println("digite 1 para nova rodada ou 0 para encerrar : ");
	    resp = leitor.nextInt();
	
	    
     	}while(resp ==1);
}	
	
}







