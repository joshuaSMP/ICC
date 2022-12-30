/**Montaño Pérez Joshua Said
 * 317222812
 */

import java.util.Scanner;
import java.util.Random;

public class Cifrado{
    private String mensajeCifrado;
    private String mensajeDescifrado;
    private final String ALFABETO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"; 
    private String cadena;
    private String rev;
    private String cifradoKamasutra;
    private String descifradoKamasutra;
    private String auxiliar;

//METODO DE ACCESO DE 
    public String getMensajeCifrado(){
        return this.mensajeCifrado;
    }

    public String getMensajeDescifrado(){
        return this.mensajeDescifrado;
    }

    public String getCadena(){
        return this.cadena;
    } 

    public String getRevuelto(){
        return this.rev;
    }

    public String getCifradoKamasutra(){
        return this.cifradoKamasutra;
    }

    public String getDescifradoKamasutra(){
        return this.descifradoKamasutra;
    }

    public String getAuxilar(){
        return this.auxiliar;
    }


/*Metodo que lee la cadena de entrada .*/
    public String obtenCadena ( Scanner sc ){
    String cadena = sc.nextLine().replaceAll("[^ñ,a-z Ñ,A-Z]+","").toUpperCase().replaceAll(" ","").replaceAll("Á","A").replaceAll("É","E")
    .replaceAll("Í","I").replaceAll("Ó","O").replaceAll("Ú","U");
    
    this.cadena = cadena;
    return this.cadena;
    }   

/**
* Trabaja con un atributo de la clase como cadena
* origen y regresa la cadena cifrada .
*
* @param k El desplazamiento que se desea dar .
* @return La cadena cifrada .
*/
    public String cifradoDeCesar (int k ){
        this.mensajeCifrado = "";
        for(int i=0;i<this.cadena.length();i++){
            this.mensajeCifrado += "" + ALFABETO.charAt((ALFABETO.indexOf(this.cadena.charAt(i))+k)%ALFABETO.length());   
        }
    return this.mensajeCifrado;


    }    
/**
* Trabaja con un atributo donde se encuentra la cadena
* cifrada y regresa la cadena original .
*
* @param k El desplazamiento original .
* @return La cadena descifrada sin blancos ni caracteres
* especiales .
*/
    public String descifradoDeCesar (int k ){
        this.mensajeDescifrado = "";
        for(int i=0;i<this.mensajeCifrado.length();i++){
            this.mensajeDescifrado += "" + ALFABETO.charAt((ALFABETO.indexOf(this.mensajeCifrado.charAt(i))+ALFABETO.length()-k)%ALFABETO.length());
            
        }
    return this.mensajeDescifrado;
    }

/**
* Regresa los tres rieles pegados . Trabaja a partir
* de un atributo donde se encuentra la cadena origen .
*
* @return Una cadena con los rieles pegados sin blancos .
*/
    public String cifraRieles (){
        this.auxiliar = "";
        String riel1 = "";
        String riel2 = "";
        String riel3 = "";
        for(int i= 0; i<cadena.length();i++){
            if(i%3 == 0){
                riel1 += "" + cadena.charAt(i);
            }
            if(i%3 == 1){
                riel2 += "" + cadena.charAt(i);
            }
            if(i%3 == 2){
                riel3 += "" + cadena.charAt(i);
            }
        }
    this.auxiliar = riel1+riel2+riel3;
    return this.auxiliar;
        
    }
/**
* Trabaja con un atributo donde se encuentra la cadena
* y regresa la cadena original
*
* @return La cadena original , pero sin blancos ni caracteres
* especiales .
*/
    public String descifraRieles (){
        String riel1 = "";
        String riel2 = "";
        String riel3 = "";
        int corto= 0;
        int mediano =(this.auxiliar.length()/3);
        int largo = (this.auxiliar.length()/3)+1;
        if(this.auxiliar.length()%3 == 0){
            while(corto<mediano){
                riel1 = riel1 + this.auxiliar.charAt(corto);
                corto++;
            }
            while(corto<mediano+ mediano){
                riel2 = riel2 + this.auxiliar.charAt(corto);
                corto++;
            }
            while(corto<mediano+mediano+mediano){
                riel3 = riel3 + this.auxiliar.charAt(corto);
                corto++;
            }
        }
        if(this.auxiliar.length()%3 == 1){
            while(corto<largo){
                riel1 = riel1 + this.auxiliar.charAt(corto);
                corto++;
            }
            while(corto<largo + mediano){
                riel2 = riel2 + this.auxiliar.charAt(corto);
                corto++;
            }
            while(corto<largo + mediano + mediano){
                riel3 = riel3 + this.auxiliar.charAt(corto);
                corto++;
            }
        }
        
         if(this.auxiliar.length()%3 == 2){
            while(corto<largo){
                riel1 = riel1 + this.auxiliar.charAt(corto);
                corto++;
            }
            while(corto<largo + largo){
                riel2 = riel2 + this.auxiliar.charAt(corto);
                corto++;
            }
            while(corto<largo + largo + mediano){
                riel3 = riel3 + this.auxiliar.charAt(corto);
                corto++;
            }
        }

        String auxiliar2= "";
        for(int j = 0; j<riel1.length();j++){
            auxiliar2 = auxiliar2 + riel1.charAt(j);
            if(j<riel2.length()){
                auxiliar2 = auxiliar2 + riel2.charAt(j);
            }
            if(j<riel3.length()){
                auxiliar2 = auxiliar2 + riel3.charAt(j);
            }
        }
        return this.auxiliar = auxiliar2;
    }




    /**
* Revuelve el alfabeto . Trabaja a partir del alfabeto , que
* puede ser est  ́a tico y constante .
*
* @return El alfabeto revuelto .
*/
    public String revuelve (){
        Random rm = new Random();
        String rev = "";
        for(int i = 0; i<this.ALFABETO.length();){
            char nuevoAlfabeto  = this.ALFABETO.charAt(rm.nextInt(this.ALFABETO.length()));
            if(rev.indexOf(nuevoAlfabeto)<0){
                rev += "" + nuevoAlfabeto;
                i++;
            }
        }
        return this.rev = rev;
    } 

    /**
* Trabaja con un atributo de la clase como cadena origen y
* regresa la cadena cifrada .
*
* @param revuelto El alfabeto revuelto .
* @return La cadena cifrada .
*/
    public String cifradoKamaSutra ( String revuelto ){
        String cifradoKamasutra = "";
        for(int i=0;i<this.cadena.length();i++){
            cifradoKamasutra += "" + revuelto.charAt(this.ALFABETO.indexOf(this.cadena.charAt(i)));
        }
        return this.cifradoKamasutra = cifradoKamasutra; 

    }
/**
* Trabaja con un atributo donde se encuentra la cadena
* cifrada yregresa la cadena original .
*
* @param revuelto El alfabeto que se us ́o para cifrar .
* @return La cadena descifrada , aunque sin blancos ni
* caracteres especiales
*/
      public String descifraKamaSutra ( String revuelto ){
        String descifradoKamasutra = "";
        for(int i=0;i<this.cifradoKamasutra.length();i++){
            descifradoKamasutra += "" + ALFABETO.charAt(revuelto.indexOf(this.cifradoKamasutra.charAt(i)));
        }
        return this.descifradoKamasutra = descifradoKamasutra; 
    }   

    



    public static void main(String[] args){
        Cifrado uno = new Cifrado();
        
        Scanner sc = new Scanner(System.in);
        System.out.println(uno.obtenCadena(sc));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println(uno.cifradoDeCesar(5));
        System.out.println(uno.descifradoDeCesar(5));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println(uno.cifraRieles());
        System.out.println(uno.descifraRieles());
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println(uno.revuelve());
        System.out.println(uno.cifradoKamaSutra(uno.getRevuelto()));
        System.out.println(uno.descifraKamaSutra(uno.getRevuelto()));


        

    }






}