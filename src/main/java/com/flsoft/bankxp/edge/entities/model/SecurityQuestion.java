package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "SECURITY_QUESTION")
public class SecurityQuestion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 100)
    private String active;

    @Basic(optional = false)
    @Column(name = "QUESTION", nullable = false, length = 100)
    private String question;

    @Column(name = "IMAGE", length = 100)
    private String image;

    public SecurityQuestion() {
    }

    public SecurityQuestion(Long id) {
        this.id = id;
    }

}
