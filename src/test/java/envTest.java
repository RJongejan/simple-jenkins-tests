import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by ruben on 28-5-2016.
 */
public class envTest {
    @Test
    public void test() throws IOException {
        String username = System.getenv("Username");
        String password = System.getenv("Password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

}