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
@Table(name = "CARD_CHARGE_REQEUST")
public class CardChargeRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "CHARGE_AMOUNT")
    private Double chargeAmount;
    @Column(name = "PROCESS_STATUS", nullable = false)
    private Integer processStatus;
    @Column(name = "CHARGE_GROUP", nullable = false, length = 10)
    private String chargeGroup;
    @Column(name = "CHARGE_TYPE", length = 10)
    private String chargeType;
    @Column(name = "REMARKS", length = 500)
    private String remarks;
    @Column(name = "TO_ACCOUNT", length = 500)
    private String toAccount;
    @Column(name = "INITIATOR_CARD_ID", nullable = false, length = 10)
    private String inititatorCardId;
    @JoinColumn(name = "CARD_ACCOUNT_ID", referencedColumnName = "ID")
    @OneToOne()
    private CardAccount cardAccount;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Customer customer;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDate;

}
