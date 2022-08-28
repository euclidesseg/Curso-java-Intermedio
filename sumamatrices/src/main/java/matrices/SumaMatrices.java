
package matrices;


public class SumaMatrices {
    public static void main(String args[]){
    
        int filas = 3;
        int columnas = 3;
        
        
        int matris1 [][] = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int contador = 0;
                contador = (int) (Math.random() *5);
                matris1[i][j] = contador;
                System.out.print("[" +matris1[i][j] +"]");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        
           int matris2 [][] = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int contador = 0;
                contador = (int) (Math.random() *5);
                matris2[i][j] = contador;
                System.out.print("[" +matris2[i][j] +"]");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");
        int matris3 [][] = new int [filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matris3[i][j] = matris1[i][j] * matris2[i][j];
                System.out.print("[" +matris3[i][j] +"]");
            }
            System.out.println();
        }
    }
        
}
