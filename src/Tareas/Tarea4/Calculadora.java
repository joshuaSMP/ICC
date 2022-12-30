/**
 * Clase Calculadora
 * @author Adriana Sánchez Del Moral.
 * @version 1.0 
 */

import java.util.Scanner;  

public class Calculadora{
	
    /** Color de la calculadora */
	
    private String color;

	/** Marca de la calculadora */
	
    private String marca;

	/** Propietario de la calculadora */
	
    private  String nombreDuenio;

	/**
     * Constructor de una calculadora.
     * @param color color de la calculadora.
     * @param marca marca de la calculadora.
     * @param nombreDuenio propietario de la calculadora.
     */
	
    public Calculadora(String color, String tamaño, String marca, String duenio){
		
        this.color = color;
		this.marca = marca;
		this.nombreDuenio = duenio;
	}

	/**
     * Constructor por default de una calculadora.
     */
   
     public Calculadora(){

		this.color = "Negro";
		this.marca = "Patito";
		this.nombreDuenio = "Sin dueño";
	}

	/**
     * Metodo toString para representar una calculadora
     */
	
    @Override
	public String toString(){
	
    	return "Calculadora de: "+ this.getDuenio() + ".\nColor: "+ this.getColor() + ". \nMarca: "+ this.getMarca();
  	}

	/**
     * Modifica el color de la calculadora.
     * @param color color de la calculadora.
     */
	
    public void setColor(String color){
	
    	this.color=color;
	}

	/**
     * Modifica la marca de la calculadora.
     * @param marca marca de la calculadora.
     */

	public void setMarca(String marca){
		   
        this.marca=marca;
	}

	/**
     * Modifica el duenio de la calculadora
     * @param duenio duenio de la calculadora.
     */

	public void setDuenio(String duenio){

		this.nombreDuenio=duenio;
	}

	/**
     * Regresa el color de la calculadora.
     * @return el color de la calculadora.
     */
	//Métodos de Acceso, permiten ver el estado de una instancia (getters inlcuyen return, no llevan parámetros).

	public String getColor(){ 

		return this.color;
	}

	public String getMarca(){

		return this.marca;
	}

	public String getDuenio(){

		return this.nombreDuenio;
	}

	/**
     * Realiza una suma de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return a+b
     */

	public int sumarBinaria (int a, int b){

		return a+b;
	}

	/**
     * Realiza una resta de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return a-b	
     */

	public int restarBinaria (int a, int b){

		return a-b;
	}

	/**
     * Realiza una multiplicación de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return  a*b		
     */

	public int multiplicar (int a, int b){

		return a*b;
	}

	/**
     * Realiza una división de doa numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return  a/b	
     */

	public int dividir (int a, int b){

		if(b > 0)
			return a/b;
		else 
			return -1000; //Se pudo regresar cualquier otro numero "absurdo"
	}

	/**
     * Obtiene el modulo de dos numeros enteros.
     * @param a primer numero
     * @param b segundo numero
     * @return  a%b		
     */

	public int modular (int a, int b){

		return a%b;
	}

	/**
     * Obtiene la suma de dos numeros enteros haciendo operaciones unarias Postfijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a+b		
     */

	public int sumarPostfijo (int a, int b){

		for(int i= 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " x++ " + a++);		
		}
		return a;
    }

	/**
     * Obtiene la resta de dos numeros enteros haciendo operaciones unarias Postfijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a-b		
     */

	public int restarPostfijo (int a, int b){

		for(int i = 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " x-- " + a--);
		}
		return a;
	}

	/**
     * Obtiene la suma de dos numeros enteros haciendo operaciones unarias Sufijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a+b		
     */

	public int sumarSufijo (int a, int b){

		for(int i= 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " ++x " + ++a);		
		}
		return a;
	}

	/**
     * Obtiene la resta de dos numeros enteros haciendo operaciones unarias Sufijo
     * @param a primer numero
     * @param b segundo numero
     * @return  a-b		
     */

	public int restarSufijo (int a, int b){

		for(int i = 0; i < b; i++){
			System.out.println("iteracion: " + i + " actual "+ a + " --x " + --a);
		}
		return a;
	}

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

        System.out.println("Esta es tu calculadora,¿que opcion quieres utilizar?");    

        Scanner sn = new Scanner(System.in);
        boolean terminar = false;
        int opcion;        
    
        if(!terminar){
		
		    System.out.println("\n0- Pulse 0 para salir \n" + "1- Pulse 1 para introducir los datos en la calculadora \n"+"2-Pulse 2 para obtener datos \n" +          
            "3-Pulse 3 para realiszar una suma binaria \n" + "4- Pulse 4 para hacer una resta binaria\n" + "5-Pulse 5 para hacer una multiplicacion \n" + 
            "6-Pulse 6 para hacer una  division \n" + "7-Pulse 7 para hacer un modulo \n" + "8-Pulse 8 para hacer una suma con el operador incremento postfijo \n" + 
            "9- Pulse 9 para hacer una suma con el operador de incremento sufijo \n" + "10-Pulse 10 para hacer una resta con el operador de incremento postfijo \n" + 
            "11-Pulse 11 para hacer una resta con el operador de incremento sufijo \n");
	        
            System.out.println("Por favor escribe el número para hacer la operacion: ");
            opcion = sn.nextInt();           
    
            switch(opcion){

                case 0:

                    System.out.println("Calculadora de " + calculadora.getDuenio() + " fuera");
                    terminar = true;
                break;

                case 1:

                    System.out.println(" \n1- Configura tu calculadora a tu gusto ");
                    System.out.println("Ponle el color que quieres para tu calculadora:");
                    calculadora.setColor(sn.next());
                    System.out.println("Ponle la marca que tu quieras para tu calculadora:");
                    calculadora.setMarca(sn.next());
                	System.out.println("Pon tu nombre a la calculadora:");
                    calculadora.setDuenio(sn.next());
                break;
	
                case 2:
            
                    System.out.println("\n2-Obtener datos");
                    System.out.println(calculadora.toString());
                break;

                case 3:

                    System.out.println("\n3-Esta es la suma binaria");
                    System.out.println("Por favor introduce dos números para sumar: ");
                    System.out.println("Resulatado --> " + calculadora.sumarBinaria(sn.nextInt(), sn.nextInt()));
                break;

                case 4:

                    System.out.println("\n4- Esta es la resta binaria");
                    System.out.println("Por favor introduce dos números para restar: ");
                    System.out.println("Resultado --> " + calculadora.restarBinaria(sn.nextInt(), sn.nextInt()));
                break;
                    
                case 5:

                   System.out.println("\n5- Esta es la  multiplicación");
                   System.out.println("Por favor introduce dos números para multiplicar: ");
                   System.out.println("Resultado --> " + calculadora.multiplicar(sn.nextInt(), sn.nextInt()));
                break;

                case 6:

                    System.out.println("\n6-Esta es para hacer división");
                    System.out.println("Por favor introduce el valor del dividendo y el valor del divisor: ");
                    System.out.println("Resultado --> " + calculadora.dividir(sn.nextInt(), sn.nextInt()));
                break;

                case 7:

                    System.out.println("\n7- Esta es para hacer modulo");
                    System.out.println("Por favor introduce dos números para hacer el modular: ");
                    System.out.println("Resultado --> " + calculadora.modular(sn.nextInt(), sn.nextInt()));
                break;

                case 8:

                    System.out.println("\n8- Esta es para hacer la suma con el operador de incremento postfijo");
                    System.out.println("Por favor introduce dos números para sumar postfijamente: ");
                    System.out.println("Resultado --> " + calculadora.sumarPostfijo(sn.nextInt(), sn.nextInt()));
                break;
            
                case 9:

                    System.out.println("\n9- Esta es para hacer la suma con el operador de incremento sufijo");
                    System.out.println("Por favor introduce dos números para sumar sufijamente: ");
                    System.out.println("Resultado --> " + calculadora.sumarSufijo(sn.nextInt(), sn.nextInt()));
                break;

                case 10:

                    System.out.println("\n10- Esta es para hacer la resta con el operador de incremento postfijo");
                    System.out.println("Por favor introduce dos números para restar postfijamente: ");
                    System.out.println("Resultado --> " + calculadora.restarPostfijo(sn.nextInt(), sn.nextInt()));
                break;

                case 11:

                    System.out.println("\n11- Esta es para hacer la resta con el operador de incremento sufijo");
                    System.out.println("Por favor introduce dos números para restar sufijamente: ");
                    System.out.println("Resultado --> " + calculadora.restarSufijo(sn.nextInt(), sn.nextInt()));
                break;

                default:

                    System.out.println("Esa no es una opcion valida");
            }
	    }

	}
}
