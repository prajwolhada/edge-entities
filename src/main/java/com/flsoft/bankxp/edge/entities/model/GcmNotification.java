package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author srijan
 */
@Getter
@Setter
@Entity
@Table(name = "GCM_NOTIFICATION")
public class GcmNotification implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "MESSAGE", length = 1000, nullable = false)
    private String message;

    @Column(name = "TITLE", length = 100, nullable = false)
    private String title;

    @Column(name = "RECORDED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;

    @Column(name = "TYPE", length = 20, nullable = false)
    private String type;

    @OneToMany(mappedBy = "gcmNotification", fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @Fetch(FetchMode.SUBSELECT)
    private List<GcmNotifier> gcmNotifier;
    
    @Column(name = "BANNER_URL", nullable = true, length = 255)
    private String bannerUrl;

    @Column(name = "BANNER_IMAGE", nullable = true, length = 255)
    private String bannerImage;
}
