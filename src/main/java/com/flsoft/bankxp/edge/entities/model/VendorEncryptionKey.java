package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author jikesh Apr 19, 2018 10:54:11 AM​
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "VENDOR_ENCRYPTION_KEY")
public class VendorEncryptionKey implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Basic(optional = false)
    @Column(name = "SYSTEM_ENCRYPTION_PUBLIC_KEY", length = 500)
    private String systemEncryptionPublicKey;

    @Basic(optional = false)
    @Column(name = "SYSTEM_ENCRYPTION_PRIVATE_KEY", length = 2000)
    private String systemEncryptionPrivateKey;

    @Basic(optional = false)
    @Column(name = "SYSTEM_SIGNATURE_PUBLIC_KEY", length = 500)
    private String systemSignaturePublicKey;

    @Basic(optional = false)
    @Column(name = "SYSTEM_SIGNATURE_PRIVATE_KEY", length = 2000)
    private String systemSignaturePrivateKey;

    @Column(name = "VENDOR_SIGNATURE_PUBLIC_KEY", length = 500)
    private String vendorSignaturePublicKey;

    @Basic(optional = false)
    @Column(name = "VENDOR_ENCRYPTION_PUBLIC_KEY", length = 500)
    private String vendorEncryptionPublicKey;

    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;

    @Basic(optional = false)
    @Column(name = "ADDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;

    @Basic(optional = false)
    @Column(name = "VENDOR_KEY", nullable = false, length = 50)
    private String vendorKey;
}
