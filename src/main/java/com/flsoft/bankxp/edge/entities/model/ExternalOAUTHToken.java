package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Richa Pokhrel
 */
@Getter
@Setter
@Entity
@Table(name = "EXTERNAL_OAUTH_TOKEN")
public class ExternalOAUTHToken implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CODE")
    private String code;
    @Column(name = "TOKEN")
    private String token;
    @Column(name = "REFRESH_TOKEN")
    private String refreshToken;
    @Column(name = "RECORDED_DATE")
    private Date recordedDate;
    @Column(name = "EXPIRY_DATE")
    private Date expiryDate;
//    @Column(name = "REFRESH_EXPIRY_DATE")
//    private Date refreshExpiryDate;
}
