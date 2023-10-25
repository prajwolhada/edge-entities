package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "ACTIVATION_STAGE")
public class ActivationStage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "STAGE", nullable = false)
    private String stage;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "PREVIOUS_STAGE")
    private String previousStage;
    @Column(name = "SORT_ORDER")
    private Integer sortOrder;
    @ManyToOne()
    @JoinColumn(name = "ACTIVATION_MODE_ID")
    private ActivationMode activationMode;

}
