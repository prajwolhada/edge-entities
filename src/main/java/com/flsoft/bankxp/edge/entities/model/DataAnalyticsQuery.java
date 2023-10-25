package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "DATA_ANALYTICS_QUERY")
@NamedQueries({
        @NamedQuery(name = "DataAnalyticsQuery.findAll", query = "SELECT f FROM DataAnalyticsQuery f")
})
public class DataAnalyticsQuery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "QUERY_CODE")
    private String queryCode;
    @Column(name = "SQL_QUERY")
    private String sqlQuery;
    @Column(name = "QUERY_DESCRIPTION")
    private String queryDescription;
}
