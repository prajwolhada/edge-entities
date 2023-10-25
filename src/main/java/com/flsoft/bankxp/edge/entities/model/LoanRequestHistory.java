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
@Table(name = "LOAN_REQUEST_HISTORY")
public class LoanRequestHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REMARKS")
    private String remarks;
    @ManyToOne()
    @JoinColumn(name = "LOAN_REQUEST_ID")
    private LoanRequest loanRequest;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;

}
