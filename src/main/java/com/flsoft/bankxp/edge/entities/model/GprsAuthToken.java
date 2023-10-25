package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "GPRS_AUTH_TOKEN")
public class GprsAuthToken implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "USER_ID", nullable = false, precision = 22)
    private Long userId;
    @Column(name = "ACTIVE", nullable = false)
    private char active;
    @Column(name = "CREATED_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "LAST_ACCESSED_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAccessedTime;
    @Column(name = "TOKEN", nullable = false, columnDefinition = "TEXT")
    private String token;
    @Column(name = "REFRESH_TOKEN", columnDefinition = "TEXT")
    private String refreshToken;
    @Column(name = "AUDIENCE")
    private String audience;
    @Column(name = "REFRESH")
    private char refresh;

    public GprsAuthToken() {
    }

    public GprsAuthToken(Long id) {
        this.id = id;
    }
}