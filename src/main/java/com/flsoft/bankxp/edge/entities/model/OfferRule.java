package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "OFFER_RULE")
public class OfferRule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTIVE")
    private char active;
    @Column(name = "RULE_NAME")
    private String ruleName;
    @Column(name = "PERSONAL_ACCOUNT")
    private char personalAccount;
    @Column(name = "LOAN_ACCOUNT")
    private char loanAccount;
    @Column(name = "FIXED_DEPOSIT")
    private char fixedDeposit;
    @Column(name = "CREDIT_CARD")
    private char creditCard;
    @Column(name = "MAX_BALANCE")
    private Double maxBalance;
    @Column(name = "MIN_BALANCE")
    private Double minBalance;

}
