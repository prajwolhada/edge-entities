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
@Table(name = "LOGIN_TYPE")
public class LoginType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 12)
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = true, length = 20)
    private String type;
    @Column(name = "IS_NOTIFIER")
    private Character isNotifier;

    public LoginType() {
    }

    public LoginType(Long id) {
        this.id = id;
    }
}