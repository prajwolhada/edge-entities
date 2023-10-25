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
@Table(name = "EDITED_LOGIN_ACCESS_CHANNEL")
public class EditedLoginAccessChannel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "ACCESSIBLE_CHANNEL_ID", nullable = true)
    private Long accessibleChannelId;
    @Column(name = "LOGIN_ACCESS_CHANNEL_ID", nullable = true)
    private Long loginAccessChannelId;
    @JoinColumn(name = "EDITED_CUSTOMER_LOGIN_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private EditedCustomerLogin editedCustomerLogin;
    @Column(name = "EDITED_LOGIN_CHANNEL")
    private String editedLoginChannel;

}
