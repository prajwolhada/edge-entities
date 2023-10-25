package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "FEATURE_RATE_LIMIT")
public class FeatureRateLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "USERNAME")
    private String userName;
    @Column(name = "COUNT")
    private Integer count;
    @Column(name = "BLOCKED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date blockedDate;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "LAST_UPDATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @Column(name = "LAST_REMARKS")
    private String lastRemarks;

    public FeatureRateLimit() {
    }

    public FeatureRateLimit(Long id) {
        this.id = id;
    }
}