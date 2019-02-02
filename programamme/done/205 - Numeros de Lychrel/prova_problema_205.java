import java.util.Scanner;
public class prova_problema_205{ 
	public static void main(String args[]){ 
		Scanner ask=new Scanner(System.in);
		int res=0;
		int inv=0;
		int cas;
		int cont;
		boolean capicua;
		cas=ask.nextInt();
		for(int i=0; i<cas; i++){	
			res=ask.nextInt();
			if(res>=1 && res<=100000){
				Integer i_res=new Integer(res);
				inv=0;
				Integer i_inv=new Integer(inv);
				capicua=false;
				cont=0;
				while(Integer.valueOf(res)<=1000000000 && !capicua){
					i_res=res;
					StringBuffer s_res=new StringBuffer(i_res.toString());
					StringBuffer s_inv=new StringBuffer(i_res.toString());
					s_inv.reverse();
					if(cont>1 && s_inv.toString().equals(s_res.toString())){capicua=true;}
					if(!capicua){
						cont++;
						inv=Integer.parseInt(s_inv.toString());
						res=res+inv;
					}
				}
				if(!capicua) System.out.println("Lychrel?");
				else System.out.println(cont+" "+res);
			}
		}
	}
}
