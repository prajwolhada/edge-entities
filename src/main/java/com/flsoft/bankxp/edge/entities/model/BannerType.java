
package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author bijay.shrestha
 */
@Getter
@Setter
@Entity
@Table(name = "BANNER_TYPE")
public class BannerType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CODE")
    private String code;
    @Column(name = "ACTIVE", nullable = true, length = 1)
    private Character active;

    public BannerType() {
    }

    public BannerType(Long id) {
        this.id = id;
    }
}
