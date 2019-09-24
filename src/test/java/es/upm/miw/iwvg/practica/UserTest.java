package es.upm.miw.iwvg.practica;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Carlos", "Castro");
    }

    @Test
    void testFullName() {
        assertEquals("Carlos Castro", user.fullName());
        assertNotEquals("Antonio Alvarez", user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("C.", user.initials());
        assertNotEquals("Carlos", user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, user.getNumber());
        assertNotEquals(5, user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Carlos", user.getName());
        assertNotEquals("Antonio", user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Castro", user.getFamilyName());
        assertNotEquals("Alvarez", user.getFamilyName());
    }

    @Test
    void testFormat() {
        user = new User(1, "carlos", "castro");
        assertEquals("Carlos Castro", user.fullName());
        assertNotEquals("carlos castro", user.fullName());
        assertEquals("Carlos", user.getName());
        assertNotEquals("carlos", user.getName());
        assertEquals("C.", user.initials());
        assertNotEquals("c.", user.initials());

    }

    @Test
    void testGetUpperCaseName() {
        assertEquals("CARLOS", user.getUpperCaseName());
        assertNotEquals("carlos", user.getUpperCaseName());
    }

}
