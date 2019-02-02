import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class problema_431 {
    
    public static void main(String[] args) {
		Scanner ask=new Scanner(System.in);
		int casos=ask.nextInt();	
		int k;	
		while(casos!=0){
			k=0;
			Integer[] fam=new Integer[casos];
			for(int i=0; i<casos; i++){
				int n_hijos=ask.nextInt();
				int midi=ask.nextInt();
				int fuerza=0;
				for(int n=0; n<n_hijos; n++){
					int midi_hijo=ask.nextInt();
					if(midi_hijo*midi>fuerza){fuerza=midi_hijo*midi;}
				}
				fam[i]=fuerza;				
			}
			Arrays.sort(fam,Collections.reverseOrder());
			for(k=0; k<fam.length-1; k++){
				System.out.print(fam[k]+" ");
			}
			System.out.println(fam[k]);
			casos=ask.nextInt();
		}
    }
}

//Arrays.sort(nombres, Collections.reverseOrder());
	
/*
Genética Jedi
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Pequeños padawans
Las fuerzas aliadas están muy preocupadas: hace años que no se sabe nada de los Jedis y se teme que su desaparición sea definitiva. Para buscar una solución han dado instrucciones a los mejores genetistas de la República para que encuentren el hijo con mayor número de midiclorianos de cada familia y así poder refundar la Orden.

Los genetistas han descubierto que la cantidad de midiclorianos de un hijo es el número de midiclorianos que obtiene de los padres multiplicado por la influencia de la Fuerza el día del nacimiento del niño.

En los sistemas planetarios hay muchas familias candidatas, así que se necesita un programa que procese los datos y ordene de mayor a menor el número de midiclorianos del mejor hijo de cada familia.

Entrada
El programa deberá leer, de la entrada estándar, múltiples casos de prueba. Cada uno comienza con un número 1 ≤ F ≤ 20 indicando el número de familias analizadas, seguido de la información de cada una de ellas.

Para cada familia se especifica, en una primera línea, el número de hijos de la familia (al menos uno), seguido de la cantidad de midiclorianos que los padres transmiten a sus retoños. La segunda línea contiene un número por cada uno de los hijos, indicando la influencia de la Fuerza el día de su nacimiento.

La entrada termina con un caso sin familias.

Salida
Para cada caso, el programa escribirá una línea de números ordenada de mayor a menor con los midiclorianos del mejor hijo de cada familia. Se garantiza que ningún número será mayor que 109.

Entrada de ejemplo
2
2 20
0 10
1 30
15
1
2 50
1 15
0

Salida de ejemplo
450 200
750
* */
