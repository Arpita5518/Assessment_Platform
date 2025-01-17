package com.nucleusteq.asessmentPlatform.service;

import com.nucleusteq.asessmentPlatform.dto.UserDto;
import com.nucleusteq.asessmentPlatform.entities.LoginRequest;
import java.util.List;
import java.util.Map;

/**
 * The UserService interface defines methods for managing user-related.
 * operations.
 */
public interface UserService {

    /**
     * Registers a new user.
     *
     * @param user The UserDto object representing the user to be registered.
     * @return A message indicating the result of the registration operation.
     */
    String registerUser(UserDto user);

    /**
     * Retrieves a list of all users.
     *
     * @return A list of UserDto objects representing all users.
     */
    List<UserDto> getAllUsers();

    /**
     * Logs in a user.
     *
     * @param loginRequest The LoginRequest object containing user login.
     *                     credentials.
     * @return A map containing the login response, including authentication.
     *         status and token.
     */
    Map<String, String> loginUser(LoginRequest loginRequest);

    /**
     * Deletes a user by their ID.
     *
     * @param id The ID of the user to delete.
     * @return A message indicating the result of the deletion operation.
     */
    String deleteUser(int id);
}
