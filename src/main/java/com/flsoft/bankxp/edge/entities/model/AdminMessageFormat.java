package com.flsoft.bankxp.edge.entities.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "ADMIN_MESSAGE_FORMAT")
public class AdminMessageFormat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "MODULE")
    private String module;
    @Basic(optional = false)
    @Column(name = "MESSAGE", nullable = false, length = 250)
    private String message;
    @Basic(optional = false)
    @Column(name = "MESSAGE_CODE", nullable = false, length = 255)
    private String messageCode;
    @Column(name = "DESCRIPTION", length = 200)
    private String description;
    @Column(name = "PROVIDED_MODIFY_LENGTH")
    private Integer modifyLength;
    @JoinColumn(name = "MESSAGE_TYPE", referencedColumnName = "ID")
    @ManyToOne()
    private MessageType messageType;
    @Transient
    private Long messageTypeID;
    @Column(name = "UNICODE_MESSAGE", columnDefinition = "TEXT")
    private String uniCodeMessage;

    public AdminMessageFormat() {
    }

    public AdminMessageFormat(Long id) {
        this.id = id;
    }
}