/**Representar varias mascotas
 * esta clase define las caracteristicas de las mascotas.
 * @author Montaño Pérez Joshua Said 
 * 317222812
 *  
 * 
 */
public class Mascota {
    /** color de pelo */
    public String colorPelo;
    /**genero de la mascota */
    public String genero;
    /** numero de ojos que tienen las mascotas  */
    private final int NUMERODEOJOS = 2;
    /**el tipo de raza de la mascota */
    private String raza;
    /**el recuerdo que tiene las mascota sobre su dueño  */ 
    private String dueño;
    /**el recuerdo de la mascota que le dijo otra mascota  */
    private String recuerdos;
    /**el numero de veces que se ha creado una mascota  */
    public static int mascotas; 

    /**
     * Construye una nueva mascota con estos atributos
     * @param colorPelo color de pelo 
     * @param genero genero de la mascota
     * @param raza tipo de raza de la mascota 
     * @param dueño el recuerdo del dueño 
     * @param recuerdos el recuerdo que tiene de otras mascotas 
     */
    public Mascota(String colorPelo, String genero ,String raza, String dueño,  String recuerdos){
        this.colorPelo = colorPelo;
        this.genero = genero;
        this.raza = raza ;
        this.recuerdos = recuerdos;
        this.dueño = dueño;
        mascotas += 1; 
    }

    /**
     * Segundo contructor que solo nos servira para inicializar las varibles
     * @param colorPelo = ""
     * @param genero = ""
     * @param raza = ""
     * @param dueño = ""
     * @param recuerdos =  ""
     */
    public Mascota(){
        colorPelo = "";
        genero = "";
        raza = "" ;
        dueño = "";
        recuerdos = "";
        mascotas += 1;
    } 

    /**
     *  
     * permite acceder al color de la mascota
     * @return el color de la mascota 
     */
    public String getColorPelo(){
        return this.colorPelo;

    }

    /**
     * modifica el color de pelo de la mascota 
     * @param colorPelo el nuevo color de la mascota
     */
    public void setColorPelo(String colorPelo){
        this.colorPelo = colorPelo;
        return ;
    
    }    

    /**
     * permite acceder al genero de la mascota 
     * @return el genero de mascota
     */
    public String getGenero(){
        return this.genero;

    }

    /**
     * modifica el genero de la mascota
     * @param genero el nuevo genero de la mascota 
     */
    public void setGenero(String genero ){
        this.genero = genero;
        return;

    }
    /**permite acceder al numero de ojos que tiene la mascota 
     * @return el NUMERODEOJOS que tiene la mascota
     */
    public int getNUMERODEOJOS() {
        return this.NUMERODEOJOS;
    }
    /**
     * permite acceder al tipo de raza que es la mascota 
     * @return el valor de la mascota
     */
    public String getRaza(){
        return this.raza;

    }

    /**
     * modifica el tipo de raza que es la mascota 
     * @param raza el nuevo tipo de raza que es 
     */
    public void setRaza(String raza){
        this.raza = raza ;
        return ;

    }

    /**
     * permite acceder al recuerdo del dueño que tiene la mascota
     * @return el recuerdo del dueño que tiene la mascota
     */
    public String getDueño(){
        return this.dueño;

    }

    /**
     * modifica el recuerdo del dueño que tiene la mascota 
     * @param dueño el nuevo recuerdo que tiene la mascota 
     */
    public void setDueño( String dueño){
        this.dueño = dueño;
        return ;
    }
    
    /**
     * permite acceder al recuerdo que tiene la mascota sobre lo que le halla contado 
     * otra mascota 
     * @return el recuerdo que le dijo la otra mascota 
     */
    public String getRecuerdos(){
        return this.recuerdos;
    }

    /**
     * modifica el recuerdo que le conto otra mascota
     * @return el recuerdo modificado de la otra mascota
     */
    public void setRecuerdos(String recuerdos){
        this.recuerdos = recuerdos;
        return;
    }

    /**
     * permite acceder al numero de mascotas hechas 
     * @return el numero de mascotas creadas
     */
    public int getMascotas(){
        return this.mascotas;
    }

    /**
     * modifica el valor de mascotas creadas
     * @param mascotas el numero de mascotas que ahora hay 
     */
    public void setMascotas(int mascotas){
        this.mascotas = mascotas ;
        return ;
    }


    /**
     * este metodo permite que las macotas conversen entre ellas y puedan recordar las que las otras les dicen 
     * @param mascota a la mascota con la que esta platicando 
     * @param mascota b las mascota que esta escuhando  
     * @return lo que la otra mascota le alla contado sobre su dueño 
     */
    public String conversacion(Mascota a, Mascota b ){
        return this.recuerdos  = this.recuerdos + "yo recuerdo que " + a.raza + "recuerda de su dueño que " + dueño + a.getDueño();
    }


    /**
     * este meotodo permite que las mascotas conversen entre otras mascotas y ademas recordar lo que les dijeron 
     * @param a una mascota platica con otra 
     * @param b la otra mascota es la que esta escuchando
     * @return el recuerdo de la otra mascota 
     */

    public String conversacion2(Mascota a, Mascota b ){
        return this.recuerdos = a.getDueño() + b.getRecuerdos() + b.getRaza() + "\n La mascota platico con " + a.raza ;
    }
    

    @Override
    public String toString(){
        String s = "";
        s = "El color de pelo es: " + colorPelo + "\n"
         + "El genero de la mascota es: " + genero + "\n" 
         + "La raza es: " + raza + "\n"
         + "Los recuerdos de la mascota son :" + recuerdos + "\n" 
         + "El dueño es:" + dueño +  "\n"
         + "Numero de ojos de la mascota :" + NUMERODEOJOS + "\n";
        return s;
        
    }

    public static void main(String[] args ){
        Mascota juani = new Mascota("negro ", "masculino ", "french poodle ","mi dueño le gusta ver el football ", "");
        System.out.println(juani+"\n");
        Mascota pepito = new Mascota(" blanco ", "femenino ", "pastor alemaman ", "mi dueño me saca a pasear ", " ");
        System.out.println(pepito+"\n") ;
        Mascota alan = new Mascota(" gris ", "masculino ", "chihuahua ", "mi dueño le gusta dormir ", " ");
        System.out.println(alan+"\n");       
        Mascota tomasa = new Mascota("blanco y negro ", "masculino ", "husky ", "mi dueño me rasca la pansa cada vez que me ve ", " ");
        System.out.println(tomasa+"\n");
        Mascota mau = new Mascota("amarrilo y negro ", "femenino ", "pug ", "mi dueño me da todo tipo de comidas ", " ");
        System.out.println(mau+"\n");
        Mascota pinto = new Mascota("blanco con manchas grises ", "femenino ", "salchicha ", "mi dueño me pone musica para que baile con el ", " ");
        System.out.println(pinto+"\n");
        System.out.println("Hay "+ mascotas +" de mascotas");
        System.out.println( pepito.conversacion(pepito , tomasa));
        System.out.println( juani.conversacion(juani , alan));
        System.out.println( mau.conversacion(mau, pinto));
        System.out.println( pinto.conversacion(pinto , pepito));
        System.out.println( tomasa.conversacion(tomasa , juani));
        System.out.println( alan.conversacion(alan , mau));
        System.out.println( tomasa.conversacion2( tomasa, pepito ));
        System.out.println( alan.conversacion2(alan, juani));
        System.out.println( pinto.conversacion2(pinto, mau));
        System.out.println( pepito.conversacion2( pepito, pinto));
        System.out.println( juani.conversacion2(juani, tomasa));
        System.out.println( mau.conversacion2(mau, alan));
        

        
        
    }

}