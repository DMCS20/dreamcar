package com.group01.dreamcar.user.repository;

import com.group01.dreamcar.user.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    List<User> findAll();
    Optional<User> findById(ObjectId id);
    Optional<User> findByEmail(String email);

    boolean existsById(ObjectId id);
    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email, String password);
}
