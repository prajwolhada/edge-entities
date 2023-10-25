package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Bikash Shah
 */
@Getter
@Setter
@Entity
@Table(name = "PKI_CLIENT")
public class PkiClient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "CREATED_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdDate;
    @Column(name = "CLIENT_KEY")  // pki client key
    private String clientKey;
    @OneToOne(mappedBy = "client")
    private ClientKeyPair clientKeyPair;
}
