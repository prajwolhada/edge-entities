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
@Table(name = "REMITTANCE_REQUEST_LOG")
public class RemittanceRequestLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "REMITTANCE_NUMBER", length = 80)
    private String remittanceNumber;
    @Column(name = "SENDER_NAME")
    private String senderName;
    @Column(name = "SENDER_COUNTRY")
    private String senderCountry;
    @Column(name = "CUSTOMER_NAME")
    private String customerName;
    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "ACCOUNT_NUMBER", length = 80)
    private String accountNumber;
    @Column(name = "CITIZENSHIP_NUMBER", length = 80)
    private String citizenshipNumber;
    @Column(name = "AMOUNT", precision = 17, scale = 2)
    private String amount;
    @Column(name = "SENDER_RELATION")
    private String senderRelation;
    @Basic(optional = false)
    @Column(name = "REQUESTED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private CustomerLogin customerLoginId;
    @Column(name = "REMARKS")
    private String remarks;

}
