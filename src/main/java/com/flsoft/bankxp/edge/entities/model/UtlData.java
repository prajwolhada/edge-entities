package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Narayan
 */
@Getter
@Setter
@Entity
@Table(name = "UTL_DATA")
public class UtlData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false, length = 15)
    private String code;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 150)
    private String name;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 2)
    private String type;
    @Column(name = "SORT_ORDER", nullable = true)
    private Integer sortOrder;
}