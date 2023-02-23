/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosVecinos;
import java.util.*;

/**
 *
 * @author enriq
 */
public class numerosVecinos {
     public static void main(String[] args) {
         int filas,columnas,numero,casos;
         int [] [] matriz;
         Scanner teclado = new Scanner (System.in);
         System.out.println("Dime el número de casos");
         casos = teclado.nextInt();
         teclado.nextLine();
         for (int i = 0; i<casos; i++){
            System.out.println ("Dime el número de filas");
            filas = teclado.nextInt();
            teclado.nextLine();
            System.out.println ("Dime el número de columnas");
            columnas = teclado.nextInt();
            teclado.nextLine();   
            matriz = crearMatriz (filas,columnas);

            System.out.println ("Dime el número del que quieres buscar los vecinos");
            numero = teclado.nextInt();
            teclado.nextLine();
            encontrarVecinos(matriz,numero);
         }      
     }
    public static int [] [] crearMatriz (int filas, int columnas) {
        int matriz [] [] = new int [filas] [columnas];
        
        for (int i = 0; i < filas; i++){
            for (int j = 0; j< columnas;j++){
                matriz [i] [j] = (int)(Math.random()*10);
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println ();
        }
        return matriz;
        
}
    public static void encontrarVecinos (int[][] matriz,int numero){
        HashSet <Integer> contenido = new HashSet<Integer>();
        for (int i = 0; i < matriz.length;i++){
            for (int j =0; j < matriz[i].length; j++){
                if (numero == matriz[i][j]){
                    if (i == 0 && j== 0){
                        contenido.add(matriz[i][j+1]);
                        contenido.add(matriz[i+1][j+1]);
                        contenido.add(matriz[i+1][j]);                        
                    }
                    else if (i == 0 && j== matriz[i].length-1){
                        contenido.add(matriz[i][j-1]);
                        contenido.add(matriz[i+1][j-1]);
                        contenido.add(matriz[i+1][j]);                        
                    }
                    else if (i == matriz.length-1 && j== 0){
                        contenido.add(matriz[i][j+1]);
                        contenido.add(matriz[i-1][j+1]);
                        contenido.add(matriz[i-1][j]);                        
                    }       
                    else if (i == matriz.length-1 && j==matriz[i].length-1 ){
                        contenido.add(matriz[i][j-1]);
                        contenido.add(matriz[i-1][j-1]);
                        contenido.add(matriz[i-1][j]);                        
                    }
                    else if (j == 0){
                        contenido.add(matriz[i-1][j]);
                        contenido.add(matriz[i-1][j+1]);
                        contenido.add(matriz[i][j+1]);
                        contenido.add(matriz[i+1][j+1]);
                        contenido.add(matriz[i+1][j]);                        
                    }
                    else if (j == matriz[i].length-1){
                        contenido.add(matriz[i-1][j]);
                        contenido.add(matriz[i-1][j-1]);
                        contenido.add(matriz[i][j-1]);
                        contenido.add(matriz[i+1][j-1]);
                        contenido.add(matriz[i+1][j]);                      
                }
                    else if (i == 0){
                        contenido.add(matriz[i][j-1]);
                        contenido.add(matriz[i+1][j-1]);
                        contenido.add(matriz[i+1][j]);
                        contenido.add(matriz[i+1][j+1]);
                        contenido.add(matriz[i][j+1]);                        
                    }
                    else if (i == matriz.length-1){
                        contenido.add(matriz[i][j-1]);
                        contenido.add(matriz[i-1][j-1]);
                        contenido.add(matriz[i-1][j]);
                        contenido.add(matriz[i-1][j+1]);
                        contenido.add(matriz[i][j+1]);                      
                }
                    else{
                        contenido.add(matriz[i-1][j-1]);
                        contenido.add(matriz[i-1][j]);
                        contenido.add(matriz[i-1][j+1]);
                        contenido.add(matriz[i][j+1]);
                        contenido.add(matriz[i+1][j+1]);
                        contenido.add(matriz[i+1][j]);
                        contenido.add(matriz[i+1][j-1]);
                        contenido.add(matriz[i][j-1]);                        
                    }
            }
        }
    }
        mostrarHashSet (contenido);
}
    public static void mostrarHashSet (HashSet <Integer> contenido){
        if (contenido.isEmpty()){
            System.out.println ("NO ENCONTRADO");
        }
        else{
            List<Integer>lista = new ArrayList<Integer>(contenido);
            Collections.sort(lista);
            System.out.println (lista);           
         }
    }
}