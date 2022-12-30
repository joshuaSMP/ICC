
public class ListaLigada implements ListaInterfaz{

    private Nodo cabeza;

    private int tamanio; 

    private Nodo cola;

    public int tamanio(){
        return tamanio;
    }

    public void insertaPrimero(Object objeto){
        Nodo nuevo = new Nodo(objeto);
        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;
        tamanio++;
    }    

    public boolean inserta(Object objeto, int indice){
      Nodo nuevo = new Nodo(objeto);
      int posicion= 0;
      Nodo iterador ;
      if(posicion < 0 || posicion > tamanio){
          return false;
      } 
      for(iterador = cabeza;iterador != null;iterador=iterador.getSiguiente()){ 
          posicion++;
          if(posicion==indice){
                nuevo.setSiguiente(iterador.getSiguiente());
                iterador.setSiguiente(nuevo);
                iterador = nuevo;
                tamanio++;
                return true;
          }
      }
       return false;
    }

    public void insertaFinal(Object objeto){
        Nodo nuevo = new Nodo(objeto);
        Nodo iterador = cabeza;
        if(this.estaVacia()){
            cabeza = cola = nuevo;
        }else{
           while(iterador != null){
               if(iterador.getSiguiente() == null){
                   nuevo.setSiguiente(iterador.getSiguiente());
                   iterador.setSiguiente(nuevo);
                   iterador = nuevo;
                   tamanio++;
                   return ;
               }
                iterador = iterador.getSiguiente();          
           }
        }
    }

    public Object obtenPrimero(){
        if(tamanio == 0){
            return null;
        }
        return cabeza;
    }

    public Object obten(int indice){
        if(indice < 0 || indice >= tamanio){
            return null;
        }else{
            Nodo aux = cabeza;
            int i = 0;
            while(i<indice){
                aux = aux.getSiguiente();
                i++;
            } return aux.getModelo();
        }    
    }


    public void eliminaPrimero(){
        cabeza = cabeza.getSiguiente();
        tamanio--;
    }

    public void elimina(int indice){
        int i = 0;
        if(indice == 0){
            cabeza = cabeza.getSiguiente();
            tamanio--;
            return ;
        }
        Nodo iterador = cabeza;
        while(i< indice-1 && indice<tamanio && indice >= 0 && iterador != null){
            iterador = iterador.getSiguiente();
            i++;
        }
        iterador.setSiguiente(iterador.getSiguiente().getSiguiente());
        tamanio--;
    }


    public int indice(Object objeto){
        Nodo iterador = cabeza;
        int contador = 0;
        int indice = 0;
        while(iterador != null){
            if(iterador.getModelo().equals(objeto)){
                indice = contador;
                return indice;
            }
            contador++;
            iterador = iterador.getSiguiente();
        }
        return -1;
    }

    public boolean estaVacia(){
        if(this.tamanio() == 0){
            return true;
        }else return false;
    }

    public ListaInterfaz concatena(ListaInterfaz otra){
        ListaLigada aux = new ListaLigada();
        Nodo iterador = cabeza;
        while(iterador != null){
            aux.insertaFinal(iterador);
            iterador = iterador.getSiguiente();
        }
        ListaLigada aux2 = (ListaLigada)otra;
        iterador = aux2.cabeza;
        while(iterador != null){
            aux.insertaFinal(iterador);
            iterador = iterador.getSiguiente();
        }
        return aux;
    }
    
    public void limpia(){
        cabeza = null;
    }

    public String imprime(){
        if(this.tamanio == 0){
            return "[]" ;
        }
        String inicio = "[";
        int contador = 0;
        while(contador<this.tamanio-1){
            inicio = inicio + this.obten(contador)+" >>> ";
            contador++;
        }
        inicio = inicio + this.obten(this.tamanio-1)+ "]";
        return inicio;
    }
    

    public static void main(String arrgs[]){
        ListaLigada uno = new ListaLigada();
        ListaLigada dos = new ListaLigada();
        Carros azul = new Carros("Ferrari", 4);
        Carros rojo = new Carros("Bochito", 4);
        Carros morado = new Carros("Tsuru ", 4);
        Carros verde = new Carros("March", 4 );

        uno.insertaPrimero(azul);
        uno.inserta(rojo,1);
        uno.inserta(verde,2);
        uno.insertaFinal(morado);
        System.out.println(uno.imprime());
        System.out.println("El primer elemento es : " + uno.obtenPrimero());
        System.out.println("El modelo es :" + uno.obten(2));
        uno.eliminaPrimero();
        uno.elimina(1);
        System.out.println(uno.imprime());
        System.out.println("EL indice es : " + uno.indice(morado));
        System.out.println("La lista es vacia :"+ uno.estaVacia());
        System.out.println("Lista concatenada :");
        ListaLigada concatenada = (ListaLigada)dos.concatena(uno);
        concatenada.imprime();
        System.out.println(uno.tamanio());
        uno.limpia();
        System.out.println(uno.imprime());
        

        


    }
}