
package guia3extra5;

public class Tanque {
    
 int capacidadMaxima;
    int cantidadActual;
    
    public Tanque(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }
    
    public boolean estaLleno() {
        return cantidadActual == capacidadMaxima;
    }
    
    public boolean estaVacio() {
        return cantidadActual == 0;
    }
    
    public void cargar() {
        if (!estaLleno()) {
            cantidadActual += 500;
            if (cantidadActual > capacidadMaxima) {
                cantidadActual = capacidadMaxima;
            }
        }
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }
}

enum Velocidad {
    ALTA,
    MEDIA,
    BAJA
}

