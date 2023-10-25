package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "GPRS_ONLINE_MESSAGE")

@NamedQueries({@NamedQuery(
        name = "GPRSOnlineMessage.findAll",
        query = "SELECT m FROM GPRSOnlineMessage m"
), @NamedQuery(
        name = "GPRSOnlineMessage.findById",
        query = "SELECT m FROM GPRSOnlineMessage m WHERE m.id = :id"
), @NamedQuery(
        name = "GPRSOnlineMessage.findByMessageCode",
        query = "SELECT m FROM GPRSOnlineMessage m WHERE m.messageCode = :messageCode"
)})
public class GPRSOnlineMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Basic(
            optional = false
    )
    @Column(
            name = "ID",
            nullable = false,
            precision = 19,
            scale = 0
    )
    private Long id;
    @Basic(
            optional = false
    )
    @Column(
            name = "MESSAGE",
            nullable = false,
            length = 255
    )
    private String message;
    @Basic(
            optional = false
    )
    @Column(
            name = "MESSAGE_CODE",
            nullable = false,
            length = 50
    )
    private String messageCode;
    @Column(
            name = "UNICODE_MESSAGE",
            columnDefinition = "NTEXT",
            nullable = false,
            length = 250
    )
    private String unicodeMessage;

    public GPRSOnlineMessage() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageCode() {
        return this.messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getUnicodeMessage() {
        return this.unicodeMessage;
    }

    public void setUnicodeMessage(String unicodeMessage) {
        this.unicodeMessage = unicodeMessage;
    }

    public String toString() {
        return "GPRSOnlineMessage{id=" + this.id + ", message=" + this.message + ", messageCode=" + this.messageCode + '}';
    }
}
