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
@Table(name = "SMS_SENT")
public class SmsSent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "DELIVERED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveredDate;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "SMS_MSG_ID", length = 10)
    private String smsMsgId;
    @Column(name = "SEND_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendDate;
    @Column(name = "SEND_DATE", insertable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date recordedDate;
    @Column(name = "STATUS")
    private Integer status;
    @Column(name = "SMS_TEXT", length = 200)
    private String smsText;
    @Column(name = "REPORT_TEXT", length = 200)
    private String reportText;
    @Column(name = "RESENT_BY", length = 200)
    private String resentBy;
    @Column(name = "REMARKS", length = 200)
    private String remarks;
    @Column(name = "MESSAGE_FORMAT_ID")
    private Long messageFormatId;
    @Column(name = "MESSAGE_TYPE_ID")
    private Long messageTypeId;
    @Column(name = "CHANNEL_PROVIDER_ID")
    private Long channelProviderId;
    @Column(name = "SMS_RECEIVED_ID")
    private Long smsReceivedId;
    @Column(name = "PROCESSED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedDate;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Column(name = "CHANNEL")
    private String channel;
    @Column(name = "INITIATED_BY", nullable = true, length = 80)
    private String initiatedBy;
    @Column(name = "FILE_NAME", nullable = true, length = 80)
    private String fileName;
    @Column(name = "ENCRYPTION_INDEX", nullable = true)
    private String encryptionIndex;
    @Column(name = "IS_ENCRYPTED", nullable = true)
    private Character isEncrypted;
    @Column(name = "BATCH_ID", nullable = true)
    private Long batchId;
    @Column(name = "ALERT_TRACKER_ID", nullable = true)
    private Long alertTrackerId;
    @Column(name = "SMS_LENGTH")
    private Integer smsLength;
    @Column(name = "SMS_COUNT")
    private Integer smsCount;
    @Column(name = "SMS_LANG")
    private String smsLang;


    public SmsSent() {
    }
}