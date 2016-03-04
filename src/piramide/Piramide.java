/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

/**
 *
 * @author diego
 */
public class Piramide {
    
    public static void Izq(int h){
        for(int i=0; i<h; i++){
            System.out.println();
            for(int j=h; j>h-i-1; j--){
                System.out.printf("%c",'*');
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        final int ALTURA = 5;
        Piramide.Izq(ALTURA);
    }
    
}
