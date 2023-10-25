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
@Table(name = "CONVERGENT_REQUEST_RESPONSE_LOG")
public class ConvergentRequestResponseLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "RECEIVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;
    @Column(columnDefinition = "TEXT", name = "REQUEST_PARAMETER")
    private String requestParameter;
    @Column(columnDefinition = "TEXT", name = "RESPONSE_TEXT")
    private String responseText;
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    @ManyToOne()
    private CustomerLogin customerLogin;
    @Column(name = "TYPE", length = 150)
    private String type;
    @Column(name = "REQUEST_TYPE", length = 150)
    private String requestType;
    @Column(name = "MODE", length = 150)
    private String mode;
}
