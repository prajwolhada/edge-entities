package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "RENEW_FAILED_LOGIN")
public class RenewFailedLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CUSTOMER_ID", unique = true)
    private String customerId;
    @Temporal(TemporalType.DATE)
    @Column(name = "RECORDED_DATE", unique = true)
    private Date recordedDate;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LOGIN_DATE")
    private Date loginDate;
    @Column(name = "STATUS")
    private Integer status;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "CHARGE_STATUS")
    private String chargeStatus;

}
