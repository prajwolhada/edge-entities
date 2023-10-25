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
@Table(name = "EMAIL_ATTACHMENT")
public class EmailAttachment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @JoinColumn(name = "EMAIL_TO_SEND_ID", referencedColumnName = "ID", nullable = true)
    @ManyToOne(optional = true)
    private EmailToSend emailToSend;
    @Lob
    @Column(name = "ATTACHED_FILE")
    private byte[] attachedFile;
    @Column(name = "GENERATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date generatedDate;
    @Column(name = "ATTACHED_FILE_PATH")
    private String attachedFilePath;
    @Column(name = "FILE_TYPE")
    private String fileType;
    @Column(name = "FILE_NAME")
    private String fileName;

    public EmailAttachment() {
    }

    public EmailAttachment(Long id) {
        this.id = id;
    }
}