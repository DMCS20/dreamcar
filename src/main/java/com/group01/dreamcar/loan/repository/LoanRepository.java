package com.group01.dreamcar.loan.repository;

import com.group01.dreamcar.loan.model.Loan;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface LoanRepository extends MongoRepository<Loan, ObjectId> {
    List<Loan> findAll();
    Optional<Loan> findById(ObjectId id);
    List<Loan> findByIdUsuario(ObjectId idUsuario);
    Optional<Loan> findByIdUsuarioAndId(ObjectId idUsuario, ObjectId id);

    boolean existsById(ObjectId id);
}
