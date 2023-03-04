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
    int i,j; 
 
    if (max >= 2) { 
        // Declaraciones
        int dim = max + 1; // Tamaño del array 
        boolean[] esPrimo = new boolean[dim]; 
 
        // Inicializar el array
        for (i=2; i<dim; i++){
        esPrimo[i] = true; 
        }

        // Criba
        for (i=2; i<Math.sqrt(dim)+1; i++){ 
            if (esPrimo[i]){
                // Eliminar los múltiplos de i
                for (j=2*i; j<dim; j+=i){
                    esPrimo[j] = false; 
                }
            } 
        }
 
        // ¿Cuántos primos hay? 
        int cuenta = 0; 
        for (i=2; i<dim; i++){ 
            if (esPrimo[i]){ 
                cuenta++; 
            }
        } 
        
        // Rellenar el vector de números primos
        int[] primos = new int[cuenta]; 
        for (i=2, j=0; i<dim; i++){ 
            if (esPrimo[i]){
                primos[j++] = i; 
            }
        } 
        
        return primos; 
        
    }else{ // max < 2 
        return new int[0]; // Vector vacío
    } 
 }
}







