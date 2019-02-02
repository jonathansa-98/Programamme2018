import java.util.Scanner;
public class problema_191 {
	public static void main(String[] args){
		Scanner ask = new Scanner(System.in);
		int casos=ask.nextInt();
		int compartiments;
		int litres;
		int dif;
		int total=0;
		for(int n=0;n<casos;n++){
			compartiments=ask.nextInt();
			litres=ask.nextInt();
			dif=ask.nextInt();
			total=litres;
			for(int k=0;k<compartiments-1;k++){
				litres=litres-dif;				
				total=total+litres;
			}
			System.out.println(total);
		}
	}
}
	
/*	Entrada
La entrada comienza con un número no negativo indicando el número de casos de 
prueba que vendrán a continuación. Por cada caso de prueba se proporcionará, 
en una única línea, la descripción del acuario con tres números: 
* 
* el número de compartimentos del acuario (>0), 
* la capacidad en litros del más grande (>0), y 
* la diferencia de litros entre dos compartimentos adyacentes (≥0). 
* 
* Ninguno de los tres números será mayor de 10.000.

Salida
Para cada caso de prueba de la entrada, el programa escribirá el número de litros 
que debieron comprarse para llenar el acuario.

Entrada de ejemplo
3
5 300 10
4 400 20
3 500 30
* 
Salida de ejemplo
1400
1480
1410
 * */
