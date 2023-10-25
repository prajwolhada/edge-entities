package com.flsoft.bankxp.edge.entities.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author root
 */
@Getter
@Setter
@Entity
@Table(name = "EDITED_CUSTOMER")
public class EditedCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "ADDRESS", length = 150)
    private String address;
    @Column(name = "CONTACT_NO", length = 15)
    private String contactNo;
    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;
    @Column(name = "MIDDLE_NAME", length = 50)
    private String middleName;
    @Column(name = "LAST_NAME", length = 50)
    private String lastName;
    @Column(name = "GENDER", length = 2)
    private String gender;
    @Column(name = "EMAIL_ADDRESS", length = 100)
    private String emailAddress;
    @Column(name = "ACTIVE")
    private Character active;
    @Column(name = "STATUS", nullable = false)
    private Character status;
    @Column(name = "CUSTOMER_TYPE_ID")
    private Integer customerTypeId;
    @Column(name = "CHANNEL_PROFILE_ID")
    private Long channelProfileId;
    @Column(name = "MOBILE_NUMBER", length = 15)
    private String mobileNumber;
    @Column(name = "CUSTOMER_ID")
    private Long customerId;
    @Column(name = "BRANCH_ID")
    private Long branchId;
    @Column(name = "CBS_ID", length = 50)
    private String cbsId;
    @Column(name = "RECORDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordedDate;
    @Column(name = "PROFILE_ID")
    private Long profileId;
    @OneToMany(mappedBy = "editedCustomer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<EditedCustomerBankAccount> editedCustomerBankAccountList;
    @OneToMany(mappedBy = "editedCustomer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<EditedCustomerModuleProfile> editedCustomerModuleProfileList;
    @OneToMany(mappedBy = "editedCustomer", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<EditedCustomerLogin> EditedCustomerLoginList;


    public EditedCustomer() {
    }

    public EditedCustomer(Long id) {
        this.id = id;
    }

    public String getFullname() {
        StringBuilder fullName = new StringBuilder(firstName);
        if (middleName != null) {
            fullName.append(" ").append(middleName).append(" ").append(lastName);
        } else {
            fullName.append(" ").append(lastName);
        }
        return fullName.toString();
    }

}