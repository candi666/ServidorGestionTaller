package javafxserverside.exception.cliente;

/**
 *
 * @author ionut
 */
public class ClienteDeleteException extends Exception {

    /**
     * Creates a new instance of <code>ClienteDeleteException</code> without
     * detail message.
     */
    public ClienteDeleteException() {
    }

    /**
     * Constructs an instance of <code>ClienteDeleteException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ClienteDeleteException(String msg) {
        super(msg);
    }
}
