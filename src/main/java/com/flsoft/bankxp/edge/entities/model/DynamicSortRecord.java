package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "DYNAMIC_SORT_RECORD")
public class DynamicSortRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", length = 200)
    private String name;
    @Column(name = "FETCH_QUERY", length = 200)
    private String fetchQuery;
    @Column(name = "UPDATE_QUERY", length = 200)
    private String updateQuery;
    @Column(name = "DESCRIPTION", length = 200)
    private String description;
    @Column(name = "SORT_ORDER_INDEX")
    private Integer sortOrderIndex;
    @Column(name = "ID_INDEX")
    private Integer idIndex;

}
