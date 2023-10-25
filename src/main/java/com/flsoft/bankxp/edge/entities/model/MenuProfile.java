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
@Table(name = "MENU_PROFILE")
public class MenuProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVE")
    private Character active;
    @ManyToOne
    @JoinColumn(name = "PROFILE_ID", referencedColumnName = "ID")
    private Profile profile;
    @ManyToOne
    @JoinColumn(name = "MENU_ID", referencedColumnName = "ID")
    private Menu menu;
    @Column(name = "SUB_MENU_ID")
    private Long subMenuId;

    public MenuProfile() {
    }
}
