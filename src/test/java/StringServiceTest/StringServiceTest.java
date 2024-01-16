package StringServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringServiceTest {

    @DisplayName("Isogram: no repeated characters.")
    @Test
    public void testCheckForIsogram() {
        StringService stringServicesJavaObject = new StringService();
        assertEquals(false, stringServicesJavaObject.checkIsogram("GeekForGeek"));
        assertEquals(true, stringServicesJavaObject.checkIsogram("algorithm"));
        assertEquals(false, stringServicesJavaObject.checkIsogram("datastructures"));
        assertEquals(false, stringServicesJavaObject.checkIsogram("machinelearning"));
        assertEquals(true, stringServicesJavaObject.checkIsogram("importance"));
    }

    @DisplayName("Panagram: every letter of the alphabet at least once.")
    @Test
    public void testCheckForPanagram() {
        StringService stringServicesJavaObject = new StringService();
        assertEquals(true, stringServicesJavaObject.checkPanagram("AbCDefGhIJklmnoPQRStuvWXyZ234"));
        assertEquals(true, stringServicesJavaObject.checkPanagram("Pack my box with five dozen liquor jugs"));
        assertEquals(true, stringServicesJavaObject.checkPanagram("Waltz, bad nymph, for quick jigs vex"));
        assertEquals(false, stringServicesJavaObject.checkPanagram("machinelearning"));
    }

    @DisplayName("Anagram: they have the same characters but in a different order")
    @Test
    public void testCheckForAnagram() {
        StringService stringServicesJavaObject = new StringService();
        assertEquals(true, stringServicesJavaObject.checkAnagram("Listen","silent"));
        assertEquals(false, stringServicesJavaObject.checkAnagram("geeksforgeeks","geeks"));
        assertEquals(true, stringServicesJavaObject.checkAnagram("a gentleman", "elegant man"));
        assertEquals(true, stringServicesJavaObject.checkAnagram("geeksforgeeks","forgeeksgeeks"));
        assertEquals(true, stringServicesJavaObject.checkAnagram("angel","glean"));
    }

}


