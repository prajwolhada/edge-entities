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
@Table(name = "BATCH_TXN_RECORD")
public class BatchTxnRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @JoinColumn(name = "BATCH_RENEW_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne
    private BatchRenew batchRenewId;
}
