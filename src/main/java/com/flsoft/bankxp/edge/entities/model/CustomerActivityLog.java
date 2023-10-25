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
@Table(name = "CUSTOMER_ACTIVITY_LOG")
public class CustomerActivityLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @JoinColumn(name = "CUSTOMER_ACTIVITY_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CustomerActivityType customerActivityType;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "DESCRIPTION")
    private String desc;
    @Column(name = "CUSTOMER_LOGIN_ID")
    private Long customerLoginId;
    @Column(name = "GPRS_TOKEN")
    private String gprsToken;

    public CustomerActivityLog() {
    }

}