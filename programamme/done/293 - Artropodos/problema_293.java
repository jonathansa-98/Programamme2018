import java.util.Scanner;
public class problema_293{ 
	public static void main(String args[]){ 
		Scanner in=new Scanner(System.in);
		int cas=in.nextInt();
		int ins;
		int ara;
		int cru;
		int esc;
		int ani;
		for(int n=0;n<cas;n++){
			ins=in.nextInt();
			ara=in.nextInt();
			cru=in.nextInt();
			esc=in.nextInt();
			ani=in.nextInt();
			System.out.println(ins*6+ara*8+cru*10+esc*ani*2);
		}
	}
}

/*
Artrópodos
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB

Entrada
La entrada comienza con un numero indicando la cantidad de casos de prueba que deberan procesarse.
Cada caso de prueba esta compuesto por cinco numeros. El primero indica el numero de insectos
(6 patas), el segundo el numero de aracnidos (8), el tercero el numero de crustaceos (10). El cuarto y el
quinto representan, respectivamente, el numero de escolopendras y el numero de anillos de las mismas
(todas tienen el mismo). Recuerda que las escolopendras tienen 2 patas por anillo.

Salida
Para cada caso de prueba, el programa escribira el numero de patas. Se garantiza que en ningun caso
este numero sera mayor que 1.000.000.000.

Entrada de ejemplo
2
1 1 1 1 15
2 3 1 4 52

Salida de ejemplo
54
462*/
