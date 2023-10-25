package com.flsoft.bankxp.edge.entities.model;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "FORGOT_PASSWORD_BLOCK")
public class ForgotPasswordBlock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 15)
    private String mobileNumber;
    @Column(name = "BLOCKED", nullable = false, length = 1)
    private char blocked;
    @Column(name = "BLOCKED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blockedDate;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @OneToOne()
    private Customer customer;

}
