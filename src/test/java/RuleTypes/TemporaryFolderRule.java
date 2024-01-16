package RuleTypes;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TemporaryFolderRule {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testUsingTemporaryFolder() throws IOException {
        File file = temporaryFolder.newFile("testFile.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello, TemporaryFolder!");
        }
        assertTrue(file.exists());
    }
}