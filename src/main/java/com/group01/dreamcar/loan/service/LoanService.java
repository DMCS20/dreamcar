package com.group01.dreamcar.loan.service;

import com.group01.dreamcar.loan.dto.LoanRequestDTO;
import com.group01.dreamcar.loan.dto.LoanResponseDTO;
import org.bson.types.ObjectId;

import java.util.List;

public interface LoanService {
    LoanResponseDTO getLoanById(ObjectId id);
    List<LoanResponseDTO> getAllLoans();
    List<LoanResponseDTO> getLoansByUserId(ObjectId userId);
    LoanResponseDTO getLoanByUserIdAndLoanId(ObjectId userId, ObjectId loanId);
    LoanResponseDTO createLoan(ObjectId userId, LoanRequestDTO loanRequest);
}
