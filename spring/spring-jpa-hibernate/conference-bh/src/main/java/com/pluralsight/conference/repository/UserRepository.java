package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// If we do not need to add our own functionality, then we can make use
// of JpaRepository methods and can delete the UserRepositoryImpl
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
