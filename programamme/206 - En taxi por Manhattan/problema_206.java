import java.util.Scanner;
import java.lang.Math;
public class problema_206 {
    
    public static void main(String[] args) {
		Scanner ask=new Scanner(System.in);
		int casos=ask.nextInt();	
		for(int i=0; i<casos; i++){
			double hipo=ask.nextInt();
			double coseno=Math.sin(Math.toRadians(30));
			double co=hipo*seno;
			double ca=hipo*Math.cos(Math.toRadians(30));
			
			System.out.println(ca+co);			
		}
    }
}

/*
En taxi por Manhattan
Tiempo máximo: 4,000 s  Memoria máxima: 4096 KiB
Debido al crecimiento de población en la isla de Manhattan (entre 1790 y 1810 se había triplicado), en 1811 se presentó el conocido como "plan de los comisionados" (Commisioners' plan) que planteó un plano de la futura ciudad organizándola en una cuadrícula. En ella, las avenidas cruzarían la isla de Norte a Sur, mientras que las calles lo harían de Oeste a Este, creando manzanas de unos 5 acres. Esta regularidad en el plano, unido a que las avenidas y calles se numeran en lugar de bautizarse con nombres de personajes ilustres, hace que, desde entonces, orientarse por Manhattan sea un juego de niños.

La pega para los peatones, sin embargo, es que no hay atajos. Cuando alguien debe desplazarse de un lugar a otro, está obligado a moverse o bien en horizontal o bien en vertical, pues no existen calles que recorran la isla en diagonal.

Ejemplo de desplazamiento por Manhattan
Pero para los turistas que cogen taxis es una bendición, porque es muy fácil darse cuenta cuándo los conductores de estos famosos coches amarillos intentan dar un rodeo para llevarlos a su destino. En Nueva York, es muy difícil ser taxista defraudador... ¿verdad?

Entrada
La entrada comienza con un número que indica la cantidad de casos de prueba que habrá que procesar.

Cada caso de prueba consiste en una línea con un número natural 1 ≤ n ≤ 30.000 que representa la distancia en diagonal entre el punto origen y el punto destino de un turista en Nueva York. Ambos puntos estarán siempre en el centro de las intersecciones de dos calles y avenidas distintas.

Salida
Para cada caso de prueba, el programa escribirá, en una línea independiente, la distancia mínima que habrá recorrido el taxi para llevar al turista a su destino. La distancia entre el centro de dos cruces adyacentes es de 1.

Si para la distancia del caso de prueba existen varios posibles destinos, se asumirá que el turista ha solicitado ir a aquél que esté más cerca en taxi. Además, se garantiza que todos los casos de prueba tendrán al menos un destino válido.

Entrada de ejemplo
3
13
15
25
Salida de ejemplo
17
21
31
* */
