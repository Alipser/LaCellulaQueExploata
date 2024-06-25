package com.local_storage.localdev.domain.entities.userdomain_entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone", nullable = true)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id",nullable = false)
    private Role role;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(
        mappedBy = "user",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    private List<Subscriptions> subscriptions;

}