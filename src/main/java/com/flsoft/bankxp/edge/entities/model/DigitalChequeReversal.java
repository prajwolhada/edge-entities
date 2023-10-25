package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author Sabrin Luitel
 */
@Getter
@Setter
@Entity
@Table(name = "DIGITAL_CHEQUE_REVERSAL")
public class DigitalChequeReversal {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "DIGITAL_CHEQUE_ID", referencedColumnName = "ID", nullable = false)
    private DigitalCheque digitalCheque;

    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "REVERSAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reversalDate;

    @Column(name = "REQUEST_INFO_ID")
    private String requestInfoId;

    @Column(name = "STATUS", nullable = false)
    private String status;
}
