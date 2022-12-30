/**esta clase veterinario nos sirve para que las mascotas hagan y desagan amistades entre ellas 
 * @author Montaño Përez Joshua Said
 * 317222812
 * 
 * 
 */
public class Veterinario{
/**es una mascota a */
    public Mascota a;
/**es una mascota b  */
    public Mascota b;
/**
 * este constructor nos sirve para ver que el veteriano pone juantas a dos mascotas 
 * @param a la mascota a 
 * @param b la mascota b 
 */
    public Veterinario(Mascota a , Mascota b ){
        this.a = a ;
        this.b = b;
    }
/**
 * este constrcur nos sirve para inicilizar los valores dl veterinario 
 */
    public Veterinario(){

    }
/**
 * este metdodo nos sirve para que las mascotas puedan hacerse mejores amigoa de otras mascotas 
 * @param x esta es la mascota x
 * @param y esta es la mascota y 
 * @return que la mascota x y y son mejores amigos 
 */
    public String hacerAmigos(Mascota x, Mascota y){
        Mascota a = x;
        Mascota b = y;

        return a.getRaza() + " y " + b.getRaza() + "son mejores amigos";
    }
/**
 * este metodo nos sirve para que las mascotas que son mejors amigos ya no lo sean 
 * @param x esta es la mascota x 
 * @param y esta es la mascota y 
 * @return que las mascotas ya no son amigos 
 */
    public String yaNoAmigos(Mascota x , Mascota y ){
         a = null;
         b = null;
        return " ya no son amigos"; 
    }

    public static void main(String[] args) {
        Veterinario jordan = new Veterinario(null, null);
        Mascota juani = new Mascota("negro ", "masculino ", "french poodle ","mi dueño le gusta ver el football ", "");
        Mascota pepito = new Mascota(" blanco ", "femenino ", "pastor alemaman ", "mi dueño me saca a pasear ", " ");
        Mascota alan = new Mascota(" gris ", "masculino ", "chihuahua ", "mi dueño le gusta dormir ", " ");
        Mascota tomasa = new Mascota("blanco y negro ", "masculino ", "husky ", "mi dueño me rasca la pansa cada vez que me ve ", " ");
        Mascota mau = new Mascota("amarrilo y negro ", "femenino ", "pug ", "mi dueño me da todo tipo de comidas ", " ");
        Mascota pinto = new Mascota("blanco con manchas grises ", "femenino ", "salchicha ", "mi dueño me pone musica para que baile con el ", " ");
        System.out.println(jordan.hacerAmigos(juani,pepito));
        System.out.println(jordan.hacerAmigos(alan ,tomasa));
        System.out.println(jordan.hacerAmigos(mau,pinto));
        System.out.println(jordan.yaNoAmigos(juani, pepito));
        System.out.println(jordan.yaNoAmigos(alan, tomasa));
        System.out.println(jordan.yaNoAmigos(mau, pinto));
        
    }


    }
