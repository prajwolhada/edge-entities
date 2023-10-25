package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "CHANNEL_TYPE")
public class ChannelType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "CHANNEL_NAME", length = 20)
    private String channelName;
    @Column(name = "CHANNEL_ABBREVIATION")
    private String channelAbbreviation;

    public ChannelType() {
    }

    public ChannelType(Long id) {
        this.id = id;
    }

}
