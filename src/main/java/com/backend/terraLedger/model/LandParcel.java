package com.backend.terraLedger.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "land_parcels")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LandParcel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titleNumber;
    private String locationCoordinates;
    private Double sizeInHectares;

    @Lob
    private String metadataDescription;

    private String ownershipContractHash;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "landParcel", cascade = CascadeType.ALL)
    private List<OwnershipHistory> ownershipHistory;
}
