package javafxserverside.exception.cliente;

/**
 *
 * @author ionut
 */
public class ClienteUpdateException extends Exception {

    /**
     * Creates a new instance of <code>ClienteUpdateException</code> without
     * detail message.
     */
    public ClienteUpdateException() {
    }

    /**
     * Constructs an instance of <code>ClienteUpdateException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ClienteUpdateException(String msg) {
        super(msg);
    }
}
