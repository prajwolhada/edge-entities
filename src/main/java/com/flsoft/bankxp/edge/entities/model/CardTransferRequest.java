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
@Table(name = "CARD_TRANSFER_REQUEST")
public class CardTransferRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "SENDER_CARD_ID", nullable = false, length = 500)
    private String senderCardId;
    @Column(name = "TO_ACC0UNT", nullable = false, length = 150)
    private String toAccount;
    @Column(name = "DESCRIPTION", nullable = false, length = 500)
    private String description;
    @Column(name = "INITIATOR_MOBILE_NUMBER", nullable = false, length = 150)
    private String initiatorMobileNumber;
    @Column(name = "AMOUNT", nullable = false, length = 500)
    private Double amount;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

}
