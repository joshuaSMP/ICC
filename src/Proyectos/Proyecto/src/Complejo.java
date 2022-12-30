/**@author Montaño Pérez Joshua Said
 * 317222812
 * importamos la clase java.lang.Math
 * para poder utlizar la raiz cuadrada y la potencia 
 */
import java.lang.Math;

/**
 * creamos la clase Complejo para poder implementar ServiciosComplejos
 */
public class Complejo implements ServiciosComplejos{
    
    /**atributo de la clase private double real  */
    private double real;

    /**atrubuto de la clase private double imaginario */
    private double imaginario;

    /**
     * Utilizamos el un constructor con los parametros 
     * @param double real 
     * @param double imaginario
     */
    public Complejo(double real, double imaginario){
        this.real = real ;
        this.imaginario = imaginario;
    }

    /**Creamos un construrtor vacio  */
    public Complejo(){

    }

    /**
     * metodo que modifica el valor 
     * @param imaginario 
     */
    public void setImaginario(double imaginario){
        this.imaginario = imaginario;
        return ;
    }

    /**
     * metodo que modifica el valor 
     * @param real
     */
    public void setReal(double real){
        this.real = real;
        return ;
    }

    /**
     * metodo que devuelve el valor de 
     * @return Real
     */
    public double getReal(){
        return this.real;
    }

    /**
     * metodo que devuelve el valor de 
     * @return Imaginario 
     */
    public double getImaginario(){
        return this.imaginario;
    }

    /**
     * metodo auxilar que nos ayuda a la suma de reales
     * @param Complejo x 
     * @param Complejo y
     * @return double SumaAuxReal
     */
    public double SumaAuxReal(Complejo x, Complejo  y){
        return x.real + y.real;
    }

    /**
     * metodo auxiliar que nos ayuda a la suma de imaginarios 
     * @param Complejo x
     * @param Complejo y
     * @return double SumaAuxImaginario 
     */
    public double SumaAuxImaginario(Complejo x, Complejo  y){
        return x.imaginario + y.imaginario;
    }

    /**
     * metodo que nos ayuda a sumar numeros complejos 
     */
    public Complejo suma(Complejo b ){
        Complejo a = new Complejo();
        a.real =SumaAuxReal(this, b);
        a.imaginario = SumaAuxImaginario(this, b);
        return a; 
    }

    /**
     * metodo auxiliar que nos ayuda a multiplicar los reales 
     * @param Complejo x
     * @param Complejo y
     * @return double MultiplicacionAuxReal
     */
    public double MultiplicacionAuxReal(Complejo x, Complejo y){
        return (x.real * y.real ) - (x.imaginario * y.imaginario);
    }

    /**
     * metodo auxiliar que nos ayuda a multiplicra los imaginarios 
     * @param Complejo x 
     * @param Complejo y
     * @return double MultiplicacionAuxImaginario
     */
    public double MultiplicacionAuxImaginario(Complejo x, Complejo y ){
        return (x.real * y.imaginario) + (x.imaginario * y.real);
    }

    /**
     * metodo que nod ayuda a multipicra complejos 
     */
    public Complejo multiplica(Complejo b){
        Complejo a = new Complejo();
        a.real= MultiplicacionAuxReal(this, b);
        a.imaginario = MultiplicacionAuxImaginario(this, b);
        return a;
    }

    /**
     * metodo que nos ayuda a elevar un complejo al cuadrado 
     */
    public Complejo cuadrado(){
        return this.multiplica(this) ;
    }

    /**
     * metodo que nos ayuda a elevar un complejo al cubo 
     */
    public Complejo cubo(){
        return this.cuadrado().multiplica(this);
    }

    /**
     * metodo que nos ayuda a conjugar un complejo
     */
    public Complejo conjugado(){
        this.imaginario = -this.imaginario;
        return this;
    } 

    /**
     * metodo auxiliador que nos ayuda a hacer el divisor de la division 
     * @param Complejo x
     * @return double AuxDivisor 
     */
    public double AuxDivisor(Complejo x ){
        double divisor = Math.pow(x.real , 2)+ Math.pow(x.imaginario, 2);
        return divisor;

    }

    /**
     * metodo que nos ayuda a hacer el inverso del complejo 
     */
    public Complejo inverso(){
        return new Complejo(this.real/AuxDivisor(this), -this.imaginario/AuxDivisor(this));

    }
    
    /**
     * metodo que nos ayuda a divir complejos 
     */
    public Complejo divide(Complejo b){
        return this.multiplica(b.inverso());    
    }

    /**
     * metodo que nos ayuda a hacer el modulo de un double 
     */
    public double modulo(){
        double modulo = Math.sqrt(Math.pow(real, 2)+ Math.pow(imaginario , 2));
        return modulo;
    }

    /**
     * metodo que nos ayuda a saber si dos complejos son iguales
     */
    public boolean esIgual(Complejo b){
        if(b.real == real ){
            if(b.imaginario == imaginario){
                return true;
            }else{
                return false;
            }
        }return true;
    }

    public String muestra(){
        return this.real + "+" + this.imaginario + "i";
    }

    public static void main(String[] args) {
        Complejo a = new Complejo(6.0, 2.0);
        Complejo b = new Complejo(9.0, 2.0); 
        Complejo c = new Complejo(10.0, 2.0);
        Complejo d = new Complejo(4.0, 9.0);
        Complejo e = new Complejo(4.0, 9.0);
        Complejo f = new Complejo(6.0, 9.0);
        Complejo g = new Complejo(2.0, 7.0);
        Complejo h = new Complejo(4.0, 9.0);
        Complejo i = new Complejo(4.0, 2.0);
        Complejo j = new Complejo(4.0, 12.0);
        Complejo k = new Complejo(5.0, 8.0);
        Complejo l = new Complejo(4.0, 4.0);
        Complejo m = new Complejo(6.0, 2.0);
        System.out.println(a.suma(b));
        System.out.println(c.multiplica(d));
        System.out.println(e.cuadrado());
        System.out.println(f.cubo());
        System.out.println(g.conjugado());
        System.out.println(h.inverso());
        System.out.println(i.divide(j));
        System.out.println(k.modulo());
        System.out.println(l.esIgual(m));
    }

}