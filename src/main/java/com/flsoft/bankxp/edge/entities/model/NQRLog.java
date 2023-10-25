package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "NQR_LOG")
public class NQRLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecordedDate;
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @OneToOne
    @JoinColumn(name = "CUSTOMER_LOGIN_ID", referencedColumnName = "ID")
    private CustomerLogin customerLogin;
    @Column(name = "INSTRUCTION_ID")
    private String instructionId;
    @Column(columnDefinition = "TEXT", name = "REQUEST")
    private String request;
    @Column(columnDefinition = "TEXT", name = "RESPONSE")
    private String response;
    @Column(name = "TYPE", length = 10)
    private String type; //BOOKING, PAYMENT
}
