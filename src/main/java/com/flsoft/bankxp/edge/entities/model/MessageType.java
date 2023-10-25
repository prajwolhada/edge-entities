package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author yogesh
 */
@Getter
@Setter
@Entity
@Table(name = "MESSAGE_TYPE")
@SqlResultSetMapping(name = "smsReceivedTypeNCount",
        entities =
        @EntityResult(entityClass = MessageType.class),
        columns = {
                @ColumnResult(name = "NtcCount"),
                @ColumnResult(name = "NcellCount")})
public class MessageType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;
    @Basic(optional = false)
    @Column(name = "TYPE", nullable = false, length = 50)
    private String type;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION", nullable = false, length = 200)
    private String description;
    @OneToMany(mappedBy = "messageType", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<MessageFormat> messageFormatCollection;
    @Transient
    private int count;
    @Transient
    private int ntcCount;
    @Transient
    private int ncellCount;

    public MessageType() {
    }

    public MessageType(Long id) {
        this.id = id;
    }
}