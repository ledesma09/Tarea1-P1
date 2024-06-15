/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ledesma
 */
public class NumDoWhile {
    
    public static void main(String[] args) {
        
        int numero = 1; 
        int sumatoria = 0; 
        
        do {
            sumatoria = sumatoria + numero;
             System.out.println("Numero: ["+numero+"] --> Sumatoria: ["+sumatoria+"] = " + (sumatoria + numero));
            
            
            numero++;
            
        }while (numero <= 20); 
    }
    
}
