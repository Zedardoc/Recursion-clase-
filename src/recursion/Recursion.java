/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;
import java.util.Scanner;
/**
 *
 * @author CENTIC
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    static int BajarEscaleras(int x_escaleras){
        
        if(x_escaleras == 0){
            System.out.println("Se han bajado todas las escaleras");
        return 1;
        }
        int x_escaleras_restantes = x_escaleras -1;
        System.out.println("Se ha bajado una escalera, quedan " + x_escaleras_restantes + " escaleras");
        return BajarEscaleras(x_escaleras_restantes);
    }
    
    static int BajarEscalerasComoTonto(int x_escaleras){
        
        if(x_escaleras == 0){
            System.out.println("Se han bajado todas las escaleras");
        return 1;
        }
        
        int x_escaleras_restantes = x_escaleras;
        while(x_escaleras_restantes!=0){
        x_escaleras_restantes--;
        System.out.println("Se ha bajado una escalera, quedan " + x_escaleras_restantes + " escaleras");
        
        }
        return 1;
                
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escaleras = scanner.nextInt();
        System.out.println("Queremos bajar "+ escaleras + " escaleras");
        if(BajarEscaleras(5)==1){System.out.println("Exito");}
        
        //
  
        System.out.println("Queremos bajar "+ escaleras + " escaleras de forma tonta");
        if(BajarEscalerasComoTonto(5)==1){System.out.println("Exito");}
    }
    
}
