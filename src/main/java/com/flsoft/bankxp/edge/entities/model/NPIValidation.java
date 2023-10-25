package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "NPI_VALIDATION")
public class NPIValidation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", precision = 19, scale = 0)
    private Long id;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "ORIGINATOR_UNIQUE_ID")
    private String originatorUniqueId;

    @Column(name = "BANK_ID")
    private String beneficiaryBankCode;

    @Column(name = "VPA")
    private String vpa;

    @Column(name = "REQUEST_IDENTIFIER")
    private String requestIdentifier;

    @Column(name = "BENEFICIARY_ACCOUNT_NAME")
    private String beneficiaryAccountName;
    
    @Column(name = "BENEFICIARY_ACCOUNT_NUMBER")
    private String beneficiaryAccountNumber;

    @Column(name = "REQUEST_INFO_ID")
    private Long requestInfoId;

    @Column(name = "VALIDATION_TYPE")
    private String validationType;

    @Column(name = "STATUS")
    private String status;
}
