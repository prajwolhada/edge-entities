package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "STATIC_KEYWORD")
public class StaticKeyword implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "STATIC_KEY_ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Basic(optional = false)
    @Column(name = "KEYWORD", nullable = false, length = 5)
    private String keyword;
    @Basic(optional = false)
    @Column(name = "MESSAGE", nullable = false, length = 160)
    private String message;
    @Column(name = "ACTIVE", nullable = false, length = 160)
    private Character active;
    @Column(name = "TO_PROCESS", nullable = false, length = 160)
    private Character toProcess;
    @Column(name = "REQUIRED_PIN", nullable = false, length = 1)
    private Character requiredPin;
    @Column(name = "SMS_LENGTH", length = 1)
    private Integer smsLength;

    public StaticKeyword() {
    }
}