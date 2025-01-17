package com.nucleusteq.asessmentPlatform.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nucleusteq.asessmentPlatform.entities.User;

/**
 * Repository interface for accessing and managing user data in the database.
 */
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    /**
     * Retrieves an optional User object based on the provided email.
     *
     * @param email The email address used to search for a user.
     * @return An Optional containing the User object if found, or an empty
     *         Optional if not found.
     */
    Optional<User> findByEmail(String email);
}
