package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author rashim.dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "GCM_REG_LOG")
public class GcmRegLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "GCM_REG_ID", length = 255)
    private String gcmReg;
    @Column(name = "OS_TYPE", length = 20)
    private String osType;
    @Column(name = "DEVICE_DETAILS", columnDefinition = "TEXT", nullable = true)
    private String deviceDetails;
    @Column(name = "GCM_RECORDED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gcmRecordedAt;

    public GcmRegLog() {
    }
}