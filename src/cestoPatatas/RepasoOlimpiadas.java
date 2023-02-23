
package cestoPatatas;
import java.util.*;

/**
 *
 * @author enriq
 */
public class RepasoOlimpiadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int casos, patatas,yardas,distancia;
        int vector [];
        int contador = 1;
        System.out.println ("Dime el número de casos con el que vamos a operar");
        casos = teclado.nextInt();
        teclado.nextLine();
        vector = new int [casos];
        for (int i = 0; i <= (casos - 1); i++){
            System.out.println ("Dime el número de patatas para el caso " +(i+1));
            patatas = teclado.nextInt();
            teclado.nextLine();
            for (int j = 1; j< patatas; j++ ){
                yardas = 2 * ((vector [i]) + (contador));
                contador +=2;
                vector [i] += yardas;

            }
        }
        System.out.println (vector [0]);
        System.out.println (vector [1]);
        
        
    }
    
}
