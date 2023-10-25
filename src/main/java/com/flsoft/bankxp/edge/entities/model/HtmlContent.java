package com.flsoft.bankxp.edge.entities.model;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

/**
 * @author Rashim Dhaubanjar
 */
@Getter
@Setter
@Entity
@Table(name = "HTML_CONTENT")
public class HtmlContent extends AbstractAuditor {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 19, scale = 0)
    private Long id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "CONTENT", nullable = false, columnDefinition = "TEXT")
    private String content;

}