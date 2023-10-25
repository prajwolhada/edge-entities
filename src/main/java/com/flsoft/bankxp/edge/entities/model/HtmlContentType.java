package com.flsoft.bankxp.edge.entities.model;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Rashim Dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "HTML_CONTENT_TYPE")
public class HtmlContentType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "TYPE")
    private String type;
}