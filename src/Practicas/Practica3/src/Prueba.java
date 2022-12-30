/**
 * @author Montaño Pérez Joshua Said 
 * 317222812
 * en esta clase implementaremos los metodos de la interface AnalizadorDeCadenas 
 * 
 */
public class Prueba implements AnalizadorDeCadenas{

    /**
     * Utilizamos un constructor vacio para inicilizar las varibales que vallamos 
     * a utilizra 
     */
    public Prueba(){
        
    }

    @Override
    public int encuentraPosicion(String cadena, char c ){
        int i=0;
        while(i < cadena.length()){
            i++;
            if(c == cadena.charAt(i)){
                return i;
            }
        }return -1;

    }

    @Override
    public boolean esNumero(String cadena){
        int i=0;
        boolean a = false    ;
        Prueba numero = new Prueba();
        while(i < cadena.length()){
            i++;
            numero.auxEsNumero(cadena.charAt(i));
            break;
        }
        if(numero.cuentaCaracter(cadena,'.')>1){
            return false;
        }
        if(numero.auxEsNumero(cadena.charAt(i))== true && numero.cuentaCaracter(cadena, '.')>1 == false){
            a = true;
        }else{
            a = false;
            }
        return a;
        }   
    /**
     * este metodo auxiliar nos ayuda a ver si char es numero 
     * @param char i 
     * @return boolean si es verdadero o falso 
     */
    public boolean auxEsNumero(char i ){
        if(i == '0'){
            return true;
        }else{
            if(i == '1'){
             return true;   
            }else{
                if(i == '2'){
                    return true;
                }else{
                    if(i == '3'){
                        return true;
                    }else{
                        if(i == '4'){
                            return true;
                        }else{
                            if(i == '5'){
                                return true; 
                            }else{
                                if(i == '6'){
                                    return true;
                                }else{
                                    if(i == '7'){
                                        return true;
                                    }else{
                                        if(i == '8'){
                                            return true;
                                        }else{
                                            if(i == '9'){
                                                return true;
                                            }else{
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    public String reemplazaCaracter(String cadena, char reemplazado, char reemplazador){
        int i=-1;
        String n = "";
        while(i< cadena.length()-1){
            i++;
            if(reemplazado==cadena.charAt(i)){
                n+=reemplazador;
            }
            if(reemplazado!=cadena.charAt(i)){
                n+=cadena.charAt(i);
            }
        } return n;
    }

    @Override
    public int cuentaCaracter(String cadena, char c){
        int i= -1;
        int j= 0;
        while(i < cadena.length()-1){
            i++;
            if(c==cadena.charAt(i)){
                j++;
            }        
        }return j;
    }

    @Override
    public boolean esPalindromo(String cadena){
        int i=0;
        int fin = cadena.length()-1;
        boolean esPalindromo = true;
        while(i<fin ){
            i++;
            if(cadena.charAt(i)!=cadena.charAt(fin-1)){
                esPalindromo = false;
            }
            i++;
            fin --;
        }
        return esPalindromo;
    }

    @Override
    public boolean contiene(String cadena, String buscada){
        int i=-1;
        boolean a= false ;
        while(i<cadena.length()-1){
            i++;
            if(cadena.charAt(i)==buscada.charAt(0)){
                if(buscada.length()+i>cadena.length()){
                    return true ;
                }
            }
            for(int j = 0;j < buscada.length()-1;j++){
                if(cadena.charAt(i+j)==buscada.charAt(j)){
                    a = false;
                }else{
                    a = true;
                }
            }
        }return a;
    }

    @Override
    public boolean sonIguales(String cadena1, String cadena2){
        boolean a = false;
        cadena1 = cadena1.toUpperCase();
        cadena2 = cadena2.toUpperCase();
        if(cadena1.length()!= cadena2.length()){
            a = false;
        }
        for(int i=0; i<cadena1.length()-1;i++){
            if(cadena1.charAt(i) != cadena2.charAt(i)){
                return a = false;
            }
        }
        return a = true;
    }

    @Override
    public String daSubcadena(String cadena, int inicio, int fin){
        int i= inicio;
        String res = "";
        if(inicio<0){
            return cadena;
        }
        if(cadena.length()<fin){
            return cadena;
        }
        while(i<fin){
            i++;
            res += cadena.charAt(i);
        }
        return res;
    }


    public static void main(String[] args) {
        Prueba nueva = new Prueba();
        System.out.println(nueva.encuentraPosicion("Esta es una palabra de prueba", 'e'));
        Prueba numero = new Prueba();
        System.out.println(numero.esNumero("1233texto24"));
        Prueba caracter = new Prueba();
        System.out.println(caracter.reemplazaCaracter("Palabra de prueba", 'a', 'o'));
        Prueba cuenta = new Prueba();
        System.out.println(cuenta.cuentaCaracter("Ferrocarrilero", 'r'));
        Prueba palindromo = new Prueba();
        System.out.println(palindromo.esPalindromo("oso baboso"));
        Prueba contiene = new Prueba();
        System.out.println(contiene.contiene("Hola mundo", "ola"));
        Prueba sonIguales = new Prueba();
        System.out.println(sonIguales.sonIguales("Hola mundo", "HoLa MuNdO"));
        Prueba sub = new Prueba();
        System.out.println(sub.daSubcadena("Esta es una cadena ",0, 3));

        
    }

}