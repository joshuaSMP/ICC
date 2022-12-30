
public class Carros {
    public String modelo;

    public int llantas;

    public Carros(String modelo, int llantas){
        this.modelo = modelo;
        this.llantas = llantas;
    }

    public String getModelo(){
        return this.modelo;
    }
    public int getLlantas(){
        return this.llantas;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setLlantas(int llantas){
        this.llantas = llantas;
    }

    @Override
    public String toString(){
        return "Modelo :" +modelo + ", El número de llantas es: " + llantas;
    }

    
    public boolean equals(Carros carros){
        if(modelo.equals(carros.getModelo()) && llantas == carros.getLlantas()){
            return true;
        }
        return false;
    }
}