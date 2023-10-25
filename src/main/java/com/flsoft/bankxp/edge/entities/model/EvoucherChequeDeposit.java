package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "EVOUCHER_CHEQUE_DEPOSIT")
public class EvoucherChequeDeposit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "EVOUCHER_ID", referencedColumnName = "ID")
    private EVoucher eVoucher;

    @Column(name = "CHEQUE_NUMBER", nullable = false)
    private String chequeNumber;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Column(name = "BANK_NAME", nullable = false)
    private String bankName;

    @Column(name = "BRANCH_NAME", nullable = false)
    private String branchName;

}
