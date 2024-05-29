
package EvaluacionFinal;

import java.util.ArrayList;
import java.util.Map;

public class Ev3Prueba {
    public static void main(String[] args) {
    
    FabricadeTrajes fabrica = new FabricadeTrajes();
        fabrica.MostrarPrendasPantalonFalda();  //Muestra Cantidad de pantalones y de trajes que hay en almacen

        Traje traje = new Traje();
    // ... (asignar componentes al traje)

    double precioTotal = traje.calcularPrecioTotal();
    System.out.println("Precio total del traje: " + precioTotal);
    
    
        ArrayList<Componente> componentesTraje1 = new ArrayList<>();
        Blusa blusa1 = new Blusa(1, "Blusa roja", "M", "Rojo", false, 2000, true);
        Pantalon pantalon1 = new Pantalon(2, "Pantalon negro", "S", "Negro", false, 1500, true);
      
        Traje traje1 = new Traje(componentesTraje1, "Traje casual");
    
        // Descuento del 30% para las blusas
        fabrica.activarDesactivarRebajas("Blusa", -0.3);

        // Aumento del 10% para los pantalones
        fabrica.activarDesactivarRebajas("Pantalon", 0.1);
        FabricadeTrajes fabrica2 = new FabricadeTrajes();
        Map<String, Double> valorPorSubclase = fabrica.obtValorPorSubclaseComponente();

        System.out.println("Valor total de blusas: " + valorPorSubclase.get("Blusa"));
        System.out.println("Valor total de chaquetas: " + valorPorSubclase.get("Chaqueta"));
        System.out.println("Valor total de pantalones: " + valorPorSubclase.get("Pantalon"));
        System.out.println("Valor total de faldas: " + valorPorSubclase.get("Falda"));

        FabricadeTrajes fabrica3 = new FabricadeTrajes();
        double valorAcumuladoTrajes = fabrica.obtenerValorAcumuladoTrajes();

        System.out.println("Valor total acumulado de trajes: " + valorAcumuladoTrajes);
    }
}


