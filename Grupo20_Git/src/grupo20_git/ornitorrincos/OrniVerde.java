/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo20_git.ornitorrincos;

import java.util.Scanner;

/**
 *
 * @author Federico Galan
 */
public class OrniVerde extends Castor implements MamaPata {
    private String nombre;
    private double picoLongitud;
    private double patasLongitud;

    public OrniVerde(String nombre, double picoLongitud, double patasLongitud,double longitudCola, double velocidad) {
        super(longitudCola, velocidad);
        this.nombre = nombre;
        this.picoLongitud = picoLongitud;
        this.patasLongitud = patasLongitud;
    }
    public String getNombre(){
        return nombre;
    }
    
    
    @Override
    public void tocarOrgano() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Presiona la tecla Enter/Intro para tocar el organo.......");
        scanner.nextLine();
        System.out.println("Do-Re-Mi-Fa-Sol-La-Le-Li-Lo-Lu");
    }
    
    public void tocarGuitorgan(){
        System.out.println(nombre+" Tocando el Guitargan");
        tocarGuitarra();
        tocarOrgano();
        System.out.println("Tocada Finalizada digo, Cuac cuaac....!");
    }
}
