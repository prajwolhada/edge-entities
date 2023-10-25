package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author gita
 */
@Getter
@Setter
@Entity
@Table(name = "SCHEDULE_TYPE")
public class ScheduleType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "SCHEDULE_TYPE")
    private String scheduleType;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
}