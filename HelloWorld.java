/**
 * The HelloWorld program implements an application that
 * simply displays "Hello I am Layla!" to the standard output.
 *
 * @author Layla michel
 * @version 1.0
 * @since 2022-02-16
 */
final class HelloWorld {
    /**
    * Creating private constructor due to public/default constructor error.
    *
    * @throws IllegalStateException if there is an issue
    */
    private HelloWorld() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Creating main function.
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        system.out.println("Hello I am Layla!");
    }
}
