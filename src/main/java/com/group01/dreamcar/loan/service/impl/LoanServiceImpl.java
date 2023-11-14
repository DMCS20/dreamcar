package com.group01.dreamcar.loan.service.impl;

import com.group01.dreamcar.loan.dto.LoanRequestDTO;
import com.group01.dreamcar.loan.dto.LoanResponseDTO;
import com.group01.dreamcar.loan.mapper.LoanMapper;
import com.group01.dreamcar.loan.model.Loan;
import com.group01.dreamcar.loan.repository.LoanRepository;
import com.group01.dreamcar.loan.service.LoanService;
import com.group01.dreamcar.shared.exceptions.ResourceNotFoundException;
import com.group01.dreamcar.user.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private LoanMapper loanMapper;

    @Autowired
    private UserRepository userRepository;
    @Override
    public LoanResponseDTO getLoanById(ObjectId id) {
        Optional<Loan> loanOptional = loanRepository.findById(id);
        if(loanOptional.isEmpty()){
            throw new ResourceNotFoundException("Loan not found");
        }
        return loanMapper.toLoanResponseDTO(loanOptional.get());
    }

    @Override
    public List<LoanResponseDTO> getAllLoans() {
        List<Loan> loans = loanRepository.findAll();
        return loanMapper.toLoanResponseDTOList(loans);
    }

    @Override
    public List<LoanResponseDTO> getLoansByUserId(ObjectId userId){
        if(!userRepository.existsById(userId)){
            throw new ResourceNotFoundException("User not found");
        }
        List<Loan> loans = loanRepository.findByIdUsuario(userId);
        return loanMapper.toLoanResponseDTOList(loans);
    }

    public LoanResponseDTO getLoanByUserIdAndLoanId(ObjectId userId, ObjectId loanId){
        if(!userRepository.existsById(userId)){
            throw new ResourceNotFoundException("User not found");
        }
        if(!loanRepository.existsById(loanId)){
            throw new ResourceNotFoundException("Loan not found");
        }
        Optional<Loan> loanOptional = loanRepository.findByIdUsuarioAndId(userId, loanId);
        if(loanOptional.isEmpty()){
            throw new ResourceNotFoundException("Loan not found");
        }
        return loanMapper.toLoanResponseDTO(loanOptional.get());
    }

    @Override
    public LoanResponseDTO createLoan(ObjectId userId, LoanRequestDTO loanRequest) {
        Loan loan = loanMapper.toLoan(loanRequest);
        loan.setIdUsuario(userId);
        loanRepository.insert(loan);
        return loanMapper.toLoanResponseDTO(loan);
    }
}
