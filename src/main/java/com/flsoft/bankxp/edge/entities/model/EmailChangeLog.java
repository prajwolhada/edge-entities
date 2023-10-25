package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "EMAIL_CHANGE_LOG")
public class EmailChangeLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "OLD_EMAIL", length = 200)
    private String oldEmail;
    @Column(name = "NEW_EMAIL")
    private String newEmail;

    @JoinColumn(name = "CUSTOMER_LOGIN_ID", nullable = false)
    @ManyToOne()
    private CustomerLogin customerLogin;
}