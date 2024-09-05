/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author chiri
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double veloz, tiempo, dista, acele;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("Velocidad inicial: ");
        veloz = captu.nextDouble();
        System.out.println("Aceleracion: ");
        acele = captu.nextDouble();
        System.out.println("Tiempo: ");
        tiempo = captu.nextDouble();
        
        dista = veloz * tiempo + (acele * tiempo * tiempo)/2.0;
        
        System.out.println("Distancia = " + dista);
        
    }
    
}
