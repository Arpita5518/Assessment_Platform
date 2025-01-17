package com.nucleusteq.asessmentPlatform.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    User user;

    @BeforeEach
    void init() {
        user = new User();
    }

    @Test
    void testAllGettersSetters() {
        assertEquals(0, user.getUserId());
        assertEquals(null, user.getFirstName());
        assertEquals(null, user.getLastName());
        assertEquals(null, user.getEmail());
        assertEquals(null, user.getPassword());
        assertEquals(null, user.getPhoneNumber());
        assertEquals(null, user.getRole());

        user.setUserId(45);
        user.setFirstName("Arpita");
        user.setLastName("Sahu");
        user.setEmail("arpita@nucleusteq.com");
        user.setPassword("1234567");
        user.setPhoneNumber("9369790286");
        user.setRole("user");

        assertEquals(45, user.getUserId());
        assertEquals("Arpita", user.getFirstName());
        assertEquals("Sahu", user.getLastName());
        assertEquals("arpita@nucleusteq.com", user.getEmail());
        assertEquals("1234567", user.getPassword());
        assertEquals("9369790286", user.getPhoneNumber());
        assertEquals("user", user.getRole());
    }

    @Test
    void testDefaultConstructor() {
        User user = new User();
        assertEquals(0, user.getUserId());
        assertEquals(null, user.getFirstName());
        assertEquals(null, user.getLastName());
        assertEquals(null, user.getEmail());
        assertEquals(null, user.getPassword());
        assertEquals(null, user.getPhoneNumber());
        assertEquals(null, user.getRole());
    }

    @Test
    void testParametrizedConstructor() {
        User user = new User(45, "Arpita", "Sahu", "arpita@nucleusteq.com",
                "1234567", "9369790286", "user");
        assertEquals(45, user.getUserId());
        assertEquals("Arpita", user.getFirstName());
        assertEquals("Sahu", user.getLastName());
        assertEquals("arpita@nucleusteq.com", user.getEmail());
        assertEquals("1234567", user.getPassword());
        assertEquals("9369790286", user.getPhoneNumber());
        assertEquals("user", user.getRole());
    }
}
