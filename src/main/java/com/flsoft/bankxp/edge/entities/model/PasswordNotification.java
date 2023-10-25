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
@Table(name = "PASSWORD_NOTIFICATION")
public class PasswordNotification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @JoinColumn(name = "APPLICATION_PATTERN_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ApplicationPattern applicationPattern;
    @Column(name = "NOTIFY_IN", nullable = true, length = 20)
    private String notifyIn;

    public PasswordNotification() {
    }

    public PasswordNotification(Long id) {
        this.id = id;
    }
}