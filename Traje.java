
package EvaluacionFinal;

import java.util.ArrayList;

public class Traje implements Comparable<Traje>{
    ArrayList<Componente> piezas;
    String nombre;
    
    //Se crea constructor para realizacion de prueba
    public Traje(ArrayList<Componente> piezas, String nombre) {
    this.piezas = piezas;
    this.nombre = nombre;
    this.precio = calcularPrecioTraje(); // Se calcula y asigna el precio del traje
}
    // Atributo para almacenar el precio del traje
    private double precio;
    //se crea getter y setter de precio
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
// Variable para el porcentaje del precio de los componentes
    private static final double PORCENTAJE_COMPONENTE = 0.8; // Valor entre 0.7 y 0.9
    
//variable para precio maximo del traje
    private static final double PRECIO_MAXIMO = 500.0; // Valor máximo del precio

    public Traje() {
    }

    public ArrayList<Componente> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Componente> piezas) {
        this.piezas = piezas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private double calcularPrecioTraje() {
    double precioComponentes = 0;

    for (Componente componente : piezas) {
        precioComponentes += componente.getPrecio();
    }

    return precioComponentes * PORCENTAJE_COMPONENTE;
}
    
    //
    public double calcularPrecioTotal() {
         if (piezas == null) {
        return 0.0; //  throw exception
         }
        double precioComponentes = 0;

        for (Componente componente : piezas) {
            precioComponentes += componente.getPrecio();
        }
        return precioComponentes * PORCENTAJE_COMPONENTE;
    }
//    
    private double calcularPrecioDeTraje() throws PrecioMaximoExcedidoException {
        double precioComponentes = 0;

        for (Componente componente : piezas) {
            precioComponentes += componente.getPrecio();
        }

        double precioFinal = precioComponentes * PORCENTAJE_COMPONENTE;

        if (precioFinal > PRECIO_MAXIMO) {
            throw new PrecioMaximoExcedidoException("El precio del traje supera el máximo permitido");
        }

        return precioFinal;
    }
    
    //to string
    @Override
    public String toString() {
        return "Traje{" + 
                "piezas=" + piezas + 
                ", nombre=" + nombre + 
                ", precioTotal=" + calcularPrecioTotal() +
                '}';
    }

    @Override
    public int compareTo(Traje traje) {
        return nombre.compareTo(traje.getNombre());
    }
}
