package com.local_storage.localdev.domain.entities.userdomain_entities;


import java.math.BigInteger;
import java.time.LocalDate;

import com.local_storage.localdev.utils.StatusType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "subscritions")
@Builder
public class Subscriptions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private BigInteger id;

    private LocalDate purchaseDate;

    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "membership_id", referencedColumnName = "id")
    private Membership membership;

    private StatusType status;

}
