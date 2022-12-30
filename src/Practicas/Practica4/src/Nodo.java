
public class Nodo {

    private Object modelo;
    
    private Nodo siguiente ;


    public Nodo(Object valor){
        this.modelo = valor;
        siguiente = null;
    }

    public Object getModelo(){
        return this.modelo;
    }
    public Nodo getSiguiente(){
        return this.siguiente;
    }

    public Nodo setSiguiente(Nodo nuevo){
        this.siguiente = nuevo;
        return nuevo;
    }

    @Override
    public String toString(){
        return " " + this.getModelo();
    }
}