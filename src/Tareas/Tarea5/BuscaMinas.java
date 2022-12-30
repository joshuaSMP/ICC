import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import java.security.DrbgParameters.NextBytes;
import java.util.Random; 

public class BuscaMinas{
	
	public char[][]  tablero;
	public char[][]  tableroJugado;
	private int descubre;
	private Random rand = new Random();
	private boolean perdio = false;

	public BuscaMinas(int dificultad){
		switch (dificultad){
			case 1: //principiante
				this.tablero = new char[8][8];
				this.tableroJugado = new char[8][8];
				this.descubre = 2; 
				this.setMinas(10);
				this.setNumMinas();
				break;
			case 2:
				this.tablero = new char[16][16];
				this.tableroJugado = new char [16][16];
				this.descubre = 3;
				this.setMinas(40);
				this.setNumMinas();
				break;
			case 3: 
				this.descubre = 4;
				this.tablero = new char[16][30];
				this.tableroJugado = new char [16][30];
				this.setMinas(99);
				this.setNumMinas();
				break;
			case 4:
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingerese el numero de columnas que quiere:");
				int y= sc.nextInt();
				System.out.println("Ingrese el numero de linea que quiere:");
				int x= sc.nextInt();
				System.out.println("Ingrese el numero de minas que quiere :");
				int m= sc.nextInt();
				this.tablero = new char[x][y];
				this.tableroJugado = new char [x][y];
				this.setMinas(m);
				this.setNumMinas();
				this.descubre = 2;
				break;
		}
	}

	//No olvides que las minas y el numero de minas en vecinos van en "tablero"
	public void setMinas(int minas){
		int x,y;
		do{
			x = rand.nextInt(tablero.length);
			y = rand.nextInt(tablero[0].length);
			if(tablero[x][y] != 'x' ){
				tablero[x][y] = 'x';
				minas--;
			}
			//Verificamos si la posicion (x,y) esta vacia en terminos de caracteres
			//Si esta vacia, entonces colocamos una mina en la posicion x y recuerda que la mina esta representada por 'x'
			//Ya pusimos una mina, entonces ya casi terminamos, no olvides revisar que el while no se cicle.
		}while(minas > 0);
	}

	public void setNumMinas(){
		for(int i = 0; i < this.tablero.length; i ++){
			for(int j = 0; j < this.tablero[i].length; j++){
				int minas = 0;
				if(tablero[i][j] == 'x'){
					continue;
				}
				 //son las minas contabilizadas en los vecinos de la posicion i,j
				
				//Codigo: revisamos si la posicion actual es una bomba, si si, evitamos hacer el resto del codigo, pero
				//continuamos con las iteraciones.

				//-------------------- DIVIDE Y VENCERAS ------------------------
				/* En cuantos casos ves conveniente dividir este metodo?
				** Propongo lo siguiente:
				** 1) todo el interior del tablero (Si quieres continuar mi codigo, acompleta los casos faltantes)
				** 2) las casillas con i == 0: revisar casos j == 0 y j == j == tablero[i].length-1, y las coordenadas i = 0 pero 0 < j > tablero[i].length-1
				** 3) las casillas con i == tablero.length-1: revisar casos j == 0 y j == j == tablero[i].length-1, y las coordenadas i = 0 pero 0 < j > tablero[i].length-1
				** Si lo analizamos en los casos 2 y 3 ya revisamos (0,0), (0,tam), (tam,0) y (tam, tam) asi que nos queda revisar solo los interiores de j, es decir.
				** 4) las casillas con j == 0
				** 5) las casillas con j == tablero[i].length-1

				** SI MI IMPLEMENTACION NO ES DE TU AGRADO, PUEDES EMPEZARLA DESDE CERO SIN NINGUN PROBLEMA, SOLO
				** REVISANDO QUE NO TE SALGAS DE TU ARREGLO.
				*/

				//caso 1 incompleto
				if(i > 0 && j > 0 && i < tablero.length-1 && j < tablero[i].length-1){ //evitamos todo el contorno de lablero
					//revisamos las 8 casillas de vecinos

					/* Posicion i-1 j-1
					** |o |  |  |
					** |  |x |  |
					** |  |  |  |
					*/
					if(tablero[i-1][j-1] == 'x')
						minas++;

					/* Posicion i-1 j
					** |  |o |  |
					** |  |x |  |
					** |  |  |  |
					*/
					if(tablero[i-1][j] == 'x')
						minas++;
					/* Posicion i-1 j+1
					** |  |  | o|
					** |  |x |  |
					** |  |  |  |
					*/
					if(tablero[i-1][j+1] == 'x')
					minas++;
					/* Posicion i j+1
					** |  |  |  |
					** |  |x |o |
					** |  |  |  |
					*/
					if(tablero[i][j+1] == 'x')
						minas++;

					/* Posicion i+1 j+1
					** |  |  |  |
					** |  |x |  |
					** |  |  |o |
					*/
					if(tablero[i+1][j+1] == 'x')
						minas++;
					/* Posicion i+1 j
					** |  |  |  |
					** |  |x |  |
					** |  | o|  |
					*/
					if(tablero[i+1][j] == 'x')
					minas++;
					/* Posicion i+1 j+1
					** |  |  |  |
					** |  |x |  |
					** | o|  |  |
					*/
					if(tablero[i+1][j-1] == 'x')
						minas++;
					/* Posicion i1 j-1
					** |  |  |  |
					** |o |x |  |
					** |  |  |  |
					*/
					if(tablero[i][j-1] == 'x')
						minas++;
					//¿Que posiciones faltan?
					
				}
				//caso 2
				if(i == 0){
					if(j==0){
						if(tablero[i][j+1] == 'x')
						minas++;
						if(tablero[i+1][j] == 'x')
							minas++;
						if(tablero[i+1][j+1] == 'x')
							minas++;
					}else if(j == tablero[i].length-1){
						if(tablero[i][j-1] == 'x')
							minas++;
						if(tablero[i+1][j-1] == 'x')
							minas++;
						if(tablero[i+1][j] == 'x')
							minas++;
					}else{
						if(tablero[i][j-1] == 'x')
							minas++;
						if(tablero[i][j+1] == 'x')
							minas++;
						if(tablero[i+1][j-1] == 'x')
							minas++;
						if(tablero[i+1][j] == 'x')
							minas++;
						if(tablero[i+1][j+1] == 'x')
							minas++;
					}
				}
				//caso 3
				if(i == tablero[i].length-1){
					if(j==0){
						if(tablero[i-1][j] == 'x')
						minas++;
						if(tablero[i-1][j+1] == 'x')
							minas++;
						if(tablero[i][j+1] == 'x')
							minas++;
					}else if(j == tablero[i].length-1){
						if(tablero[i-1][j] == 'x')
							minas++;
						if(tablero[i-1][j-1] == 'x')
							minas++;
						if(tablero[i][j-1] == 'x')
							minas++;
					}else{
						if(tablero[i][j-1] == 'x')
							minas++;
						if(tablero[i-1][j-1] == 'x')
							minas++;
						if(tablero[i-1][j] == 'x')
							minas++;
						if(tablero[i-1][j+1] == 'x')
							minas++;
						if(tablero[i][j+1] == 'x')
							minas++;
					}
				}
				//caso 4
				else if(j == 0){
					if(i>0){
						if(tablero[i-1][j] == 'x')
							minas++;
						if(tablero[i-1][j+1] == 'x')
							minas++;
						if(tablero[i][j+1] == 'x')
							minas++;
						if(tablero[i+1][j] == 'x')
							minas++;
						if(tablero[i+1][j+1] == 'x')
							minas++;
					}
				}
				//caaso 5 
				else if(j == tablero[i].length-1){
					if(i>0){
						if(tablero[i-1][j] == 'x')
							minas++;
						if(tablero[i+1][j-1] == 'x')
							minas++;
						if(tablero[i][j-1] == 'x')
							minas++;
						if(tablero[i-1][j] == 'x')
							minas++;
						if(tablero[i-1][j-1] == 'x')
							minas++;
					}
				}
				//Descomenta la siguiente linea de codigo y cambia lo que se pide
				tablero[i][j] = (minas >0) ? Character.forDigit(minas,10) : 0;
				//Asignamos 0 en el else para mantener la igualdad del valor por defecto
			}
		}
	}

	public void tirar(int x, int y){
		//Los indices que llegan hasta aqui debieron ser verificados de cumplir con los indices validos
		
		//Si la posicion tiene una bomba, entonces pierde, revisa si la variable global "perdio" te es util
		
		//Asignamos 'o' a la posicion xy 
		if(tablero[x][y] == 'x'){
			this.perdio = true;
			return;
		}
		tableroJugado[x][y] = 'o';

		/** Sea la casilla col= 2, fila= 2 la escogida por le usuario (asignada con p de principal) y descubre= 2 */

		/* Decubre 2 hacia abajo
		** |  |  |  |
		** |  |  |p |
		** |  |  |o |
		** |  |  |o |
		** |  |  |  |
		*/
		for(int i = x+1; i <= x+this.descubre && i < tablero.length; i++){
			if(tablero[i][y] == 'x')
				break;
			tableroJugado[i][y] = 'o';
		}
		/* Decubre 2 hacia izquieda 
		** |  |  |  |
		** |o |o |p |
		** |  |  |  |
		** |  |  |  |
		** |  |  |  |
		*/
		for(int i = y-1; i >= y-this.descubre && i >= 0; i--){
			if(tablero[x][i] == 'x')
				break;
			tableroJugado[x][i] = 'o';
		}
		//continua los lados faltantes
		/* Decubre 2 hacia abajo
		** |  |  |o |
		** |  |  |o |
		** |  |  |p |
		** |  |  |  |
		** |  |  |  |
		*/
		for(int i = x-1; i >= x-this.descubre && i >=0; i--){
			if(tablero[i][y] == 'x')
				break;
			tableroJugado[i][y] = 'o';
		}
		/* Decubre 2 hacia izquieda 
		** |  |  |  |
		** |p |o |o |
		** |  |  |  |
		** |  |  |  |
		** |  |  |  |
		*/
		for(int i = y+1; i <= y+this.descubre && i< tablero[x].length ;i++){
			if(tablero[x][i] == 'x')
				break;
			tableroJugado[x][i] = 'o';
		}
	}

	public String imprimir(){ 
		//Metodo ya completo
		String tableroCadena ="";
		for(int i = 0; i < this.tablero.length; i++){
			tableroCadena += "|";
			for(int j = 0; j < this.tablero[i].length; j++){
				if(this.tableroJugado[i][j] == 'o'){
					tableroCadena += (this.tablero[i][j] != 0) ? " " + this.tablero[i][j] +" |" : " - |";
				}else
					tableroCadena += "   |";		
			}
			tableroCadena += "\n";
		}
		return tableroCadena;
	}

	
	
	//Con este metodo pordemos ver el tablero que contiene las bombas y el numero de bombas oculto al usuario
	public String imprimirBack(){
		String tableroCadena ="";
		for(int i = 0; i < this.tablero.length; i++){
			tableroCadena += "|";
			for(int j = 0; j < this.tablero[i].length; j++){
				tableroCadena += (this.tablero[i][j] != 0)? " " + this.tablero[i][j] +" |": "   |";
			}
			tableroCadena += "\n";
		}
		return tableroCadena;
	}
	

	public boolean terminaElJuego(){
		//Si el usuario perdio, regresamos true e imprimimos "Perdio"
		/*Si no, revisamos que todo el tablero "tableroJugado" este lleno, recuerda que no se estan llenando las casillas
		**donde originalmente estan las bombas, por lo que esto implica contemplar ese caso. Si el tablero esta lleno
		**(con la exepcion anterior), entonces el usuario gana
		*/
		if(perdio == true ){
			System.out.println("Has perdido");
			return true;
		}else{
			for(int i = 0 ;i< tablero.length; i++){
				for(int j= 0 ; j<tablero.length; j++){
					if(tableroJugado[i][j] == 0 && tablero[i][j] != 'x'){
						return false;
						}
					}
				}
			}
			System.out.println("Has ganado ");
			return true;
		}

	

	

	public static void main (String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Hola este es el juego de buscaminas ");
		System.out.println("Seleccina el nivel de dicultad que quieres");
		System.out.println("1. Facil ");
		System.out.println("2. Mediano ");
		System.out.println("3. Dificil ");
		System.out.println("4. Perzonalizado ");
		

		while(!s.hasNextInt()){
			System.out.println("Ingresa una de las anteriores opciones: ");
			s.next();
		}		
		int dificultad= s.nextInt();
		while(0 > dificultad || dificultad > 4 ){
			System.out.println("Ingresa una de las anteriores opciones:");
			dificultad = s.nextInt();
		}

		if(0< dificultad && dificultad <5){
			BuscaMinas b = new BuscaMinas(dificultad);
			int x, y;
			do{
				System.out.println(b.imprimirBack());
				System.out.println("Ingrese columna -> 0-"+(b.tablero[0].length-1));
				while(!s.hasNextInt()){
					System.out.println("Debes de ingresar un numero ");
					s.next();
				}
				y = s.nextInt();
				System.out.println("Ingrese fila -> 0-"+(b.tablero.length-1));
				while(!s.hasNextInt()){
					System.out.println("Debes de ingresar un numero ");
					s.next();
				}
				x= s.nextInt();
				if(x<b.tablero.length && y<b.tablero[0].length && x>=0 && y>=0){
					b.tirar(x,y);
					System.out.println(b.imprimir());
				}else{
					System.out.println("Ingresa numeros que esten dentro del rango ");
				}
			}while(!b.terminaElJuego());
		}

	}

}




