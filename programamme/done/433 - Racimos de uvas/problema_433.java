import java.util.Scanner;
public class problema_433 {
	public static void main(String[] args){
		Scanner ask = new Scanner(System.in);
		int uvas;
		do{
			uvas=ask.nextInt();
			if(uvas>=1 & uvas<=1000000){
				int num=1;
				int sum=1;
				while(num<uvas) {
					num=num+(++sum);
				}
				System.out.println(sum);
			}
		}while(uvas>=1 & uvas<=1000000);
	}
}

/*
Racimos de uvas
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB

Los racimos de uvas perfectos, los bonitos, los de pata negra, son los que tienen una uva abajo del todo,
y luego, al ir subiendo, el número de uvas del nivel siguiente se incrementa, como mucho, 
en una uva cada vez. Dicen que los mejores sumilleres son capaces de identificar, no sólo los taninos,
aromas de madera o corpulencia de un buen vino, sino también si los racimos que se usaron eran o no 
perfectos. Yo, francamente, no me lo creo.

Sin embargo, por si acaso, los enólogos y los responsables de las vides sí tienen en consideración 
la forma de los racimos. Puestos a elegir, prefieren aquellos que, además de ser perfectos, tienen 
el menor número de niveles posible para la cantidad de uvas que contienen. De esa forma se consiguen 
racimos más compactos, que son más fáciles de almacenar antes de ser prensados.

Entrada
El programa deberá leer de la entrada estándar múltiples casos de prueba. 
Cada uno contendrá un único número 1 ≤ n ≤ 1.000.000 indicando el número de uvas de un racimo.

La entrada termina con un caso con 0 uvas que no deberá procesarse.

Salida
Para cada caso de prueba el programa escribirá el menor número de niveles posible que deberá 
tener un racimo perfecto con n uvas, de modo que tanto sumilleres como enólogos estén contentos con él.

Entrada de ejemplo
10
40
0
Salida de ejemplo
4
9
*/
