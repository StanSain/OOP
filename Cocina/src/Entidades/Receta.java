/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Receta {

    public int harina;//en gramos
    public double agua;//en litros
    public int azucar;//en gramos
    public int levadura;//en gramos
    public String nombre;//nombre del preparado
    public int maizena;//en gramos
    public int sal;//en gramos
    public int manteca;//en gramos

    public Receta() {
    }

    public Receta(int harina, double agua, int azucar, int levadura, String nombre, int maizena, int sal) {
        this.harina = harina;
        this.agua = agua;
        this.azucar = azucar;
        this.levadura = levadura;
        this.nombre = nombre;
        this.maizena = maizena;
        this.sal = sal;
        this.manteca = manteca;
    }

    public int getHarina() {
        return harina;
    }

    public void setHarina(int harina) {
        this.harina = harina;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getLevadura() {
        return levadura;
    }

    public void setLevadura(int levadura) {
        this.levadura = levadura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaizena() {
        return maizena;
    }

    public void setMaizena(int maizena) {
        this.maizena = maizena;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getManteca() {
        return manteca;
    }

    public void setManteca(int manteca) {
        this.manteca = manteca;
    }

    public void EscribeR() {
        Scanner leer = new Scanner(System.in);
        System.out.println("preparado: ");
        nombre = leer.next();
        System.out.println("litros de agua");
        agua = leer.nextDouble();
        System.out.println("gr de aharina");
        harina = leer.nextInt();
        System.out.println("gr de maizena");
        maizena = leer.nextInt();
        System.out.println("gr de sal");
        sal = leer.nextInt();
        System.out.println("gr de manteca");
        manteca = leer.nextInt();
        System.out.println("azucar");
        azucar = leer.nextInt();
        System.out.println("levadura");
        levadura = leer.nextInt();
    }


    
}
