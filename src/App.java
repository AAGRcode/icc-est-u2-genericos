import models.Caja;
import models.Par;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== PRACTICA DE CLASES GENERICAS ===");

        System.out.println("--- Uso de Caja<T> ---");
        Caja<String> caja1 = new Caja<>("Hola Mundo");
        System.out.println("Caja de texto: " + caja1.getContenido());
        Caja<Integer> caja2 = new Caja<>(100);
        System.out.println("Caja de entero: " + caja2.getContenido());
        Caja<Double> caja3 = new Caja<>(10.5);
        System.out.println("Caja de decimal: " +caja3.getContenido());
        System.out.println("La caja esta vacia? " + caja1.estaVacia());
        System.out.println();
        
        System.out.println("--- Uso de Par<K, V> ---");
        Par<String, Integer> par1 = new Par<>("Edad", 30);
        System.out.println("Clave: " + par1.getClave() + " | Valor: " + par1.getValor());
        Par<Integer, String> par2 = new Par<>(1,"Axel");
        System.out.println("Clave: " + par2.getClave() + " | Valor: " + par2.getValor());
        Par<String, Double> par3 = new Par<>("Promedio", 9.5);
        System.out.println("Clave: " + par3.getClave() + " | Valor: " + par3.getValor());
    }
}
