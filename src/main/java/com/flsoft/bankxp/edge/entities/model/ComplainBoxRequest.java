package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author santosh
 */
@Getter
@Setter
@Entity
@Table(name = "COMPLAIN_BOX_REQUEST")
public class ComplainBoxRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "EMAIL_ADDRESS", length = 50)
    private String emailAddress;
    @JoinColumn(name = "COMPLAIN_CATEGORY_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private ComplainCategory complainCategory;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = false)
    private Customer customer;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "ADDRESS", length = 200)
    private String address;
    @Column(name = "MESSAGE", length = 200)
    private String message;
    @Column(name = "NAME", length = 200)
    private String name;

    public ComplainBoxRequest() {
    }

    public ComplainBoxRequest(Long id) {
        this.id = id;
    }
}
