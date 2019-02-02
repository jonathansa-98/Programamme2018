import java.util.Scanner;
public class problema_434{
	public static void main(String args[]){
		Scanner dc=new Scanner(System.in);
		int casos=dc.nextInt();
		for(int i=0; i<casos; i++){
			int n1=dc.nextInt();
			int n2=dc.nextInt();
			if(n1>n2){
				System.out.println("PRINCIPIO");
			}else{
				System.out.println("ROMANCE");
			}
		}
	}
}

/*
Romance en el palomar
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
Palomas en sus habitáculos
Higinio es un abuelito venerable empeñado en mantener a flote su negocio de palomas mensajeras. Desde hace más de 60 años tiene en su pueblo perdido de las arribes del Duero un palomar al que dedica sus horas llenándolo de cuidados y cariño.

Para que el palomar no se vaya a pique es muy importante que la población de palomas se mantenga. Y para evitar tener que ir a ferias a comprar las aves, lo mejor es que los romances se den entre los ejemplares del propio palomar. Y la verdad es que ahí Higinio siempre se ha considerado privilegiado: todas las mañanas, invariablemente desde hace 60 años, descubre que en alguno de los habitáculos ha dormido más de una paloma.

Sin embargo hoy su hermana Leonor le ha puesto en alerta. Dice que ha leído en la güiquipedia (está seguro de que no se escribe así...) que los matemáticos tienen desde 1834 lo que llaman el "principio del palomar". Ese principio establece que si n palomas se distribuyen en m habitáculos y se tiene que n > m, entonces habrá al menos un habitáculo en el que haya más de una paloma. Es decir, que las noches en las que bloquea, por limpieza, el uso de demasiados habitáculos, igual en lugar de tener romances tiene a los animales amontonados por obligación…

Entrada
La entrada comienza con una línea con un número que indica el número de casos de prueba que siguen.

Cada caso de prueba, en una línea independiente, contiene los datos de una noche en el palomar: número de ejemplares que duermen en él (al menos dos) y número de cajas disponibles. Ninguno de los números será mayor que 1.000.000.

Salida
Sabiendo que siempre se encuentra dos palomas en al menos un habitáculo, por cada caso de prueba se escribirá una línea que indicará si Higinio puede estar seguro de que esa noche ha habido un romance (escribiendo ROMANCE) o puede ser cosa del principio del palomar (escribiendo PRINCIPIO).

Entrada de ejemplo
2
2 5
5 2
Salida de ejemplo
ROMANCE
PRINCIPIO
*/
