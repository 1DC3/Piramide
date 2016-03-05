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
    
    public static void Dch(int h){
        for(int i=0; i<h; i++){
            System.out.println();
            for(int j=0; j<h-i-1; j++){
                System.out.printf("%c",' ');
            }
            for(int k=h; k>h-i-1; k--){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    
    public static void IzqI(int h){
        for(int i=0; i<h; i++){
            System.out.println();
            for(int j=0; j<h-i; j++){
                System.out.printf("%c", '*');
            }
        }
        System.out.println();
    }
    
    public static void DchI(int h){
        for(int i=0; i<h; i++){
            System.out.println();
            for(int j=0; j<i; j++){
                System.out.printf("%c", ' ');
            }
            for(int k=0; k<h-i; k++){
                System.out.printf("%c", '*');
            }
        }
        System.out.println();
    }
    
    public static void Cnt(int h){
        for(int i=0; i<h; i++){
            System.out.println();
            for(int j=h-1-i; j>0; j--){
                System.out.printf("%c", ' ');
            }
            for(int j=2*i+1; j>0; j--)
                System.out.print("*");
        }
        System.out.println();
    }
    public static void CntI(int h){
        for(int i=0; i<h; i++){
            System.out.println();
            for(int j=0; j<i; j++){
                System.out.printf("%c", ' ');
            }
            for(int j=0; j<(2*(h-i)-1); j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        final int ALTURA = 5;
        Piramide.Izq(ALTURA);
        Piramide.Dch(ALTURA);
        Piramide.IzqI(ALTURA);
        Piramide.DchI(ALTURA);
        Piramide.Cnt(ALTURA);
        Piramide.CntI(ALTURA);
    }
    
}
