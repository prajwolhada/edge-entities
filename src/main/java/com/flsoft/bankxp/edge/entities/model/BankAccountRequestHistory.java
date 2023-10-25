package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author prajwol.hada
 */
@Getter
@Setter
@Entity
@Table(name = "BANK_ACCOUNT_REQUEST_HISTORY")
public class BankAccountRequestHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REMARKS")
    private String remarks;
    @ManyToOne()
    @JoinColumn(name = "BANK_ACCOUNT_REQUEST_ID")
    private BankAccountRequest bankAccountRequest;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;

}
