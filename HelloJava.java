
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package hellojava;
import static java.lang.Math.*;
/**
 *
 * @author Максим
 */
public class HelloJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        switch (x){
            case -3:
                lessOrEqualThanMinusThree(x);
                break;
            case 4:
                lessOrEqualThanFour(x);
                break;
            default:
                moreThanFour(x);
                break;
        }
       }
    public static void lessOrEqualThanMinusThree(int x){
        double y = (pow(x,3) + 1);
        double f = (exp(sin(x)));
        System.out.println("Y = "+ y +"\n F = "+ f);
    }
    
    public static void lessOrEqualThanFour(int x){
        double y = (x * (1 + pow(2,x)));
        double f = pow(x,4);
        System.out.println("Y = "+ y +"\n F = "+ f);
    }
    
    public static void moreThanFour(int x){
        double y = tan(x);
        double f = pow(tan(x),1/5);
        System.out.println("Y = "+ y +"\n F = "+ f);
    }
        
}

