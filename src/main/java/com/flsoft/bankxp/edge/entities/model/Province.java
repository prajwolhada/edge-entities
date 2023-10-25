package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Jikesh
 */
@Getter
@Setter
@Entity
@Table(name = "PROVINCE")
public class Province implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 10)
    private char active;
    @Basic(optional = false)
    @Column(name = "PROVINCE_NAME", nullable = false, length = 50)
    private String name;
    @OneToMany(mappedBy = "province", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<District> districtList;
    @Column(name = "PROVINCE_CODE")
    private String code;


    public Province() {
    }
}
