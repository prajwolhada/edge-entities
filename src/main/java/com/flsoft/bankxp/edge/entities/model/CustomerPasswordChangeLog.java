package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_PASSWORD_CHANGE_LOG")
public class CustomerPasswordChangeLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "PASSWORD", length = 200)
    private String password;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", nullable = false)
    @ManyToOne()
    private CustomerLogin customerLogin;
    @Column(name = "PASSWORD_TYPE")
    private String passwordType;
}