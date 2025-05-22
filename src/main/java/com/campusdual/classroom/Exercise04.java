package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número: " + factorial(7));
        System.out.println("Obtén el factorial del número 7 → (7!) recursivo: " + recursiveFactorial(7));

    }

// Ejemplo de suma de números
    public static int sumNum(int num) {
       int suma = 0;
        for (int i = 1; i<=num; i++){
            suma += i;
        }
        return suma;
    }
// Ejemplo de suma de números pares
    public static int sumEvenNum(int num) {
        int suma = 0;
        for (int i = 1; i<=num; i++){
                suma += i * 2;
        }
        return suma;
    }

// factorial de un número
    public static int factorial(int num) {
        int resul = 1;
        for (int i = num; i>0; i--){
            resul = resul * i;
        }
        return resul;
    }

// Ejemplo de factorial de un número recursivo
    public static int recursiveFactorial(int num) {
        return factorial(num);
    }
}
