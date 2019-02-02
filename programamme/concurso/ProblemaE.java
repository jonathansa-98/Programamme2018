/*Peso menos
 * minimo O2
 * 
 * si naves son aptas (cumplen nivel de O2)
 * 		ordenar por mas oxigeno a menos
 * 		ordenar por menos peso a mas. Si son == por mayor oxigeno
 * 
 * */
import java.util.Scanner;
public class ProblemaE {
	
	public static int[] ordenarTaula(int ordenada[]) {
		int i=1;
		int u=ordenada.length-1;
		int num_reg=0;
		for(i=1; i<ordenada.length; i++){
			u=ordenada.length-1;
			for(u=ordenada.length-1; u>i-1; u--){
				if(ordenada[u-1]>=ordenada[u]){
					num_reg=ordenada[u];
					ordenada[u]=ordenada[u-1];
					ordenada[u-1]=num_reg;
				}
			}
		}
		return ordenada;
	}
	
	public static int[] ordenarTaulaInvers(int inversa[]) {
		int i=1;
		int u=inversa.length-1;
		int num_reg=0;
		for(i=inversa.length; i>1; i--){
			u=i-1;
			for(u=i-1; u<inversa.length-1; u++){
				if(inversa[u-1]>=inversa[u]){
					num_reg=inversa[u];
					inversa[u]=inversa[u-1];
					inversa[u-1]=num_reg;
				}
			}
		}
		return ordenada;
	}
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int numCasos;
		numCasos=in.nextInt();
		for (int i = 0; i <	numCasos; i++){
			System.out.println("Caso"+(numCasos+1)+":");
			int oxi_min;
			int naves;
			oxi_min=in.nextInt();
			if(oxi_min>=1 && oxi_min<=100000){
				naves=in.nextInt();
				int[] cant_oxi=new int[naves];
				int[] peso=new int[naves];
				for (int n = 0; n <	naves; n++){
					cant_oxi[n]=in.nextInt();
					peso[n]=in.nextInt();
				}
				
				
			}
		}
	}
}
