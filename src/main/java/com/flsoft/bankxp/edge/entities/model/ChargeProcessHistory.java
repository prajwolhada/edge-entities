package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author prashant.adhikari
 */
@Getter
@Setter
@Entity
@Table(
        name = "CHARGE_PROCESS_HISTORY",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"CHARGE_NONCE"})}
)
public class ChargeProcessHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "CHARGE_REQUEST_ID", nullable = true, precision = 38, scale = 0)
    private Long chargeRequestId;
    @Column(name = "CHARGE_NONCE", unique = true, length = 255, nullable = false)
    private String chargeNonce;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

}
