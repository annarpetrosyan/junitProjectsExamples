package RuleTypes;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

import java.io.*;

import static org.junit.Assert.assertTrue;

public class ExternalResourceRule {

    @Rule
    public ExternalResource externalResource = new ExternalResource() {
        private String filePath;

        @Override
        protected void before() throws Throwable {
            filePath = "tempFile.txt";
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write("Initial content");
            }
        }

        @Override
        protected void after() {
            new File(filePath).delete();
        }
    };

    @Test
    public void testUsingExternalResource() throws IOException {
        String content;
        try (BufferedReader reader = new BufferedReader(new FileReader("tempFile.txt"))) {
            content = reader.readLine();
        }
        assertTrue(content.equals("Initial content"));
        assertTrue(!new File("tempFile.txt").exists());
    }
}