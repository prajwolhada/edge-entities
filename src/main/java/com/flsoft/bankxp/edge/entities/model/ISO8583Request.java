package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author santosh
 */
@Getter
@Setter
@Entity
@Table(name = "ISO8583REQUEST")
public class ISO8583Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REQUEST_TYPE")
    private String requestType;
    @Column(name = "OPERATION_STATUS")
    private Integer operationStatus;
    @Column(name = "ENTRY_DATETIME")
    private Timestamp entryDatetime;
    @Column(name = "PROCESSED_DATETIME")
    private Timestamp processedDatetime;
    @Column(name = "REQUEST_TRACE_ID")
    private Long requestTraceId;
    @Column(name = "PARAMETERSINFO")
    private String parametersinfo;
    @OneToMany(mappedBy = "requestId", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<FundTransferResponse> fundtransferResponses;
    @OneToMany(mappedBy = "requestId", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<FundTransferRequest> fundtransferRequests;
    @OneToMany(mappedBy = "requestId", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ReversalRequest> reversalRequests;
    @OneToMany(mappedBy = "requestId", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ReversalResponse> reversalResponses;
    @Column(name = "REVERSED")
    private Character reversed;

    public ISO8583Request() {
    }

    public ISO8583Request(Long id) {
        this.id = id;
    }
}
