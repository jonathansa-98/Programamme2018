/* DonE.T. es un extraterrestre al que le encanta la investigación. Su hijo estuvo hace muchos
años de paso por el planeta Tierra y le habló de que había un campo de investigación
enorme: la teletienda y la efectividad de sus productos milagrosos.

DonE.T. quiere que los frutos de sus investigaciones queden en el más estricto secreto.
Para ello ha impuesto una política de contraseñas para guardar la información a sus
becarios.

Debemos ayudar a escribir a DonE.T. un programa que comprueba si la contraseña es
válida (mostrando OK) o inválida (mostrando ERROR).

Los requerimientos son los siguientes:
	Al menos una letra minúscula.
	Al menos una letra mayúscula.
	Al menos un dígito.
	Al menos un símbolo del conjunto +_)(*&^%$#@!./,;{}
	Longitud mínima de 12.

Ejemplos:
	La contraseña "Aa1_" (sin las comillas) cumple los 4 primeros requisitos pero su
	tamaño es menor que 12 (inválida, se muestra ERROR).
	La contraseña "Aa1234567890_" es válida (se muestra OK).

Entrada
	Debes procesar un conjunto de contraseñas en cada caso de prueba.
	La primera línea contendrá un entero N con el número de contraseñas a procesar.
		1 ≤ N ≤ 1000
	Las siguientes N líneas será una cadena con la contraseña.
	La contraseña solo podrá contener letras de la a-z (mayúsculas y minúsculas), dígitos del 0
	al 9 y los siguientes símbolos "+_)(*&^%$#@!./,;{}" sin las comillas.
	El tamaño máximo de cada password será de 30 caracteres.

Salida
	Por cada contraseña, escribir una línea con la palabra "OK" si la contraseña cumple los
	requisitos o la palabra "ERROR" si no los cumple.

Ejemplo de entrada
	2
	Aa1_
	Aa1234567890_

Ejemplo de salida
	ERROR
	OK

Ejemplo de entrada
	5
	UtQ.iNlLgT;{f,.GR!
	yr)Z,pHQ+No,ZfP_z12D2l1*MSTfk
	.p7hV/Es^aahW%B.1JJouO;
	c7V!*$1lW
	a^pBAAxCohQlBv7qDpVeOB%Min

Ejemplo de salida
	ERROR
	OK
	OK
	ERROR
	OK
*/
 
class ProblemaB2017{
	public static void main(String args[]){
		short cas=0;
		boolean ok=false;
		String pass[]={"123456789r","a^pBAAxCohQlBv7qDpVeOB%Min","UtQ.iNlLgT;{f,.GR!","yr)Z,pHQ+No,ZfP_z12D2l1*MSTfk",".p7hV/Es^aahW%B.1JJouO;","c7V!*$1lW","a^pBAAxCohQlBv7qDpVeOB%Min"};
		int n=pass.length;	//num de cadenes que hi ha.
		
		int i=0;
		int pass_long;	//numero de caracter a 1 contrasenya.
		char lletra;
		boolean minus=false;
		boolean mayus=false;
		boolean num=false;
		boolean especial=false;
		for(cas=0;cas<n;cas++){
			pass_long=pass[cas].length();
			/*	Al menos una letra minúscula.
				Al menos una letra mayúscula.
				Al menos un dígito.
				Al menos un símbolo del conjunto +_)(*&^%$#@!./,;{}*/

			for(i=0;i<pass_long & pass_long>=12 & pass_long<=30;i++){
				ok=true;
				lletra=pass[cas].charAt(i);
				//~ if(lletra<=){
					
				//~ }
			}
			if(ok){
				System.out.println("OK");
			}
			else{
				System.out.println("ERROR");
			}
		}
	}
}

	//~ public static void main(String[] args){
	
		//~ String contra="123456789Biel+";
		//~ String min="qwertyuiopasdfghjklzxcvbnm";
		//~ String maj="QWERTYUIOPASDFGHJKLZXCVBNM";
		//~ String num="0123456789";
		//~ String simb="+_)(*&^%$#@!./,;{}";
		//~ boolean tMin=false;
		//~ boolean tMaj=false;
		//~ boolean tNum=false;
		//~ boolean tSimb=false;
		
		//~ for(int i=0;i<contra.length();i++){
			//~ for(int e=0;e<min.length();e++){
				//~ for(int t=0;t<maj.length();t++){
					//~ for(int y=0;y<num.length();y++){
						//~ for(int r=0;r<simb.length();r++){
							
							//~ if(contra.charAt(i)==min.charAt(e)){
								//~ tMin=true;
							//~ }
							//~ if(contra.charAt(i)==maj.charAt(t)){
								//~ tMaj=true;
							//~ }
							//~ if(contra.charAt(i)==num.charAt(y)){
								//~ tNum=true;
							//~ }
							//~ if(contra.charAt(i)==simb.charAt(r)){
								//~ tSimb=true;
							//~ }
							
						//~ }
					//~ }
				//~ }
			//~ }
		//~ }
		//~ if(tMin&tMaj&tNum&tSimb){
			//~ System.out.println("OK");
		//~ }else{
			//~ System.out.println("ERROR");
		//~ }
	//~ }
//~ }

