package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author <krishna.pandey@f1soft.com>
 */
@Getter
@Setter
@Entity
@Table(name = "WHITELISTED_MERCHANT")
public class WhiteListedMerchant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVE", nullable = true, length = 1)
    private Character active;
    @Column(name = "MERCHANT_CODE", nullable = true, length = 100)
    private String merchantCode;
    @Column(name = "PER_TRANSACTION_AMOUNT", nullable = true, length = 50)
    private Double perTransactionAmount;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @JoinColumn(name = "CHANNEL_ID")
    @ManyToOne()
    private Channel channel;
}
