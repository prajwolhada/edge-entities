package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "QUICK_MENU")
public class QuickMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "APPLICATION_USER_ID")
    private Long applicationUserId;
    @Column(name = "BANK_USER_MENU_ID")
    private Integer bankUserMenuId;
    @Column(name = "HIT_COUNT")
    private Integer hitCount;

}
