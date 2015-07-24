package returnlambdas_03;

/**
 * Lambda type declaration
 * @author prasunsultania
 *
 */
@FunctionalInterface
public interface PasswordEncoder {
	public String encode(String password, String salt);
}
