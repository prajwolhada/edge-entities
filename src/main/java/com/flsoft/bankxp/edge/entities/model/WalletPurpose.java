package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "WALLET_PURPOSE")
public class WalletPurpose implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PURPOSE", nullable = false, length = 50)
    private String purpose;

    public WalletPurpose() {
    }

}
