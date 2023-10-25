package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "MISCELLANEOUS_CHARGE")
public class MiscellaneousCharge implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CHARGE_TYPE")
    private String chargeType;

    @Column(name = "STATUS")
    private int status;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RECORDED_DATE")
    private Date recordedDate;

    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne
    private Customer customer;

    //TODO add remarks
}
