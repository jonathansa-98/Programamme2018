import java.util.Scanner;
public class problema_205{ 
	public static void main(String args[]){ 
		Scanner ask=new Scanner(System.in);
		int num=0;
		int res;
		int inv;
		int cas;
		int cont;
		boolean capicua;
		cas=ask.nextInt();
		for(int i=0; i<cas; i++){	
			res=ask.nextInt();
			capicua=false;
			cont=0;
			inv=0;
			while(res<=1000000000 && !capicua){
				num=res;
				inv=0;
				while(num>0){ 
					inv=inv*10+num%10; 
					num=num/10;
				}
				if(cont>1 && inv==res){capicua=true;}
				cont++;
				if(!capicua){res=res+inv;}
			}
			if(!capicua) System.out.println("Lychrel?");
			else System.out.format("%d %d%n",cont, res + inv); //formato especifico de int, int i salto linia.			
		}
	}
}
	
/*
Números de Lychrel
Tiempo máximo: 4,000 s  Memoria máxima: 4096 KiB
Cuando se aburren, los aficionados a las matemáticas se dedican a jugar con los números. Eso les lleva, por ejemplo, a coger cualquier número, darle la vuelta y sumarlo a sí mismo, repitiendo el proceso una y otra vez hasta dar con un número capicúa. Por ejemplo, para el 91 llegamos a un capicúa en sólo dos pasos:

91 + 19 = 110
110 + 011 = 121

Algunos números se resisten a alcanzar un capicúa. El 196 es el número más pequeño para el que no se ha llegado a ninguno, por más que se ha intentado. Los matemáticos no han podido demostrar que, efectivamente, no vaya a llegarse a uno. Mientras continúan buscando una demostración, los aficionados siguen sumando y sumando con la esperanza de llegar a él. Los números con los que, se sospecha, no puede alcanzarse un capicúa se conocen como números de Lychrel. Curiosamente, algunos números capicúa parecen ser también números de Lychrel.

Entrada
La entrada comienza con un número indicando la cantidad de casos de prueba que vendrán a continuación. Cada caso de prueba estará compuesto de un número 1 ≤ n ≤ 100.000.

Salida
Para cada caso de prueba n, el programa deberá indicar el número de iteraciones que hay que dar hasta llegar a un número capicúa, seguido del número capicúa alcanzado. Si durante el proceso se llega a un número mayor que 1.000.000.000, se deberá asumir que el capicúa no es alcanzable y escribir "Lychrel?"1.

Entrada de ejemplo
4
91
196
4994
5445
Salida de ejemplo
2 121
Lychrel?
Lychrel?
4 79497
* */
