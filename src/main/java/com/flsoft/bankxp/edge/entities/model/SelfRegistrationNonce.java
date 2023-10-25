package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author sandhya.pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "SELF_REGISTRATION_NONCE", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"NONCE"})})
public class SelfRegistrationNonce {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "MOBILE_NUMBER", nullable = false, length = 15)
    private String mobileNumber;
    @Column(name = "ACCOUNT_NUMBER", nullable = false, length = 500)
    private String accountNumber;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "NONCE", nullable = false, length = 250)
    private String nonce;

}
