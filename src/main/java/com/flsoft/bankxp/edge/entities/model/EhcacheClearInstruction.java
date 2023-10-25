package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Rashim Dhaubanjar
 */
@Entity
@Getter
@Setter
@Table(name = "EHCACHE_CLEAR_INSTRUCTION")
public class EhcacheClearInstruction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "STATUS")
    private Integer status;

    @Basic(optional = false)
    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recorded;

    @Column(name = "COMPLETED_DATE", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date completedDate;
}
