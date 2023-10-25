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
@Table(name = "DIGITAL_CHEQUE_CASHOUT")
public class DigitalChequeCashOut {

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

    @Column(name = "CAHSOUT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cashOutDate;

    @Column(name = "REQUEST_INFO_ID")
    private String requestInfoId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "APPLICATION_USER_ID", nullable = false)
    private Long applicationUserId;

    @Column(name = "TELLER_ACCOUNT", nullable = false)
    private String tellerAccount;
}
