package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "FONEPAY_SERVICE")
public class FonepayService implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "SERVICE_NAME", nullable = false, length = 50)
    private String serviceName;
    @OneToMany(mappedBy = "fonepayService", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<FonepayServiceDetail> fonepayServiceDetails;
}
