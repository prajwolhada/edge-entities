package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "TELLER_QR_DETAIL")
public class TellerQRDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACCOUNT_NAME", length = 100)
    private String accountName;
    @Column(name = "ACCOUNT_NUMBER", length = 50)
    private String accountNumber;
    @Column(name = "ACCOUNT_TOKEN", length = 200)
    private String accountToken;
    @Column(name = "BRANCH_NAME", length = 50)
    private String branchName;
    @Column(name = "BANK_CODE", length = 50)
    private String bankCode;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "BANK_NAME", length = 100)
    private String bankName;

}
