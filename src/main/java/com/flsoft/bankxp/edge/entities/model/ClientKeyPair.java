package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

/**
 * @author Bikash Shah
 */
@Getter
@Setter
@Entity
@Table(name = "CLIENT_KEY_PAIR")
@NoArgsConstructor
public class ClientKeyPair {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "SERVER_ENCRYPTION_PUBLIC_KEY")
    private String serverEncryptionPublicKey;
    @Basic(optional = false)
    @Column(name = "SERVER_ENCRYPTION_PRIVATE_KEY")
    private String serverEncryptionPrivateKey;
    @Basic(optional = false)
    @Column(name = "SERVER_SIGNATURE_PUBLIC_KEY")
    private String serverSignaturePublicKey;
    @Basic(optional = false)
    @Column(name = "SERVER_SIGNATURE_PRIVATE_KEY")
    private String serverSignaturePrivateKey;
    @Basic(optional = false)
    @Column(name = "CLIENT_SIGNATURE_PUBLIC_KEY")
    private String clientSignaturePublicKey;
    @Basic(optional = false)
    @Column(name = "CLIENT_ENCRYPTION_PUBLIC_KEY")
    private String clientEncryptionPublicKey;
    @JoinColumn(name = "PKI_CLIENT_ID", referencedColumnName = "ID")
    @OneToOne(optional = false)
    private PkiClient client;
}
