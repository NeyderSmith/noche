
package matematicas;
import java.util.Scanner;

public class Matematicas {

   
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner (System .in);
    float numero1,numero2,suma,resta,div,mult,resto;
    
        System.out.println("digite dos numeros: ");
         numero1 = entrada.nextFloat();
         numero2 = entrada.nextFloat();
         
        suma=numero1+numero2;
        resta=numero1-numero2;
        mult=numero1*numero2;
        div=numero1/numero2;
        resto = numero1%numero2;
        
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicaciones: "+mult);
        System.out.println("la division es: "+div);
        System.out.println("el residuo es: "+resto);
        
        System.out.println("neyder smiht tolosa");
       
    }
    
}
