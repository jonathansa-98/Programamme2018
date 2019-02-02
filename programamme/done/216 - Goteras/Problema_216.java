import java.util.Scanner;
public class Problema_216{ 
	public static void main(String args[]){ 
		Scanner in=new Scanner(System.in);
		int cas=in.nextInt();
		for(int n=0;n<cas;n++){
			int gota=in.nextInt();
			int h=0;
			int m=0;
			int s=0;
			String hh="";
			String mm="";
			String ss="";
			if(gota>0 & gota<=86400){
				while(gota>0){
					s++;
					gota--;
					if(s>=60){
						m++;
						s-=60;
						if(m>=60){
							h++;
							m-=60;
						}
					}
				}
				if(h<10){hh="0"+h;}
				else 	{hh=""+h;}
				if(m<10){mm="0"+m;}
				else 	{mm=""+m;}
				if(s<10){ss="0"+s;}
				else 	{ss=""+s;}
				System.out.println(hh+":"+mm+":"+ss);
			}
		}
	}
}


/*
Goteras
Tiempo máximo: 4,000 s  Memoria máxima: 4096 KiB
Cubo con el agua de una gotera
Con la llegada de las lluvias, has descubierto una molesta gotera en el salón. Con precisión
suiza, las gotas caen una vez por segundo desde el techo hasta un improvisado cubo que te ves
obligado a vaciar periódicamente hasta que encuentres una solución.

Convivir con una gotera es complicado porque tienes que sincronizar tu vida alrededor de los 
vaciados del cubo…

Entrada
La entrada estará compuesta de un primer número indicando cuántos casos de prueba 
vendrán a continuación.

Cada caso de prueba será un número mayor que cero con el número de gotas que 
entran en el cubo.

Salida
Para cada caso de prueba, el programa escribirá en una línea el tiempo máximo que 
puedes estar sin cambiar el cubo en el formato HH:MM:SS, donde HH indica el número de horas, 
MM el número de minutos y SS el número de segundos.

Ningún cubo es tan grande como para poder estar más de un día completo sin cambiarse.

Entrada de ejemplo
3
70
3600
3661
Salida de ejemplo
00:01:10
01:00:00
01:01:01*/
