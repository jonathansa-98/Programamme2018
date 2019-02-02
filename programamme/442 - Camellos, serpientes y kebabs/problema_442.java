public class problema_442 {
	static java.util.Scanner dc;
	
	public static byte saberTipus(String cadena){	//saber tipus de la cadena a canviar
		for(int i=0; i<cadena.length(); i++){
			if(cadena.charAt(i)=='_'){
				return 1;
			}else if(cadena.charAt(i)=='-'){
				return 2;
			}
		}
		return 3;
	}
	
	public static String baixaAGuio(String cadena){	//reemplaça _ per -.
		return cadena.replace('_', '-');
	}
	
	public static String guioABaixa(String cadena){	//reemplaça - per _.
		return cadena.replace('-', '_');
	}
	
	public static byte teGuio(String cadena){	//revisa si te _ o - o cap.
		if(cadena.contains("-")){
			return 1;
		}else if(cadena.contains("_")){
			return 2;
		}
		return 0;
	}
	
	public static String snakeCase(String cadena){	//converteix a snake_case.
		StringBuffer aux=new StringBuffer(cadena);
		if(saberTipus(cadena)==2){
			cadena=guioABaixa(cadena);
		}else if(saberTipus(cadena)==3){
			for(int i=0; i<cadena.length(); i++){
				for(int e=65; e<91; e++){
					if(i!=0 & aux.toString().charAt(i)==e){
						aux.insert(i, "_");
						i++;
					}
				}
			}
			cadena=""+aux;
			cadena=cadena.toLowerCase();
		}
		return cadena;
	}
	
	public static String kebabCase(String cadena){	//converteix a kebab-case.
		StringBuffer aux=new StringBuffer(cadena);
		if(saberTipus(cadena)==1){
			cadena=baixaAGuio(cadena);
		}else if(saberTipus(cadena)==3){
			for(int i=0; i<cadena.length(); i++){
				for(int e=65; e<91; e++){
					if(i!=0 & aux.toString().charAt(i)==e){
						aux.insert(i, "-");
						i++;
					}
				}
			}
			cadena=""+aux;
			cadena=cadena.toLowerCase();
		}
		return cadena;
	}
	
	public static String camelCase(String cadena){	//convereteix a CamelCase.
		
		if(saberTipus(cadena)==1){
			cadena=cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
			StringBuffer aux=new StringBuffer(cadena);
			for(int i=0; i<cadena.length(); i++){
				if(cadena.charAt(i)=='_'){
					aux.replace(i+1,i+2, aux.toString().substring(i+1, i+2).toUpperCase());
				}
			}
			cadena=""+aux;
			cadena=cadena.replace("_", "");
		}else if(saberTipus(cadena)==2){
			cadena=cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
			StringBuffer aux=new StringBuffer(cadena);
			for(int i=0; i<cadena.length(); i++){
				if(cadena.charAt(i)=='-'){
					aux.replace(i+1,i+2, aux.toString().substring(i+1, i+2).toUpperCase());
				}
			}
			cadena=""+aux;
			cadena=cadena.replace("-", "");
		}
		else cadena=cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
		return cadena;
	}
	
	public static byte revTipus(String tipus){	//revisa a quin tipus s'ha de convertir.
		if(tipus.equals("snake_case")){
			return 1;
		}else if(tipus.equals("kebab-case")){
			return 2;
		}else if(tipus.equals("CamelCase")){
			return 3;
		}
		return 0;
	}
	
	public static boolean exercici(){
		if(!dc.hasNext()){
			return false;
		}
		String cadena=dc.next();
		String tipus=dc.next();
		if(revTipus(tipus)==1){
			System.out.println(snakeCase(cadena).trim());
		}else if(revTipus(tipus)==2){
			System.out.println(kebabCase(cadena).trim());
		}else if(revTipus(tipus)==3){
			System.out.println(camelCase(cadena).trim());
		}
		else{return false;}
		return true;
	}
	
	public static void main(String args[]){
		dc=new java.util.Scanner(System.in);
		while(exercici());
	}
}

	
/*
Camellos, serpientes y kebabs
Tiempo máximo: 1,000 s  Memoria máxima: 4096 KiB
GoodCode is_like_a GoodJoke it-needs-no-explanation
Lador, el "compi" con quien hago las prácticas de programación, me dice que hay que poner nombres de variables significativos, que ayuden a entender qué guarda cada una. Siempre me critica si uso identificadores como i, otra o aux.

Para darle un escarmiento, intenté poner una variable que se llamaba suma de los impares menores que n. Pero el compilador me gritó cosas muy feas que no entendí. Cuando preguntamos a la profesora nos dijo que no se podían poner espacios en los nombres. Si queríamos poner nombres con varias palabras (aunque nos dijo que no pusiéramos tantas) entonces teníamos que usar algún truco para que el nombre se leyera bien sin los espacios.

Nos contó que hay varias formas, y se usa una u otra dependiendo de las preferencias personales, o del convenio usado en el lenguaje. Y nos soltó un sermón sobre las mayúsculas del camello, serpientes y kebabs que nos dejaron muy confundidos. Buscando luego en Internet vimos que hay principalmente tres opciones:

CamelCase: la primera letra de cada palabra se escribe en mayúscula. Hay dos alternativas, UpperCamelCase y lowerCamelCase dependiendo de si la primera letra de la primera palabra va también en mayúscula o no. ¡Esta es la que más se utiliza!
snake_case: todas las letras van en minúscula, y las palabras se separan por un guión bajo (_). Se utilizaba en C, y todavía sobrevive en algunos sitios.
kebab-case: como antes, todas las letras van en minúscula, pero ahora las palabras se separan por un guión medio (-). En muchos lenguajes de programación no se puede usar, porque el - se confunde con el signo de la resta y no es válido. Se usa en Lisp (el lenguaje de los paréntesis).
Lo peor de todo fue que a Lador, después de que la profesora nos contara todo esto, se le ocurrió la feliz idea de preguntarle cuántos espacios utilizar para sangrar el código, y en qué línea colocar las llaves. Al final, terminamos perdiendo el autobús.

Entrada
Cada caso de prueba es un nombre de variable en alguna de las tres notaciones anteriores seguida de la notación a la que se quiere convertir (CamelCase, snake_case o kebab-case).

Ningún nombre de variable tendrá más de 20 caracteres y se garantiza que será correcta en alguna de las notaciones.

Salida
Para cada caso de prueba se escribirá el nombre de la variable en la notación solicitada. Tanto en la entrada como en la salida se utilizará UpperCamelCase (y no lowerCamelCase).

Entrada de ejemplo
MiVar snake_case
es_primo kebab-case
suma-de-impares CamelCase
j CamelCase
Salida de ejemplo
 
mi_var
es-primo
SumaDeImpares
J
* */
