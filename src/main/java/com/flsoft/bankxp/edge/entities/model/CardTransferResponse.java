package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sandhya Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "CARD_TRANSFER_RESPONSE")
public class CardTransferResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "CARD_TRANSFER_RESPONSE_ID", referencedColumnName = "ID")
    @OneToOne()
    private CardTransferRequest cardTransferRequest;
    @Column(name = "RAW_RESPONSE", nullable = false, length = 1000)
    private String rawResponse;
    @Column(name = "STATUS", nullable = false, length = 500)
    private String status;
    @Column(name = "TXN_ID", nullable = false, length = 500)
    private String txnId;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

}
