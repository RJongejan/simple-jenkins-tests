import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Created by ruben on 28-5-2016.
 */
public class readerTest {
    @Test
    public void test() throws IOException {
        Files.lines(Paths.get("inputfile.txt")).forEach(System.out::println);
    }

}