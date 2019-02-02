/* La Mascletà es una fiesta donde explotan muchos petardos y se genera color, ruido, olor a
 * pólvora, etc....
 * Fallerencio, por su prestigio como fallero, ha sido contratado por la agencia del impacto
 * acústico de Valencia con el fin de ver el impacto de las mascletàs en la salud. En concreto,
 * le han pedido que asista a varias Mascletàs y mida el máximo de decibelios alcanzado.
 * Fallerencio ha acudido a varias Mascletàs y mientras se lo pasaba pipa, ha realizado su
 * trabajo y ha obtenido un listado de cuántos decibelios ha alcanzado cada Mascletà.
 * 
 * Entrada
 * 		En primer lugar, un número N indicando cuántos casos de prueba habrá.
 * 		1 ≤ N ≤ 100
 * 		Habrá una línea por cada caso de prueba. Cada una de esas líneas constará de:
 * 		Un primer número M que indicará cuántas Mascletàs tiene registradas Fallerencio. Tras ello
 * 		aparecerán esos M números enteros indicando la cantidad de decibelios (K) que alcanzó
 * 		cada Mascletà.
 * 		1 ≤ M ≤ 1000
 * 		0 ≤ K ≤ 100000
 * Salida
 * 		Se mostrarán N líneas, una por cada caso de prueba, donde se indicará la mayor y la menor
 * 		lectura de decibelios de las Mascletàs.
 * 
 * Ejemplo de entrada
 * 3 pruebas
 * 5 10 1 22 33 4	1 prueba con 6 mascletas cada una tiene K decibelios
 * 1 10
 * 3 1 1 2
 * 
 * Ejemplo de salida
 * 33 1
 * 10 10
 * 2 1
 * */
 
import java.util.Random;

class ProblemaA2017{
	public static void main(String args[]){
		byte n=3;
		int m;
		int k;
		Random ran=new Random();
		byte cas=1;
		short mascleta=1;
		int mayor;
		int menor;		
		for(cas=1;cas<=n;cas++){
			mayor=0;
			menor=40;
			m=ran.nextInt(7)+2;
			for(mascleta=1;mascleta<=m;mascleta++){
				k=ran.nextInt(40)+1;
				if(mayor<k){
					mayor=k;
				}
				if(menor>k){
					menor=k;
				}
			}
			System.out.println("prova "+cas+": "+mayor+"db "+menor+"db\n");
		}
	}
}
