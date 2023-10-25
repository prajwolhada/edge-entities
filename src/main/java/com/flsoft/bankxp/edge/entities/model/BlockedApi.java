package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Prajwol Hada
 */
@Getter
@Setter
@Entity
@Table(name = "BLOCKED_API")
public class BlockedApi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE", nullable = false)
    private char active;
    @Column(name = "REQUEST_PATH", nullable = false)
    private String requestPath;
    @Column(name = "REQUEST_METHOD", nullable = false)
    private String requestMethod; //GET, POST
    @Column(name = "CHANNEL", nullable = false)
    private String channel; //MOBILE, WEB, ALL
}
