package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Gaurav Regmi
 */
@Getter
@Setter
@Entity
@Table(name = "REGISTER_CARD")
public class RegisteredCard implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private String active;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;
    @Column(name = "CARD_ID", nullable = false, length = 200)
    private String cardId;
    @JoinColumn(name = "CARD_ENROLLMENT_ID", referencedColumnName = "ID", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private CardEnrollment cardEnrollment;
}
