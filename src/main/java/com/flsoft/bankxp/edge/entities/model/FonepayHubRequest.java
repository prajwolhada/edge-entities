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
@Table(name = "FONEPAY_HUB_REQUEST")
public class FonepayHubRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "USER_TOKEN", length = 500)
    private String userToken;

    @Column(name = "LOGIN_TOKEN")
    private String loginToken;

    @Column(name = "CATEGORY_CODE")
    private String categoryCode;

    @Column(name = "REQUEST_CHANNEL", length = 10)
    private String requestChannel;

    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "REQUEST_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;

}
