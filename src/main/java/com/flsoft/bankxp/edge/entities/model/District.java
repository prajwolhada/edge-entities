package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Sabrin Luitel
 */
@Getter
@Setter
@Entity
@Table(name = "DISTRICT")
public class District implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 1)
    private Character active;
    @Basic(optional = false)
    @Column(name = "DISTRICT_NAME", nullable = false, length = 150)
    private String name;
    @JoinColumn(name = "PROVINCE_ID", referencedColumnName = "ID", insertable = false, updatable = false, nullable = true)
    @ManyToOne()
    private Province province;
    @Basic(optional = false)
    @Column(name = "PROVINCE_ID", nullable = true)
    private Long provinceId;
    @Column(name = "DISTRICT_CODE")
    private String code;
    @OneToMany(mappedBy = "district", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Municipality> municipalityList;

}
