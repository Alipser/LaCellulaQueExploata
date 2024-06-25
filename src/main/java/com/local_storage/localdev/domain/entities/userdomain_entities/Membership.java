package com.local_storage.localdev.domain.entities.userdomain_entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "memberships")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private String id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "description", nullable = true)
    private String description;

}
