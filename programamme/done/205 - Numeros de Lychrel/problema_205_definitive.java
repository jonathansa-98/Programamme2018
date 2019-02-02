import java.util.Scanner;
public class problema_205_definitive {
	
    public static int reverse(int num) {
        int inv=0;
        while(num>0){
            inv=inv*10+num%10;
            num=num/10;
        }
        return inv;
    }

    public static boolean esCapicua(int num) {
        return num==reverse(num);
    }

    public static void lychrel(int res) {
        int cont=1;
        int inv=reverse(res);
        boolean trobat=false;

        while(!trobat && (res+inv)<=1000000000) {
            if(esCapicua(res+inv)) {
                trobat=true;
            } 
            else{
                res=res+inv;
                inv=reverse(res); 
                cont++;
            }
        }
        if(trobat){
			System.out.format("%d %d%n",cont, res+inv); //formato especifico de int, int i salto linia.
        }
        else{System.out.format("Lychrel?%n");}
    }   
    
    public static void main(String[] args) {
		Scanner ask=new Scanner(System.in);
		int casos=Integer.parseInt(ask.next().trim());
		for (int i=0; i<casos; i++) {
			int num=Integer.parseInt(ask.next().trim());
			lychrel(num);
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
