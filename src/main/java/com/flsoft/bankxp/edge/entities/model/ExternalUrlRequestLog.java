package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "EXTERNAL_URL_REQUEST_LOG")
public class ExternalUrlRequestLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(columnDefinition = "TEXT", name = "RAW_REQUEST")
    private String rawRequest;
    @Column(columnDefinition = "TEXT", name = "RAW_RESPONSE")
    private String rawResponse;
    @Column(name = "REQUEST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date RequestDate;
    @Column(name = "RESPONSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ResponseDate;
    @Column(name = "URL")
    private String url;
    @Column(name = "STATUS_CODE")
    private String statusCode;
    @Column(name = "IDENTIFIER")
    private String identifier;
    @Column(name = "REQUEST_TYPE")
    private String requestType;
}
