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
@Table(name = "TXN_REQUEST_PARAM")
public class TxnRequestParam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PARAM_NAME", length = 255)
    private String paramName;
    @Basic(optional = false)
    @Column(name = "PARAM_ORDER", length = 2)
    private Integer paramOrder;
    @Column(name = "PARAM_VALUE", length = 255)
    private String paramValue;
    @JoinColumn(name = "TXN_REQUEST_DETAIL_ID", referencedColumnName = "ID")
    @ManyToOne()
    private TxnRequestDetail txnRequestDetail;

    public TxnRequestParam() {
    }

}