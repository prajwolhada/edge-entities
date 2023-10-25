package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Sudip Pradhan
 */
@Getter
@Setter
@Entity
@Table(name = "THIRD_PARTY_WALLET")
public class ThirdPartyWallet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVE", nullable = true, length = 1)
    private Character active;
    @Column(name = "MERCHANT_MNEMONIC", nullable = true)
    private String merchantMnemonic;
    @Column(name = "THIRD_PARTY_MERCHANT")
    private String thirdPartMerchant;
    @Column(name = "VENDOR")
    private String vendor;
}
