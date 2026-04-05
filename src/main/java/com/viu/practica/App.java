package com.viu.practica;

import java.util.*;

public class App {
    // Code Smell: Variable estática pública y nombre no descriptivo
    public static List l = new ArrayList(); 

    public static void main(String[] args) {
        System.out.println("Iniciando Sistema de Biblioteca...");
        agregarLibro("El Quijote");
        imprimirLibros();
    }

    public static void agregarLibro(String n) {
        // Bug potencial: No hay validación de nulos
        l.add(n);
    }

    public static void imprimirLibros() {
        // Code Smell: Uso de System.out en lugar de un Logger
        for (int i = 0; i < l.size(); i++) {
            System.out.println("Libro: " + l.get(i));
        }
    }
    
    // Code Smell: Método vacío e inútil
    public void metodoVacio() {
    }
}