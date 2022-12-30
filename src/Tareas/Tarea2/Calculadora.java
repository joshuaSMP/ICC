/**Montaño Pérez Joshua Said 
 * 317222812
 */

public class Calculadora{
    private String color;
    private String logo;
    
    public int sumarBinaria (int x, int y ){
        int sumaTotal = x + y;
        return sumaTotal;
    }

    int sumarPosfijo;
    public int sumarPosfijo(int x,int y ){
        for(int i=0;i<= y ;i++){
           System.out.println("iteracion"+ " " +i + " "+"Actual x"+ " "+ x  +" " +"x++"+ " "+ x++ );
        }
        return sumarPosfijo;
    }

    int sumarSufijo;
    public int sumarSufijo(int x, int y ){
        for(int i=0; i< y;i++){
            System.out.println("iteracion"+ "" +i + " " +"Actual x"+ x + " " + "++x"+ " "+ ++x );
        }return sumarSufijo;
    }
    
    public int restarBinaria(int x, int y){
        int restarBinaria = x-y;
        return restarBinaria;
    }

    int restarPosfijo;
    public int restarPosfijo(int x, int y ){
        for(int i=0;i<= y; i++){
            System.out.println("iteracion" + " " + i + " "+"Actual x"+ x + " " +"x--"+ " "+ x-- );
        }
        return restarPosfijo;
    }
    
    int restarSufijo;
    public int restarSufijo(int x,int y  ){
        for(int i=0; i< y; i++){
            System.out.println("iteracion" + " "+ i + " "+ "Actual x"+ x + " "+"--x"+ " " +--x );
        }return restarSufijo;
    }
    
    public int multiplicar(int x, int y){
        int multiplicar = x * y ;
        return multiplicar;
        
    }
    
    public double dividir( int x, int y ){
        double dividir = x/y;
        return dividir;

    }
    
    public int modulo( int x, int y){
        int modular= x % y;
        return modular ;
    }
    public Calculadora(String color, String logo){
        this.color = "rojo";
        this.logo = "casio";

    }
    
    public String orden( int x, int y, int z){
        if(x==y && y==z)
            System.out.println("todos los numeros son iguales");
        if(x==y)
            System.out.println(x +" "+ "y" + " " + y + " " + "son iguales");
        if(x==z)
            System.out.println(x +" "+"y" + " " + z + " " + "son iguales ");
        if(y==z)
            System.out.println(y + " "+"y" + z + "son iguales ");
        if(x<y && x<z)
            System.out.println(x + " "+" x es el menor de los numeros ");
        if(y<x && y<z)
            System.out.println(y + " "+"y es el menor de los numeros ");
        if(z<x && z<y)
            System.out.println(z + " "+"z es el menor de los numeros ");
        if(x>y && x>z)
            System.out.println(x + " "+"x es el mayor de los numeros ");
        if(y>x && y>z)
            System.out.println(y + " "+"y es el mayor de los numeros ");
        if(z>x && z>y)
            System.out.println(z + " " +"z es el mayor de los numeros ");
        
         return " ";
        }
    public static void main(String [] args ){
        Calculadora cDirector = new Calculadora("rojo ", "casio");
        System.out.println(cDirector.sumarBinaria(5,2));
        System.out.println(cDirector.sumarPosfijo(6,2));
        System.out.println(cDirector.sumarSufijo(6,2));
        System.out.println(cDirector.restarBinaria(6,2));
        System.out.println(cDirector.restarPosfijo(6,2));
        System.out.println(cDirector.restarSufijo(6,2));
        System.out.println(cDirector.multiplicar(2,1));
        System.out.println(cDirector.dividir(6,2));
        System.out.println(cDirector.modulo(6,2));
        System.out.println(cDirector.orden(5, 20, 5));

    }
    
}
    