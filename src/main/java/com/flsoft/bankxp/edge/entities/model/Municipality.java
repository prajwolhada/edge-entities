package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Jikesh
 */
@Getter
@Setter
@Entity
@Table(name = "MUNICIPALITY")
public class Municipality implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 10)
    private char active;
    @Basic(optional = false)
    @Column(name = "MUNICIPALITY_NAME", nullable = false, length = 50)
    private String name;
    @Basic(optional = false)
    @Column(name = "MUNICIPALITY_CODE", nullable = false, length = 50)
    private String code;
    @JoinColumn(name = "DISTRICT_ID", referencedColumnName = "ID", insertable = false, updatable = false, nullable = true)
    @ManyToOne()
    private District district;

    public Municipality() {
    }
}
