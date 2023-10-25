package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Narayan Joshi
 * <narayan.joshi@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "CARDLESS_WITHDRAW_REQUEST")
public class CardlessWithdrawRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "AMOUNT", precision = 17, scale = 2)
    private Double amount;
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 50)
    private String accountNumber;
    @Column(name = "TOKEN", length = 9)
    private String token;
    @Column(name = "CREATED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;

}
