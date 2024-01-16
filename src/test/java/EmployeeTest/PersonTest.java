package EmployeeTest;
import org.junit.Test;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PersonTest {


    public static Person person;
    public static Address address;


    public static Address address1;
    public static Address address2;
    public static Person person1;
    public static Person person2;
    public static Person person3;

    @Test
    public void createInstancesForTest() {
        address = new Address("123 Main St", "Cityville", "12345");
        person = new Person("John", "Doe", 30, address);

        address1 = new Address("123 Main St", "Cityville", "12345");
        address2 = new Address("456 Oak St", "Townsville", "67890");

        person1 = new Person("John", "Doe", 30, address1);
        person2 = new Person("John", "Doe", 30, address1);
        person3 = new Person("Jane", "Smith", 25, address2);

    }

    @Test
    public void testPersonGetters() {

        // Test getters in the Person class
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(30, person.getAge());

        // Test getters in the Address class
        assertEquals("123 Main St", person.getAddress().getStreet());
        assertEquals("Cityville", person.getAddress().getCity());
        assertEquals("12345", person.getAddress().getZipCode());
    }

    @Test
    public void testEquality() {

        assertEquals(person1, person2);
        assertNotEquals(person1, person3);

        assertEquals(address1, person2.getAddress());
        assertNotEquals(address1, person3.getAddress());
    }

    @Test
    public void testNullHandling() {
        Person person = new Person("John", "Doe", 30, null);

        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(30, person.getAge());
        assertNull(person.getAddress());
        Person anotherPerson = new Person("John", "Doe", 30, null);
        assertEquals(person, anotherPerson);
    }


}
