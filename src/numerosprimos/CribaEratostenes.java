/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. 
 * 
 * Como algoritmo se utiliza la criba de Eratóstenes: Dado un 
 * vector de enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación, se encuentra el siguiente
 * entero no tachado y se tachan todos sus múltiplos. El 
 * proceso se repite hasta que se pasa de la raíz cuadrada
 * del valor máximo. Todos los números que queden sin 
 * tachar son números primos.
 */ 

package numerosprimos;    
    
public class CribaEratostenes 
{ 
 /** 
 * Generar números primos de 1 a max
 * @param max es el valor máximo
 * @return Vector de números primos
 */
 public static int[] generarPrimos (int max) 
 { 
    int num,multiplo; 
 
    if (max >= 2) { 
        // Declaraciones
        int tamaño = max + 1; // Tamaño del array 
        boolean[] esPrimo = new boolean[tamaño]; 
 
        // Inicializar el array
        for (num=2; num<tamaño; num++){
            esPrimo[num] = true; 
        }

        // Criba
        for (num=2; num<Math.sqrt(tamaño)+1; num++){ 
            if (esPrimo[num]){
                // Eliminar los múltiplos de num
                for (multiplo=2*num; multiplo<tamaño; multiplo+=num){
                    esPrimo[multiplo] = false; 
                }
            } 
        }
 
        // ¿Cuántos primos hay? 
        int cuenta = 0; 
        for (num=2; num<tamaño; num++){ 
            if (esPrimo[num]){ 
                cuenta++; 
            }
        } 
        
        // Rellenar el vector de números primos
        int[] primos = new int[cuenta]; 
        for (num=2, multiplo=0; num<tamaño; num++){ 
            if (esPrimo[num]){
                primos[multiplo++] = num; 
            }
        } 
        
        return primos; 
        
    }else{ // max < 2 
        return new int[0]; // Vector vacío
    } 
 }
}







