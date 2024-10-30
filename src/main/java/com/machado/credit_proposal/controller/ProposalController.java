package com.machado.credit_proposal.controller;

import com.machado.credit_proposal.dto.ProposalRequestDto;
import com.machado.credit_proposal.dto.ProposalResponseDto;
import com.machado.credit_proposal.service.ProposalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/proposal")
public class ProposalController {

    private final ProposalService proposalService;

    @PostMapping
    public ResponseEntity<ProposalResponseDto> create(@RequestBody ProposalRequestDto requestDto) {
        ProposalResponseDto responseDto = proposalService.createProposal(requestDto);
        return ResponseEntity.ok(responseDto);
    }
}
