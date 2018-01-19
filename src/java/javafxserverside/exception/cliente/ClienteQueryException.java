package javafxserverside.exception.cliente;

/**
 *
 * @author ionut
 */
public class ClienteQueryException extends Exception {

    /**
     * Creates a new instance of <code>ClienteQueryException</code> without detail
     * message.
     */
    public ClienteQueryException() {
    }

    /**
     * Constructs an instance of <code>ClienteQueryException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ClienteQueryException(String msg) {
        super(msg);
    }
}
