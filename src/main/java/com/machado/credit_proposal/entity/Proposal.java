package com.machado.credit_proposal.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_proposal")
public class Proposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal requestedAmount;
    private int paymentTerm;
    private Boolean approved;
    private boolean compose;
    private String description;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
