package com.group01.dreamcar.loan.controller;

import com.group01.dreamcar.loan.dto.LoanRequestDTO;
import com.group01.dreamcar.loan.dto.LoanResponseDTO;
import com.group01.dreamcar.loan.mapper.LoanMapper;
import com.group01.dreamcar.loan.repository.LoanRepository;
import com.group01.dreamcar.loan.service.LoanService;
import com.group01.dreamcar.shared.exceptions.ResourceNotFoundException;
import com.group01.dreamcar.shared.exceptions.ValidationException;
import com.group01.dreamcar.shared.formulas.CalculadoraGrilla;
import com.group01.dreamcar.shared.formulas.DatosEntrada;
import com.group01.dreamcar.shared.formulas.DatosSalida;
import io.swagger.v3.oas.annotations.Operation;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.group01.dreamcar.loan.model.Loan;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LoanController {
    @Autowired
    private LoanService loanService;
    @Autowired
    private LoanRepository loanRepository;
    @Autowired
    private LoanMapper loanMapper;

    @Operation(summary = "Obtiene todos los prestamos")
    @Transactional(readOnly = true)
    @GetMapping("/loans")
    public ResponseEntity<List<LoanResponseDTO>> getLoans(){
        return new ResponseEntity<>(loanService.getAllLoans(), HttpStatus.OK);
    }

    @Operation(summary = "Obtiene un prestamo por id")
    @Transactional(readOnly = true)
    @GetMapping("/loans/{id}")
    public ResponseEntity<LoanResponseDTO> getLoanById(@PathVariable String id){
        ObjectId oid = new ObjectId(id);
        return new ResponseEntity<>(loanService.getLoanById(oid), HttpStatus.OK);
    }

    @Operation(summary = "Obtiene todos los prestamos de un usuario dada su ID (userId)")
    @Transactional(readOnly = true)
    @GetMapping("/users/{userId}/loans")
    public ResponseEntity<List<LoanResponseDTO>> getLoansByUserId(@PathVariable String userId){
        ObjectId oid = new ObjectId(userId);
        return new ResponseEntity<>(loanService.getLoansByUserId(oid), HttpStatus.OK);
    }

    @Operation(summary = "Obtiene un prestamo de un usuario dada su ID (userId) y el ID del prestamo deseado(loanId)")
    @Transactional(readOnly = true)
    @GetMapping("/users/{userId}/loans/{loanId}")
    public ResponseEntity<LoanResponseDTO> getLoanByUserIdAndLoanId(@PathVariable String userId, @PathVariable String loanId){
        ObjectId oidUserId = new ObjectId(userId);
        ObjectId oidLoanId = new ObjectId(loanId);
        return new ResponseEntity<>(loanService.getLoanByUserIdAndLoanId(oidUserId, oidLoanId), HttpStatus.OK);
    }

    @Operation(summary = "Crea un prestamo para un usuario dado su ID (userId)")
    @Transactional
    @PostMapping("/users/{userId}/loans")
    public ResponseEntity<LoanResponseDTO> createLoan(@PathVariable String userId, @RequestBody LoanRequestDTO loanRequest){
        ObjectId oid = new ObjectId(userId);
        return new ResponseEntity<>(loanService.createLoan(oid, loanRequest), HttpStatus.CREATED);
    }

    @Transactional(readOnly = true)
    @GetMapping("/loans/{id}/details")
    public ResponseEntity<List<DatosSalida>> getLoanDetails(@PathVariable String id){
        ObjectId oid = new ObjectId(id);
        Optional<Loan> loan = loanRepository.findById(oid);
        if(loan.isEmpty()){
            throw new ResourceNotFoundException("Loan ID not found");
        }

        DatosEntrada datosEntrada = loanMapper.toDatosEntrada(loan.get());

        return new ResponseEntity<>(CalculadoraGrilla.calculadora(datosEntrada), HttpStatus.OK);
    }
}
