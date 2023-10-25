package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "ACTIVITY_TYPE")
public class ActivityType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "IDENTIFIER")
    private String identifier;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TYPE")
    private String type;
    @JoinColumn(name = "ACTIVITY_TYPE_PARENT_ID", referencedColumnName = "ID")
    @ManyToOne()
    private ActivityTypeParent activityTypeParent;

    public ActivityType() {
    }

    public ActivityType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}