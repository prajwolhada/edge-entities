package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author <krishna.pandey@f1soft.com>
 */

@Getter
@Setter
@Entity
@Table(name = "REVERSAL_CHANNEL")
@NamedQueries({
        @NamedQuery(name = "ReversalChannel.findByCode", query = "SELECT t FROM ReversalChannel t WHERE t.code = :code and t.active = 'Y'")})
public class ReversalChannel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "CHANNEL_CODE")
    private String code;
    @Column(name = "CHANNEL_NAME")
    private String name;
    @OneToMany(mappedBy = "reversalChannel", fetch = FetchType.EAGER)
    private List<ReversalChannelService> reversalChannelServices;
}
