package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "CHANNEL")
public class Channel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVE", length = 1)
    private Character active;
    @Column(name = "CHANNEL_NAME", length = 50)
    private String channelName;
    @Column(name = "CODE", length = 20)
    private String code;
    @Column(name = "NARRATION_CODE")
    private String narrationCode;

    public Channel() {
    }

    public Channel(Long id) {
        this.id = id;
    }

}
