package com.backend.terraLedger.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonManagedReference
    private List<OwnershipHistory> ownershipHistory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleNumber() {
        return titleNumber;
    }

    public void setTitleNumber(String titleNumber) {
        this.titleNumber = titleNumber;
    }

    public String getLocationCoordinates() {
        return locationCoordinates;
    }

    public void setLocationCoordinates(String locationCoordinates) {
        this.locationCoordinates = locationCoordinates;
    }

    public Double getSizeInHectares() {
        return sizeInHectares;
    }

    public void setSizeInHectares(Double sizeInHectares) {
        this.sizeInHectares = sizeInHectares;
    }

    public String getMetadataDescription() {
        return metadataDescription;
    }

    public void setMetadataDescription(String metadataDescription) {
        this.metadataDescription = metadataDescription;
    }

    public String getOwnershipContractHash() {
        return ownershipContractHash;
    }

    public void setOwnershipContractHash(String ownershipContractHash) {
        this.ownershipContractHash = ownershipContractHash;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<OwnershipHistory> getOwnershipHistory() {
        return ownershipHistory;
    }

    public void setOwnershipHistory(List<OwnershipHistory> ownershipHistory) {
        this.ownershipHistory = ownershipHistory;
    }
}
