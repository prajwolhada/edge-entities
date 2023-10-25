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
@Table(name = "PROFILE_OPTION")
public class ProfileOption implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ACTIVE", nullable = false)
    private Character active;

    @Column(name = "TYPE", nullable = false)
    private String userType;

    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID", nullable = true)
    @OneToOne()
    private Profile profile;
}
