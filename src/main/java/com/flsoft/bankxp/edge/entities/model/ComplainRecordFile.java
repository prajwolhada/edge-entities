package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "COMPLAIN_RECORD_IMAGE")
public class ComplainRecordFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, precision = 38, scale = 0)
    private Long id;
    @Column(name = "FILE_NAME")
    private String name;
    @ManyToOne()
    @JoinColumn(name = "COMPLAIN_RECORD_ID")
    private ComplainRecord complainRecord;


}
