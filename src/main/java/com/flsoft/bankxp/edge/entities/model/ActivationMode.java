package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "ACTIVATION_MODE")
public class ActivationMode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CODE", nullable = false)
    private String code;
    @Column(name = "NAME", nullable = false)
    private String name;
    @OneToMany(mappedBy = "activationMode", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<ActivationStage> activationStageList;

}
