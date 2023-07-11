
 
package guia3extra5;


public class Bomba {
    
    private Motor motor;
    
    public Bomba(Motor motor) {
        this.motor = motor;
    }
    
    public void regar() {
        while (!motor.tanque.estaVacio()) {
            motor.consumirAgua();
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Cantidad inicial del tanque: " + motor.tanque.getCantidadActual() + " litros");
        System.out.println("Capacidad máxima del tanque: " + motor.tanque.capacidadMaxima + " litros");
        System.out.println("Velocidad del motor: " + motor.getVelocidadActual());
        System.out.println("Cantidad de agua consumida por el motor: " + (motor.tanque.capacidadMaxima - motor.tanque.getCantidadActual()) + " litros");
    }
}


/*public class Bomba {
    
 
    private Motor motor;
    private int aguaConsumida;
    private boolean regando;

    public Bomba(Motor motor) {
        this.motor = motor;
        this.aguaConsumida = 0;
        this.regando = false;
    }

    public void regar() {
        if (motor.getTanque().estaVacio()) {
            System.out.println("El tanque está vacío.");
            return;
        }

        regando = true;
        while (motor.getTanque().getCantidadAgua() > 0) {
            motor.consumirAgua();
            aguaConsumida += motor.getConsumoAgua();
        }
        regando = false;
    }

    public void mostrarInfo() {
        System.out.println("La bomba regó el parque y consumió " + aguaConsumida + " litros de agua.");
        System.out.println("La velocidad del motor al finalizar es " + motor.getVelocidadString() + ".");
    }
}
*/
