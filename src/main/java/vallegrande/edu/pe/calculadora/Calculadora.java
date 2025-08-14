package vallegrande.edu.pe.calculadora;

public class Calculadora {

    public int sumar(int a, int b) {
        System.out.println("Método sumar()");
        int resultado = a + b;
        System.out.println("Resultado de sumar: " + resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        System.out.println("Método restar()");
        int resultado = a - b;
        System.out.println("Resultado de restar " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    public int multiplicar(int a, int b) {
        System.out.println("Método multiplicar()");
        int resultado = a * b;
        System.out.println("Resultado de multiplicar " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    public int dividir(int a, int b) {
        System.out.println("Método dividir()");
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        int resultado = a / b;
        System.out.println("Resultado de dividir: " + resultado);
        return resultado;
    }

    public double porcentaje(int parte, int total) {
        System.out.println("Método porcentaje()");
        if (total == 0) {
            throw new ArithmeticException("No se puede calcular porcentaje con total = 0");
        }
        double resultado = (parte * 100.0) / total;
        System.out.println("Resultado del porcentaje de " + parte + " sobre " + total + " = " + resultado + "%");
        return resultado;
    }

    public double raizCuadrada(double x) {
        System.out.println("Método raizCuadrada()");
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        double resultado = Math.sqrt(x);
        System.out.println("Resultado de raíz cuadrada: " + resultado);
        return resultado;
    }
}
