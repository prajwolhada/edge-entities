package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Dilip Mandal
 */
@Getter
@Setter
@Entity
@Table(name = "HTTP_RESPONSE_LOG")
public class HttpResponseLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(columnDefinition = "TEXT", name = "RESPONSE_TEXT")
    private String responseText;
    @Column(name = "REQUEST_STATUS")
    private String requestStatus;
    @Column(name = "UNICODE_RESPONSE_TEXT", columnDefinition = "TEXT")
    private String unicodeResponseText;
    @Column(name = "REQUESTED_FOR")
    private String requestedFor;
    @Column(name = "HTTP_REQUEST_LOG_ID")
    private Long httpRequestLogId;

    @Transient
    private String uniqueIdentifier;

    public Long getId() {
        return id;
    }
}
