package com.machado.credit_proposal.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private BigDecimal income;
    private String cpf;
    private String telephone;
    private String password;

    @OneToOne(mappedBy = "user")
    private Proposal proposal;
}
