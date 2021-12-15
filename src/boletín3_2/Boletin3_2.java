/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín3_2;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    /*float lado=3f;
    /*
    float area=lado*lado;
    System.out.println("o area de cadrado é="+area);*/
   
    /*float area=(float)Math.pow(3, 2);   
    System.out.println("o area do cadrado é ="+area);*/
   
    
    /*String frase;*/
    
    /*Scanner sc=new Scanner (System.in);
    System.out.println(" teclea euros: ");
    
    euros=sc.nextFloat();
    
    System.out.println(" euros =" +euros);    
    
    float euroADolar;
    System.out.println(" teclea euroADolar: ");
    euroADolar=sc.nextFloat();
    System.out.println(" euroADolar="+euroADolar);
    
    float dolares=euros*euroADolar;
    System.out.println(euros+ "euros equivalen a "+ dolares+ "dolares" );*/
   final double CONSTANTE1=1.8, CONSTANTE2=32, CONSTANTE3=273;
    double temperatura_grados_centigrados;
    System.out.println(" introduce los grados centígrados: ");
    Scanner sc=new Scanner (System.in);
    temperatura_grados_centigrados=sc.nextDouble();
    
    System.out.println(" grados centígrados =" +temperatura_grados_centigrados);
    
    
    
    
    double temperatura_grados_Fahrennheit=temperatura_grados_centigrados*CONSTANTE1+CONSTANTE2;
    double temperatura_grados_Kelvin=temperatura_grados_centigrados+CONSTANTE3;
    
    System.out.println(" la temperatura en grados Fahrennheit ="+temperatura_grados_Fahrennheit + "ºF");
    System.out.println(" la temperatura en grados Kelvin="+temperatura_grados_Kelvin + "ºK");
    
    
    
    
   
    
    
    
   
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
