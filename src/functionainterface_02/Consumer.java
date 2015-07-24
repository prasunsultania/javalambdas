package functionainterface_02;

/**
 * A functional interface is an interface with only 1 method
 * The Annotation is optional, it forces compiler to produce an error if you attempt to write
 * more than one function 
 * @author prasunsultania
 *
 * @param <T>
 */
@java.lang.FunctionalInterface
public interface Consumer<T> {
	public void accept(T t);
}
