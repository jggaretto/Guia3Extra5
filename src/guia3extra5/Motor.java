
package guia3extra5;


public class Motor {
 Tanque tanque;
    private Velocidad velocidadActual;
    
    public Motor(Tanque tanque) {
        this.tanque = tanque;
        this.velocidadActual = Velocidad.MEDIA;
    }
    
    public void consumirAgua() {
        int cantidad = 0;
        switch (velocidadActual) {
            case ALTA:
                cantidad = 10;
                break;
            case MEDIA:
                cantidad = 5;
                break;
            case BAJA:
                cantidad = 1;
                break;
        }
        tanque.cantidadActual -= cantidad;
    }
    
    public void cambiarVelocidad() {
        switch (velocidadActual) {
            case ALTA:
                velocidadActual = Velocidad.MEDIA;
                break;
            case MEDIA:
                velocidadActual = Velocidad.BAJA;
                break;
            case BAJA:
                velocidadActual = Velocidad.ALTA;
                break;
        }
    }
    
    public Velocidad getVelocidadActual() {
        return velocidadActual;
    }
}

