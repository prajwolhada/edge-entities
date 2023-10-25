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
@Table(name = "THIRD_PARTY_VENDOR_RESPONSE")
public class ThirdpartyVendorResponse implements Serializable {

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
    @Column(name = "REFERENCE_ID", length = 50)
    private Long referenceId;

}
