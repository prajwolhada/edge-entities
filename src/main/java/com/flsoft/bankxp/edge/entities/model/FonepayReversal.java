package com.flsoft.bankxp.edge.entities.model;

import jakarta.persistence.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Kailash
 */
@Entity
@Table(name = "FONEPAY_REVERSAL")
@XmlRootElement
public class FonepayReversal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "REQUEST_ID")
    private Long requestId;
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Column(name = "FONEPAY_SEQUENCE_ID")
    private String fonepaySequenceId;
    @Column(name = "REQUESTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestedDate;
    @Column(name = "REVERSAL_STATUS")
    private Integer reversalStatus;
    @Column(name = "REVERSAL_RESPONSE")
    private String reversalResponse;
    @Column(name = "FONEPAY_ERROR_CODE")
    private String fonepayErrorCode;
    @Basic(optional = false)
    @Column(name = "FONEPAY_ERROR_DESCRIPTION")
    private String fonepayErrorDescription;

    public FonepayReversal() {
    }

    public FonepayReversal(Long id) {
        this.id = id;
    }

    public FonepayReversal(Long id, String fonepayErrorCode, String fonepayErrorDescription) {
        this.id = id;
        this.fonepayErrorCode = fonepayErrorCode;
        this.fonepayErrorDescription = fonepayErrorDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getReversalStatus() {
        return reversalStatus;
    }

    public void setReversalStatus(Integer reversalStatus) {
        this.reversalStatus = reversalStatus;
    }

    public String getFonepaySequenceId() {
        return fonepaySequenceId;
    }

    public void setFonepaySequenceId(String fonepaySequenceId) {
        this.fonepaySequenceId = fonepaySequenceId;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }
    public String getReversalResponse() {
        return reversalResponse;
    }

    public void setReversalResponse(String reversalResponse) {
        this.reversalResponse = reversalResponse;
    }

   
    public String getFonepayErrorCode() {
        return fonepayErrorCode;
    }

    public void setFonepayErrorCode(String fonepayErrorCode) {
        this.fonepayErrorCode = fonepayErrorCode;
    }

    public String getFonepayErrorDescription() {
        return fonepayErrorDescription;
    }

    public void setFonepayErrorDescription(String fonepayErrorDescription) {
        this.fonepayErrorDescription = fonepayErrorDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FonepayReversal)) {
            return false;
        }
        FonepayReversal other = (FonepayReversal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.f1soft.smsbanking.entities.FonepayReversal[ id=" + id + " ]";
    }
}
