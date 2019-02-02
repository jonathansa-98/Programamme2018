import java.util.Scanner;
public class problema_114 {
    public static void main(String args[]){
		Scanner ask=new Scanner(System.in);
		int casos=ask.nextInt();
		for(int i=0; i<casos; i++){  
			int n=ask.nextInt();
			int facto=1;
			if(n<5){
				for(int j=1;j<=n;j++){
					facto*=j;
				}
				System.out.println(facto%10);
			}
			else System.out.println(0);	//a partir del 5! tots els factorials acaben per 0;
		}
    }
}
	
/*
Último dígito del factorial
Tiempo máximo: 3,000 s  Memoria máxima: 4096 KiB
Tu primo Luis, de 12 años, está aprendiendo a usar la calculadora. Su profesor le ha dicho que calcule el factorial de varios números. Pero, para evitar que le tengan que copiar números muy largos en el cuaderno, les ha pedido únicamente el último dígito, el de más a la derecha.

Recordando que el factorial es la multiplicación de todos los números entre el número y el uno (por ejemplo, el factorial de 8, escrito 8!, es 8 · 7 · 6 · 5 · 4 · 3 · 2 · 1), demuestra a tu primo Luis que tú eres capaz de hacerlo mucho más rápido que él.

Entrada
El programa recibirá en la primera línea de la entrada el número de casos de prueba. A continuación, cada caso de prueba estará compuesto de una única línea que contendrá un número (positivo).

Salida
Por cada caso de prueba n, se mostrará el último dígito (el de la derecha) de su factorial, n!.

Entrada de ejemplo
3
2
3
4
Salida de ejemplo
2
6
4
* */
