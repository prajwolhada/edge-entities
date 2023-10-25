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
@Table(name = "FONEPAY_TRANSACTION_CANCELLATION")
public class FonepayTransactionCancellation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @JoinColumn(name = "RECORDED_BY", referencedColumnName = "ID", nullable = true)
    @ManyToOne()
    private ApplicationUser recordedBy;
    @JoinColumn(name = "FONEPAY_TRANSACTION_DETAILS_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private FonepayTransactionDetail fonepayTransactionDetails;
    @Column(name = "STATUS", length = 20)
    private String status;
    @Basic(optional = true)
    @Column(name = "RESPONSE_CODE", nullable = true, length = 100)
    private String responseCode;
    @Basic(optional = true)
    @Column(name = "REMARKS", nullable = true, length = 255)
    private String remarks;
    @Basic(optional = true)
    @Column(name = "RESPONSE_MESSAGE", nullable = true, length = 255)
    private String responseMessage;

    public FonepayTransactionCancellation() {
    }

    public FonepayTransactionCancellation(Long id) {
        this.id = id;
    }
}