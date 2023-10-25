package com.flsoft.bankxp.edge.entities.model;

import com.flsoft.bankxp.edge.entities.converter.SecurityQuestionAnswerEncryptConverter;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author rashim
 */
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER_SECURITY_ANSWER")
public class CustomerSecurityAnswer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, precision = 22)
    private Long id;

    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne()
    private Customer customer;

    @JoinColumn(name = "SECURITY_QUESTION_ID", nullable = false)
    @ManyToOne()
    private SecurityQuestion securityQuestion;

    @Convert(converter = SecurityQuestionAnswerEncryptConverter.class)
    @Column(name = "ANSWER", nullable = false, length = 100)
    private String answer;

    @Column(name = "LAST_MODIFIED_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Basic(optional = false)
    @Column(name = "ACTIVE", nullable = false, length = 100)
    private String active;

}
