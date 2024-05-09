package com.cesde;

public class Ejercicios {
    
    public String ejercicio1(int num1, int num2) {
       
            if (num1 > num2) {
                return "El número mayor es: " + num1;
            } else if (num2 > num1) {
                return "El número mayor es: " + num2;
            } else {
                return "Los dos números son iguales.";
            }
          

    }
    
    public String ejercicio2(double calificacion) {
       
            if (calificacion < 2.5) {
                return "Lo siento, usted ha reprobado el examen.";
            } else {
                return "¡Felicidades! Usted ha aprobado el examen.";
            }

        
    }

    public double ejercicio3(double precio) {

            if (precio >= 50000) {
                return precio * 0.9; // Aplica un descuento del 10%
            } else {
                return precio; // No se aplica descuento
            }
        
    }
    
    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
                if (tipoFigura == 1) {
                    // Área de un cuadrado: lado * lado
                    double areaCuadrado = ladoCuadrado * ladoCuadrado;
                    return "El área del cuadrado es: " + areaCuadrado;
                } else if (tipoFigura == 2) {
                    // Área de un triángulo: (base * altura) / 2
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    return "El área del triángulo es: " + areaTriangulo;
                } else if (tipoFigura == 3) {
                    // Área de un círculo: pi * radio^2
                    double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
                    return "El área del círculo es: " + areaCirculo;
                } else {
                    return "Tipo de figura no válida.";
                }
            
        
    }
    
    public int ejercicio5(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
    
}
