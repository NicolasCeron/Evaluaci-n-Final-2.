
package EvaluacionFinal;

/**
 *
 * @author LENOVO
 */
class PrecioMaximoExcedidoException extends Exception {

    private String PRECIO_MAXIMO;
    
        // Constructor con mensaje de error
        public PrecioMaximoExcedidoException(String mensaje) {
            super(mensaje);
        }

        // Método para obtener el mensaje de error
        @Override
        public String getMessage() {
            return "Error: El precio del traje supera el máximo permitido (" + PRECIO_MAXIMO + ").";
        }
    
}
