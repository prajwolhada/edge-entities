package com.flsoft.bankxp.edge.entities.model;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author  Samyak
 */
@Data
@Entity
@Table(name = "VENDOR_MESSAGE")
public class VendorMessage implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "MESSAGE_CODE")
    private String messageCode;
    @Column(name = "RESPONSE_CODE")
    private String responseCode;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "ACTIVE")
    private Character active;

}