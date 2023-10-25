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
@Table(name = "APPLICATION_MODULE")
public class ApplicationModule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "MODE_KEY", nullable = false, length = 50)
    private String modeKey;
    @Basic(optional = false)
    @Column(name = "MODE_NAME", nullable = false, length = 100)
    private String modeName;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;

    public ApplicationModule() {
    }

    public ApplicationModule(Long id) {
        this.id = id;
    }
}
