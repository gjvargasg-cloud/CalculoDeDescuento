
package com.mycompany.calculodedescuento;

public class CalculoDeDescuento {

    // Función para calcular el descuento con porcentaje predeterminado (10%)
    public static double calcular_descuento(double montoTotal) {
        return calcular_descuento(montoTotal, 10); // llama a la otra función con 10% por defecto
    }

    // Función sobrecargada para calcular el descuento con porcentaje específico
    public static double calcular_descuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100); // retorna solo el valor del descuento
    }

    public static void main(String[] args) {
        // Primera llamada: solo monto total (usa descuento por defecto 10%)
        double monto1 = 200.0;
        double descuento1 = calcular_descuento(monto1);
        double totalPagar1 = monto1 - descuento1;

        System.out.println("Compra 1:");
        System.out.println("Monto total: $" + monto1);
        System.out.println("Descuento aplicado: $" + descuento1);
        System.out.println("Monto final a pagar: $" + totalPagar1);
        System.out.println("--------------------------------");

        // Segunda llamada: monto total + porcentaje específico (ejemplo 15%)
        double monto2 = 500.0;
        double descuento2 = calcular_descuento(monto2, 15);
        double totalPagar2 = monto2 - descuento2;

        System.out.println("Compra 2:");
        System.out.println("Monto total: $" + monto2);
        System.out.println("Descuento aplicado: $" + descuento2);
        System.out.println("Monto final a pagar: $" + totalPagar2);
    }
}
