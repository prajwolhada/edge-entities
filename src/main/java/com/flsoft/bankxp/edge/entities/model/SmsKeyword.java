package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "SMS_KEYWORD")
public class SmsKeyword implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE")
    private char active;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "KEYWORD")
    private String keyword;
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "STATIC_ID")
    private Long staticId;
    @Column(name = "STATIC_KEYWORD")
    private String staticKeyword;
    @Column(name = "REQUIRED_PIN")
    private Character requiredPin;
    @Column(name = "REQUEST_HANDLER", length = 50)
    private String requestHandler;
    @Column(name = "REQUEST_HANDLER_PATH", length = 255)
    private String requestHandlerPath;
    @JoinColumn(name = "FEATURE_ID")
    @ManyToOne()
    private Feature feature;
    @JoinColumn(name = "KEY_ACCESS_MODE", referencedColumnName = "ID")
    @ManyToOne
    private KeyAccessMode keyAccessMode;

    public KeyAccessMode getKeyAccessMode() {
        return keyAccessMode;
    }
}
