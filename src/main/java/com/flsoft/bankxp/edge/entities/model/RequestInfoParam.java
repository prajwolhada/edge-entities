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
@Table(name = "REQUEST_INFO_PARAM")
public class RequestInfoParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "PARAM_NAME", length = 50)
    private String paramName;
    @Column(name = "PARAM_VALUE", length = 80)
    private String paramValue;
    @Basic(optional = false)
    @Column(name = "PRIMARY_PARAM", nullable = false)
    private Character isPrimaryParam;
    @JoinColumn(name = "REQUEST_INFO_ID")
    @ManyToOne()
    private RequestInfo requestInfo;

    public RequestInfoParam() {
    }

}