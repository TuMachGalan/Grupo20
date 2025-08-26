package grupo20_git.ornitorrincos;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Federico Galan, Heber Gomez, Tomas Abatedaga
 */
public class Castor {

    protected double longitudCola;
    protected double velocidad;

    public Castor () {
    }

    // SuperClaseCastorciño
    public Castor (double longitudCola, double velocidad) {
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }

    public void nadar () {
        System.out.println("El castor nada a una velocidad de " + velocidad
            + " km/h.");
    }

    public void tocarGuitarra () {
        Random random = new Random();
        System.out.println("El castor comienza a tocar la guitarra...");
        for (int i = 0; i < 3; i ++) {
            int cuerda = random.nextInt(6) + 1;
            System.out.println("Toca cuerda " + cuerda);
        }
    }

    public double getLongitudCola () {
        return longitudCola;
    }

    public void setLongitudCola (double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public double getVelocidad () {
        return velocidad;
    }

    public void setVelocidad (double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString () {
        return "Castor [longitudCola=" + longitudCola + " cm, velocidad="
            + velocidad + " km/h]";
    }
}
