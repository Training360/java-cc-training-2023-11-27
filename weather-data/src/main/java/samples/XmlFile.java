package samples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class XmlFile {

    public void readFile(Path path) {
        try {
            parseFile(path);
        }
        catch (IOException ioe) {
            int result = 10;
            throw new IllegalStateException("Result: " + result + " " + ioe.getMessage());
        }
    }

    private void parseFile(Path path) throws IOException {
        // Ha túl hosszú a fájl, el fog fogyni a memória
        List<String> lines = Files.readAllLines(path);
        for (String line: lines) {
            var trimmed = line.trim();
        }
    }
}
