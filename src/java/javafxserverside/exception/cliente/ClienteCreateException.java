package javafxserverside.exception.cliente;

/**
 *
 * @author ionut
 */
public class ClienteCreateException extends Exception {

    /**
     * Creates a new instance of <code>ClienteCreateException</code> without
     * detail message.
     */
    public ClienteCreateException() {
    }

    /**
     * Constructs an instance of <code>ClienteCreateException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ClienteCreateException(String msg) {
        super(msg);
    }
}
