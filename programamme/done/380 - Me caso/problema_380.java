import java.util.Scanner;
public class problema_380 {
	public static void main(String[] args){
		Scanner ask = new Scanner(System.in);
		int gastos;
		int k=0;
		int valor;
		int total;
		do{
			gastos=ask.nextInt();
			if(gastos>0 & gastos<=50000){
				total=0;
				for(k=0;k<gastos;k++){
					valor=ask.nextInt();
					total=total+valor;
				}
				System.out.println(total);
			}
		}while(gastos>0 & gastos<=50000);
	}
}

/*
Entrada
	Cada caso de prueba comienza con un número n indicando la cantidad de gastos que se 
	sufren al organizar una boda (como mucho 50.000). A continuación aparecen, 
	en otra línea, n números positivos con todos esos gastos.

	La entrada termina con una boda sin gastos (obviamente imposible) que no debe procesarse.

Salida
	Para cada caso de prueba se escribirá, en una línea independiente, 
	el coste total de la boda. Todo está por las nubes, pero la suma de los gastos será menor que 10^9.

Entrada de ejemplo
4
100 200 100 200
2
50 25
0
Salida de ejemplo
 
600
75

¡Me caso!
Tiempo máximo: 1,000-2,000 s  Memoria máxima: 4096 KiB
Pies de unos novios con zapatillas
Cada vez que un familiar o un amigo me dice las temidas palabras "¡Me caso!", 
mientras mi cara pone gesto de alegría mi cartera echa a temblar. Luego viene la 
hipocresía de la invitación. ¿¡Pero cómo que "invitación"!? La RAE lo deja bien claro… 
La segunda acepción de invitar es "Pagar el gasto que haga o haya hecho otra persona, 
por gentileza hacia ella". Sí, es verdad… formalmente la comida o cena no la pago directamente; pero 
si no se hace un regalo digno de la celebración, te pondrán en la lista de los invitados poco populares.

Esta opinión dura hasta que… el que se casa eres tú. Y es que, creo que no lo he dicho, 
¡me caso! Y desde que lo sé, soy más de la primera acepción de la RAE: 
"Llamar a alguien para un convite o para asistir a algún acto". Que, digo yo, el que se casa soy yo, 
vale, pero todos lo vamos a celebrar, nos vamos a divertir, y vamos a engordar un par de kilos... 
no va a salir todo de mis costillas, ¿no?

Y es que esto de las bodas es muy bonito, un día inolvidable y todo lo que tú quieras. 
Pero por muy especial que sea y lo hagamos con toda la ilusión sin llevarnos nada a cambio, 
el que imprime las invitaciones, el que hace los obsequios para los invitados y el del banquete 
quieren su dinero, por mucho que nos feliciten. Así es que nos pasamos las noches en vela, sumando 
y sumando gastos, pensando en poner en la limusina el logo de algún banco que nos patrocine a ver si 
conseguimos no exprimir tanto a nuestros, ejem, invitados.
* */
