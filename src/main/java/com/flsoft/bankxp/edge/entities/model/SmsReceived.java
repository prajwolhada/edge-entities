package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "SMS_RECEIVED")
@SqlResultSetMapping(name = "smsReceivedDetail", columns = {
        @ColumnResult(name = "MOBILE_NUMBER"),
        @ColumnResult(name = "SMS_REPORT_TEXT"),
        @ColumnResult(name = "REPORT_TEXT")
})
public class SmsReceived implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "RECEIVED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedDate;
    @Column(name = "SMS_TEXT", length = 160)
    private String smsText;
    @Column(name = "SMS_REPORT_TEXT", length = 160)
    private String smsReportText;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "REQUEST_MODE")
    private String requestMode;
    @Column(name = "CHANNEL_PROVIDER_ID", precision = 38, scale = 0)
    private Long channelProviderId;
    @Column(name = "CUSTOMER_LOGIN_ID", precision = 38, scale = 0)
    private Long customerLoginId;
    @Column(name = "REQUEST_SMS_TEXT")
    private String requestSmsText;
    @Column(name = "PROCESS_STATUS")
    private Integer processStatus;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.DATE)
    private Date processedDate;
    @Column(name = "REQUEST_INFO_ID")
    private Long requestInfoId;
    @Column(name = "PROVIDER_TRACE_ID")
    private String providerTraceId;

    public SmsReceived() {
    }

    public SmsReceived(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getSmsText() {
        return smsText;
    }

    public void setSmsText(String smsText) {
        this.smsText = smsText;
    }

    public String getSmsReportText() {
        return smsReportText;
    }

    public void setSmsReportText(String smsReportText) {
        this.smsReportText = smsReportText;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Long getChannelProviderId() {
        return channelProviderId;
    }

    public void setChannelProviderId(Long channelProviderId) {
        this.channelProviderId = channelProviderId;
    }

    public String getRequestMode() {
        return requestMode;
    }

    public void setRequestMode(String requestMode) {
        this.requestMode = requestMode;
    }

    public Long getCustomerLoginId() {
        return customerLoginId;
    }

    public void setCustomerLoginId(Long customerLoginId) {
        this.customerLoginId = customerLoginId;
    }

    public String getRequestSmsText() {
        return requestSmsText;
    }

    public void setRequestSmsText(String requestSmsText) {
        this.requestSmsText = requestSmsText;
    }

    public Date getProcessedDate() {
        return processedDate;
    }

    public void setProcessedDate(Date processDate) {
        this.processedDate = processDate;
    }

    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    public Long getRequestInfoId() {
        return requestInfoId;
    }

    public void setRequestInfoId(Long requestInfoId) {
        this.requestInfoId = requestInfoId;
    }

    public String getProviderTraceId() {
        return providerTraceId;
    }

    public void setProviderTraceId(String providerTraceId) {
        this.providerTraceId = providerTraceId;
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
        if (!(object instanceof SmsReceived)) {
            return false;
        }
        SmsReceived other = (SmsReceived) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.f1soft.smsbanking.entities.SmsReceived[id=" + id + "]";
    }
}
