package com.group01.dreamcar.loan.mapper;

import com.group01.dreamcar.loan.dto.LoanRequestDTO;
import com.group01.dreamcar.loan.dto.LoanResponseDTO;
import com.group01.dreamcar.loan.model.Loan;
import com.group01.dreamcar.shared.formulas.DatosEntrada;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LoanMapper {
    LoanResponseDTO toLoanResponseDTO(Loan loan);
    Loan toLoan(LoanRequestDTO loanRequestDTO);

    List<LoanResponseDTO> toLoanResponseDTOList(List<Loan> loans);
    List<Loan> toLoanList(List<LoanRequestDTO> loanRequestDTOList);

    DatosEntrada toDatosEntrada (Loan loan);
}
