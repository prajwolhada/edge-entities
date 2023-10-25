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
@Table(name = "FCM_NOTIFIER_TYPE")
public class FCMNotifierType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false)
    private char active;
    @Basic(optional = false)
    @Column(name = "TOPIC", nullable = false)
    private String topic;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false)
    private String name;
    @Basic(optional = false)
    @Column(name = "CODE", nullable = false)
    private String code;
    @JoinColumn(name = "OS_TYPE_ID", referencedColumnName = "ID")
    @ManyToOne()
    private OSType oSType;

    public FCMNotifierType() {
    }
}
