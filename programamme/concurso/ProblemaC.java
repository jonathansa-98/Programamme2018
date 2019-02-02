import java.util.Scanner;
public class ProblemaC {

	public static boolean primers(int n) {
		int resto=0;
		for (int divisor=2; divisor<n; divisor++) {
			resto=n%divisor;
			if (resto==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int numCasos;
		numCasos=in.nextInt();		
		if(numCasos>=1 && numCasos<=100){
			for(int n=0; n<numCasos; n++){
				int i=2;
				int num=0;
				String num_cad="";
				int cont=0;
				int x=in.nextInt();
				for(i=2; i<=x; i++){
					if(primers(i)){
						num=i;
						while(num<10){
							num=num/10;
						}
						if(num==1){
							cont++;
						}
					}				
				}
				System.out.println(cont);
			}
		}
	}
}
