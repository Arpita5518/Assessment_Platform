package com.nucleusteq.asessmentPlatform.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserDtoTest {

    UserDto userDto;

    @BeforeEach
    void init() {
        userDto = new UserDto();
    }

    @Test
    void testAllGettersSetters() {
        assertEquals(0, userDto.getUserId());
        assertEquals(null, userDto.getFirstName());
        assertEquals(null, userDto.getLastName());
        assertEquals(null, userDto.getEmail());
        assertEquals(null, userDto.getPassword());
        assertEquals(null, userDto.getPhoneNumber());
        assertEquals(null, userDto.getRole());

        userDto.setUserId(45);
        userDto.setFirstName("Arpita");
        userDto.setLastName("Sahu");
        userDto.setEmail("arpita@nucleusteq.com");
        userDto.setPassword("1234567");
        userDto.setPhoneNumber("9369790286");
        userDto.setRole("user");

        assertEquals(45, userDto.getUserId());
        assertEquals("Arpita", userDto.getFirstName());
        assertEquals("Sahu", userDto.getLastName());
        assertEquals("arpita@nucleusteq.com", userDto.getEmail());
        assertEquals("1234567", userDto.getPassword());
        assertEquals("9369790286", userDto.getPhoneNumber());
        assertEquals("user", userDto.getRole());
    }

    @Test
    void testDefaultConstructor() {
        UserDto userDto = new UserDto();
        assertEquals(0, userDto.getUserId());
        assertEquals(null, userDto.getFirstName());
        assertEquals(null, userDto.getLastName());
        assertEquals(null, userDto.getEmail());
        assertEquals(null, userDto.getPassword());
        assertEquals(null, userDto.getPhoneNumber());
        assertEquals(null, userDto.getRole());
    }

    @Test
    void testParametrizedConstructor() {
        UserDto userDto = new UserDto(45, "Arpita", "Sahu",
                "arpita@nucleusteq.com", "1234567", "9369790286", "user");
        assertEquals(45, userDto.getUserId());
        assertEquals("Arpita", userDto.getFirstName());
        assertEquals("Sahu", userDto.getLastName());
        assertEquals("arpita@nucleusteq.com", userDto.getEmail());
        assertEquals("1234567", userDto.getPassword());
        assertEquals("9369790286", userDto.getPhoneNumber());
        assertEquals("user", userDto.getRole());
    }
}
