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
@Table(name = "VENDOR_RESPONSE")
public class VendorResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "RESPONSE_STATUS")
    private Integer responseStatus;
    @Column(name = "RESPONSE_CODE", length = 10)
    private String responseCode;
    @Column(name = "RESPONSE_DESCRIPTION", length = 80)
    private String responseDesc;
    @Column(name = "TRACE_ID", length = 50)
    private String traceId;
    @JoinColumn(name = "REQUEST_INFO_ID", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private RequestInfo requestInfo;

    public VendorResponse() {
    }

    public VendorResponse(Long id) {
        this.id = id;
    }

}