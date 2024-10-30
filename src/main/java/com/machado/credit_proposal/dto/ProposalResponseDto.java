package com.machado.credit_proposal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ProposalResponseDto {
    private Long id;
    private String proposalFirstName;
    private String proposalLastName;
    private BigDecimal proposalIncome;
    private String proposalCpf;
    private String proposalTelephone;
    private BigDecimal proposalRequestedAmount;
    private int proposalPaymentTerm;
    private String proposalStatus;
    private String proposalDescription;
}