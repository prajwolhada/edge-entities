package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "PURCHASE_RECHARGE_CARD", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"REQUEST_INFO_ID"})})
public class PurchaseRechargeCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "CARD_STATUS")
    private Integer cardStatus;
    @Column(name = "PIN_ID")
    private String pinId;
    @Column(name = "PIN_NUMBER")
    private String pinNumber;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
    @JoinColumn(name = "REQUEST_INFO_ID")
    @OneToOne()
    private RequestInfo requestInfo;
    @Column(name = "TXN_STATUS")
    private Integer txnStatus;
    @Column(name = "CARD_MSG")
    private String cardMsg;
    @Column(name = "TXN_MSG")
    private String txnMsg;

    public PurchaseRechargeCard() {
    }

    public PurchaseRechargeCard(Long id) {
        this.id = id;
    }

    public PurchaseRechargeCard(Long id, int cardStatus, String pinId) {
        this.id = id;
        this.cardStatus = cardStatus;
        this.pinId = pinId;
    }

}