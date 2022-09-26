import vehiculos.coche;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sumar(15,10,5);
        coche miCoche = new coche();
        miCoche.aumentaPuertas(1);
    }

    public static void sumar(float n1, float n2, float n3){
        float suma = n1 + n2 + n3;
        System.out.println("La suma es: " + suma);
    }    
}

