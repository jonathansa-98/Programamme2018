import java.util.Scanner;
public class problema_253{ 
	public static void main(String args[]){ 
		Scanner ask=new Scanner(System.in);
		int dim;
		int caras;
		int serp;
		int esc;
		int num1;
		int num2;
		boolean stop=false;
		int pos;
		do{
			stop=false;
			dim=ask.nextInt();
			caras=ask.nextInt();
			serp=ask.nextInt();
			esc=ask.nextInt();
			System.out.println("hola");
			if(caras>=1 && caras<=100 && dim>=1 && dim<=100 && caras<=dim){	//compureba el tablero i dado
				int[] tablero=new int[dim*dim];		//crea el tablero
				System.out.println("que");
				for(int i=0; i<serp+esc; i++){	//pone las serpientes y escaleras
					num1=ask.nextInt();
					num2=ask.nextInt();
					System.out.println("tal");
					if(	num1>1 && num1<dim*dim &&
						num2>1 && num2<dim*dim && 
						num1!=tablero[num1] && num1!=tablero[num2] &&
						num2!=tablero[num1] && num2!=tablero[num2]){	//comprueba si son validas
						
						tablero[num1]=num2;
						tablero[num2]=num2;
						System.out.println(num1+"-"+num2);
					}
				}
			}else if(dim==0 && caras==0 && serp==0 && esc==0){stop=true;}	//salida de programa
		}while(!stop);
	}
}

/*
 * 		4 3
 * 		1 2
 * 
 * 		2 3
 * */
	
/*
Haciendo trampas en Serpientes y Escaleras
Tiempo máximo: 2,000 s  Memoria máxima: 8192 KiB

Entrada
La entrada consta de una serie de casos de prueba. En la primera línea de cada 
caso aparecen cuatro números: 
la dimensión N del tablero, 
el número K de caras del dado (K ≤ N), 
el número S de serpientes y el número E de escaleras. 
Las siguientes S + E líneas contienen cada una dos números, 
indicando la casilla inicial y la casilla final de una serpiente 
(las S primeras) o una escalera (las E siguientes). 
Tanto N como K son números entre 1 y 100.

La entrada termina con 0 0 0 0.

Salida
Para cada caso de prueba se escribirá el menor número de movimientos necesarios 
para ganar la partida. Está garantizado que la casilla final es alcanzable 
desde la inicial en todos los casos.

Entrada de ejemplo
10 6 5 6
50 13
68 55
81 16
93 43
98 36
3 60
6 47
32 53
45 86
51 94
61 83
0 0 0 0
Salida de ejemplo
3
* */
