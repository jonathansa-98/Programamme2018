import java.util.Scanner;
public class problema_138{
	public static void main(String args[]){
		Scanner dc=new Scanner(System.in);
		int casos=dc.nextInt();
		for (int i=0; i<casos; i++){
			int num=dc.nextInt();
			int res=0;
			while(num>0){	//Nomes tenim que trobar les divisions de numero amb 5 i del resultat dividir per 5 fins que el divisor sigui 0; 
				num=num/5;
				res=res+num;
			}
			System.out.println(res);
		}
	}
}

//http://www.ecoribera.org/ciencias/matematicas/1-bachillerato/127-calculo-de-los-ceros-de-un-factorial

/*
Ceros del factorial
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
El factorial de un número n (representado como n!) es el resultado de multiplicar todos los números entre 1 y el propio n:

n! = 1 · 2 · …  · (n − 1) · n = (n − 1)! · n

Además, por convenio, el factorial de 0 es 1 (es decir, 0! = 1).

Es sabido que el factorial crece muy rápidamente, de forma que para n's pequeños se obtienen n! con un gran número de dígitos; por ejemplo, el factorial de 24 es 620.448.401.733.239.439.360.000, un número que está muy lejos del máximo soportado en los tipos int de los lenguajes de programación tradicionales de 32 bits.

El escenario empeora rápidamente; 70! es el primero que rompe la barrera de los 100 dígitos, mientras que 100! tiene ya 158.

Es por esto que hoy, en vez de intentar calcular el factorial de semejantes números, nos conformaremos con saber cuántos ceros tienen al final.

Entrada
La entrada comenzará con un número natural indicando el número de casos de prueba. Cada caso de prueba aparecerá en una línea independiente con un número natural entre 0 y 2³¹ − 1.

Salida
Para cada caso de prueba, el programa mostrará el número de dígitos a 0 consecutivos que aparecen a la derecha (dígitos menos significativos) de su factorial.

Entrada de ejemplo
3
5
10
24
Salida de ejemplo
1
2
4
*/
