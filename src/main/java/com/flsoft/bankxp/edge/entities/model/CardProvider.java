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
@Table(name = "CARD_PROVIDER")
public class CardProvider implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "PROVIDER", nullable = false, length = 50)
    private String provider;
    @Basic(optional = false)
    @Column(name = "SERVICE_PROVIDER", nullable = false, length = 10)
    private String serviceProvider;

    public CardProvider() {
    }

    public CardProvider(Long id) {
        this.id = id;
    }
}
