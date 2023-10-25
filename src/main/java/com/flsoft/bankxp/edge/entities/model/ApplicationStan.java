package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author santosh
 */
@Getter
@Setter
@Entity
@Table(name = "APPLICATION_STAN")
public class ApplicationStan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "STAN_ID", length = 20)
    private Long stanId;

    public ApplicationStan() {
    }

    public ApplicationStan(Long id) {
        this.id = id;
    }
}
