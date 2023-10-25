package com.flsoft.bankxp.edge.entities.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "ACTIVITY_RECORD_LOG")
public class ActivityRecordLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "INITIATED_BY", nullable = false, precision = 38, scale = 0)
    private Long initiatedBy;
    @Column(name = "INITIATED_FOR", nullable = true, precision = 38, scale = 0)
    private Long initiatedFor;
    @Temporal(TemporalType.DATE)
    @Column(name = "INITIATED_DATE")
    private Date initiatedDate;
    @Column(name = "REMARKS")
    private String remarks;
    @Column(name = "RECORD_TYPE")
    private String recordType;
}
