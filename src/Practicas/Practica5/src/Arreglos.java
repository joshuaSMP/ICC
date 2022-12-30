//Montaño Pérez Joshua Said 
public class Arreglos implements InterfazArreglos{

	/**Metodo imprimeArreglo que nos ayudara a que cada elemento del Arreglo se convierta en un String 
	* y se le concatene a una cadena
	*@param int [][]arreglo
	*@return el arreglo en formato de cadena*/
	public static void imprimeArreglo(int [][] arreglo){
		for (int x=0; x < arreglo.length; x++){
        for (int y=0; y < arreglo[x].length; y++)
              System.out.print(" | " + arreglo[x][y]+ " | ");   
        System.out.println("\n----------------------------------------");

		}
	}


	/**Metodo imprimeArreglo que nos ayudara a que cada elemento del Arreglo se convierta en un String 
	* y se le concatene a una cadena
	*@param char [][]arreglo
	*@return el arreglo en formato de cadena*/

	public static void imprimeArreglo(char [][] arreglo){
		for (int x=0; x < arreglo.length; x++){
        for (int y=0; y < arreglo[x].length; y++)
              System.out.print(" | " + arreglo[x][y]+ " | ");   
        System.out.println("\n----------------------------------------");

		}
	}



	/**Metodo imprimeArreglo que nos ayudara a que cada elemento del Arreglo se convierta en un String 
	* y se le concatene a una cadena
	*@param int [] arreglo
	*@return el arreglo en formato de cadena*/
	public static void imprimeArregloUnidimensional(int [] arreglo){
		for (int x=0; x < arreglo.length; x++){
              System.out.print(" | " + arreglo[x]+ " | ");   
		}
	}


	@Override
	 public int[][] espejo(int[][] arreglo){

	 	int [][] espejo = new int [arreglo.length][arreglo[0].length];

	 	int i;
	 	int j;
	 	int k;
	 	int m;

	 	for( i = 0 , k=0 ; i < arreglo.length && k < arreglo.length ; i++, k++){
		
	   		for(j = arreglo[i].length-1, m=0; m<arreglo[k].length && j>=0 ;j--,m++)	
				 espejo[k][m] = arreglo[i][j];
	 	}

	return espejo;

	}

	/**Metodo auxiliarGato que nos ayudara a contabilizar las partidas ganadas por cada caracter   
	* y se le concatene a una cadena
	*@param char[][] gato 
	*@param char c
	*@return int partidas ganadas
	*/

	public static int auxiliarGato(char[][] gato , char c){
		int contador=0;

		for (int i=0; i<gato.length ; i++ ) {
			if(gato[i][0]==c && gato[i][1] == c && gato[i][2]==c){
				contador++;
			}	
		}
		for (int i=0; i<gato.length ; i++ ) {
			if(gato[0][i]==c && gato[1][i] == c && gato[2][i]==c){
				contador++;
			}
			
		}
		if(gato[0][0]==c && gato[1][1] == c && gato[2][2]==c){
				contador++;
			}

		if(gato[0][2]==c && gato[1][1] == c && gato[2][0]==c){
				contador++;
			}


		return contador;
	}

	@Override
	public char gato(char[][] tablero){
	char gato = ' ';
	int contadorX = auxiliarGato(tablero , 'X');
	int contadorO = auxiliarGato(tablero , 'O');

	if (contadorX>contadorO) gato = 'X';

	if (contadorX<contadorO)  gato = 'O';

	if (contadorX==contadorO)  gato = 'E';

	if (contadorX == 0 && contadorO == 0)  gato = 'N';

	return gato;
	}

	@Override
	public String construyeFrase(char[][] frase){
		String fraseRes = "";
		for(int i = 0; i < frase.length; i++){
			fraseRes+= " ";
	    for(int j = 0; j < frase[i].length; j++)
		fraseRes +=  String.valueOf(frase[i][j]);
			}
		return fraseRes;


	}

	@Override
	public int[][] separaNumeros(int[] numeros){
		int j=0;
		int k=0;
		int par = 0;
		int impar = 0;

		for(int i = 0; i < numeros.length; i++){
				if( numeros[i] % 2 == 0){
					par++;
				}

				if( numeros[i] % 2 == 1){
					impar++;
				}
		
		}
		int [] pares = new int [par];
		int [] impares = new int [impar];

		for(int i = 0; i < numeros.length; i++){
				if( numeros[i] % 2 == 0 ){
					pares[k] = numeros[i];
					k++;
				}
				if( numeros[i] % 2 == 1 ){
					impares[j]= numeros[i];
					j++;
				}
		
		}

		int [][] paresImpares= new int [2][par>impar?par:impar];	
			paresImpares [0]= pares;
			paresImpares [1]= impares;
			


		return paresImpares;
	}


	/**Metodo indice que nos ayudara a encontrar el indice donde se encuentre   
	* un elemento en el arreglo
	*@param int [] auxiliar
	*@param int repetido
	*@return int regresa el indice 
	*/
	private static int indice(int [] auxiliar, int repetido){
		int inicio ;
		int fin = auxiliar.length;

		for (inicio = 0 ; inicio<auxiliar.length ; inicio++){
	 			if (repetido==auxiliar[inicio]){
	 				return inicio;
	 			}
	 }	
	 return -1;

	}


	/**Metodo indice que nos ayudara a encontrar el indice donde se encuentre   
	* un elemento en el arreglo, apartir de una posicion 
	*@param int [] auxiliar
	*@param int repetido
	*@param int posicion 
	*@return int regresa el indice 
	*/

	private static int indicePosicion(int [] auxiliar, int repetido, int posicion){
		int inicio;
		int fin = auxiliar.length;
	 	for (inicio = posicion ; inicio<fin; inicio++){
	 			if (repetido==auxiliar[inicio]){
	 				return inicio;
	 			}
	 }	
	 return -1;

	}

	/**Metodo auxiliarMasRepetido que nos ayudara a encontrar las veces que se repita   
	* un elemento en el arreglo 
	*@param int [] auxiliar
	*@param int repetido 
	*@return int regresa el contador
	*/

	public static int auxiliarMasRepetido(int [] auxiliar, int repetido) {
        int posicion, contador = 0;
        //se busca la primera vez que aparece
        posicion = indice(auxiliar, repetido);
        while (posicion != -1) { //mientras se encuentre el caracter
            contador++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            posicion = indicePosicion(auxiliar, repetido , posicion + 1);

        }
        return contador;

	}

	@Override
	public int masRepetido(int[] numeros){
		int inicio;
		int fin = numeros.length;
		int masRepetido = numeros[0];
		int apariciones = auxiliarMasRepetido(numeros, numeros[0]);


		for(inicio = 1; inicio<fin ; ){

			if (auxiliarMasRepetido(numeros, numeros[inicio])> apariciones){
				 masRepetido = numeros[inicio];
				 apariciones = auxiliarMasRepetido(numeros, numeros[inicio]);
				 break;
			} else {
				inicio++;
			}


		}

		return masRepetido;


	}


	/**Metodo elementoEn que nos ayudara a encontrar   
	* un elemento en el arreglo 
	*@param int [] auxiliar
	*@param int elemento 
	*@return int regresa el contador
	*/

	private static boolean elementoContiene(int [] auxiliar, int elemento){

		for (int auxiliarElemento : auxiliar){
	 			if (elemento== auxiliarElemento){
	 				return true;
	 			}
	 }	
	 return false;

	}



	@Override
	 public boolean estaContenido(int[] contenido, int[] contenedor){
	 	boolean contiene = false ;

	 	for (int i =0; i<contenido.length; i++ ){

	 		if (elementoContiene(contenedor, contenido[i])){
	 			contiene=true;
	 		} else{
	 			contiene=false;
	 			break;
	 		}	 		
	 		
	 		}
	 	return contiene;
	 }




	 @Override
	 public int[][] pascal(int n){

	 	int [][] trianguloPascal = new int [n][n]; 
	 	 	
	 	for (int i = 1; i<trianguloPascal.length; i++){
	 		for (int j = 1 ; j<trianguloPascal[i].length ; j++){
	 			trianguloPascal[0][0] = 1;
	 			trianguloPascal[i][0] = 1;	 
	 			trianguloPascal[i][j] = trianguloPascal[i-1][j] + trianguloPascal[i-1][j-1];	 		}
	 	} 
	 	return trianguloPascal;

	 }


	 @Override
	  public int[] colapsa(int[] arreglo){
	  	int i;
	  	int numeroMayor = arreglo [0];
	  
	  	for (i=1 ; i < arreglo.length; i++ ){
	  		 if(arreglo[i]>numeroMayor){
	  		 	numeroMayor = arreglo [i];
	  		}
	  	}

	  	int [] arregloAux = new int [numeroMayor];

	  	for (i=0 ; i < arreglo.length; i++ ){
	  		arregloAux[arreglo[i]-1]++;
	  	}


	  	int contador =0;

	  	for (i=0 ; i < arregloAux.length; i++ ){
	  		if (arregloAux[i]!=0){
	  			contador++;
	  		}
	  	}

	  	int [] arregloColapsado = new int[contador];
	  	int j=0;
	  	for (i=0 ; i < arregloAux.length;i++){  			
	  			if (arregloAux[i] != 0){
	  				arregloColapsado[j] = i+1;
	  				j++;
	  			}	  		
	  	}	  	
		return arregloColapsado;
	 }
		






	public static void main(String[] args) {
		Arreglos prueba = new Arreglos();

	
		System.out.println("Prueba arreglo espejo"+ "\n");
		int [][] arregloEspejo = {{1,2,3,7,8}, {4,5,6,0,9}, {1,2,3,6,7}};
		int [][] aux = prueba.espejo(arregloEspejo);
		System.out.println("Arreglo Original: ");
		imprimeArreglo(arregloEspejo);
		System.out.println("Arreglo Espejo: \n");
		imprimeArreglo(aux);



		System.out.println("Prueba arreglo gato"+ "\n");
		char [][] arregloGato = {{'-','O','X'},
								 {'X','-','O'},
								 {'X','O','O'}};
		imprimeArreglo(arregloGato);
		System.out.println("\n" + "Ganador: "+prueba.gato(arregloGato)+ "\n");


		System.out.println("Prueba arreglo Construye Frase"+ "\n");
		char [][] arregloConstruyeFrase = {{'h','o', 'l' ,'a'}, {'m','u','n','d','o'}, {'c','o','m','o'}, {'a','n','d','a','s'}};
		System.out.println("Arreglo Original: "+ "\n"); 
		imprimeArreglo(arregloConstruyeFrase);
		System.out.println("Frase construida: " + prueba.construyeFrase(arregloConstruyeFrase)+ "\n");


		System.out.println("Prueba arreglo Separa Numeros"+ "\n");
		int [] separaNumeros = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Arreglo Original: "+ "\n" );
		imprimeArregloUnidimensional(separaNumeros);
		int [][] pareseImpares = prueba.separaNumeros(separaNumeros);
		System.out.println("\n"+"Arreglo en pares e impares: " + "\n");
		imprimeArreglo(pareseImpares);

		System.out.println("Prueba arreglo Mas Repetido"+ "\n");
		int [] auxiliarRepetido = {1,1,2,3,4,15,6,6,6,6,10,};
		System.out.println("Arreglo Original: " + "\n");
		imprimeArregloUnidimensional(auxiliarRepetido);
		System.out.println("\n"+"Elemento mas repetido : "+ prueba.masRepetido(auxiliarRepetido)+ "\n");


		System.out.println("Prueba arreglo Esta Contenido"+ "\n");
		int [] contenido= {1,2,7,8,11,9,10};
		int [] contenedor = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Arreglo Contenido: " );
		imprimeArregloUnidimensional(contenido);
		System.out.println("\n"+"Arreglo Contenedor: ");
		imprimeArregloUnidimensional(contenedor);
		System.out.println("\n"+"Esta contenido: "+ prueba.estaContenido(contenido, contenedor)+ "\n");

		System.out.println("Prueba arreglo Pascal"+ "\n");
		int [][] pascal = prueba.pascal(8);
		imprimeArreglo(pascal);

		System.out.println("Prueba arreglo Colapsa"+ "\n");
		int [] colapsaAuxiliar = {1,1,1,1,1,2,3,4,5,1,1,1,6,7,8,9,2,2,2,10};
		System.out.println("Arreglo Original: ");
		imprimeArregloUnidimensional(colapsaAuxiliar);
		int [] colapsado =prueba.colapsa(auxiliarRepetido);
		System.out.println("\n"+"Arreglo Colapsado:  ");
		imprimeArregloUnidimensional(colapsado);
		System.out.println();

		
	}
}