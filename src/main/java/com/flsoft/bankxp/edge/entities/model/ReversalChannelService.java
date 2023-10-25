package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author <krishna.pandey@f1soft.com>
 */

@Getter
@Setter
@Entity
@Table(name = "REVERSAL_CHANNEL_SERVICE")
public class ReversalChannelService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "SERVICE_CODE")
    private String code;
    @Column(name = "REVERSAL_CHANNEL_ID")
    private Long reversalChannelId;
    @JoinColumn(name = "REVERSAL_CHANNEL_ID", insertable = false, updatable = false)
    @ManyToOne()
    private ReversalChannel reversalChannel;
}
