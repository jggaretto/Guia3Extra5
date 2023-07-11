/*
En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
Para regar un parque se dispone de una Bomba, la cual posee un Motor y este un Tanque de Agua.
El Tanque de Agua tiene una capacidad máxima es de 10.000 litros y los comportamientos para
saber si su capacidad está al límite o vacía y otro cargar que cada vez que se lo invoca carga 500
litros. El Motor puede trabajar con 3 velocidades distintas (ALTA, MEDIA y BAJA) y un
comportamiento consumirAgua que cada vez que se lo invoca consume 10 litros si trabaja a
velocidad ALTA, 5 litros si trabaja a velocidad MEDIA y 1 litro si trabaja a velocidad BAJA; otro
comportamiento cambiarVelocidad que cada vez que se lo usa, cambia la velocidad de Alta a
Media y de Media a Baja y vuelve a empezar. La Bomba tiene un comportamiento regar que hace
que el Motor consuma agua hasta que su tanque quede completamente vacío y otro
comportamiento mostrarInfor que muestra por pantalla la carga inicial del tanque, la velocidad del
motor.
Se pide desde el método main de una clase TestRegar:
a) Crear un Tanque y llenarlo con 5000 litros de agua.
b) Crear un Motor con este Tanque y que trabaje a velocidad Media.
c) Crear una Bomba con el motor instanciado en el punto b.
d) Hacer que la Bomba riegue y al finalizar invocar al método mostrarInfo.
 */
package guia3extra5;

public class Guia3Extra5 {

    
    public static void main(String[] args) {
        Tanque tanque = new Tanque(10000);
        tanque.cargar();
        tanque.cargar();
        tanque.cargar();
        tanque.cargar();
        tanque.cargar();
        Motor motor = new Motor(tanque);
        Bomba bomba = new Bomba(motor);
        bomba.regar();
        bomba.mostrarInfo();
    }
}


/*import java.util.Random;

public class TestRegar {
    public static void main(String[] args) {
        Random rand = new Random();

        Tanque tanque = new Tanque();
        int cargaInicial = rand.nextInt(10001);
        tanque.cargar(cargaInicial);
        System.out.println("Se cargaron " + cargaInicial + " litros de agua en el tanque.");

        Motor motor = new Motor(tanque);
        int velocidadInicial = rand.nextInt(3); // 0: BAJA, 1: MEDIA, 2: ALTA
        motor.setVelocidad(velocidadInicial);
        System.out.println("La velocidad inicial del motor es " + motor.getVelocidad() + ".");

        Bomba bomba = new Bomba(motor);
        bomba.regar();
        bomba.mostrarInfo();
    }
}
*/






