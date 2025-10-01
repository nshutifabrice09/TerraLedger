package com.backend.terraLedger.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "disputes")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dispute {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private LandParcel landParcel;


    @Enumerated(EnumType.STRING)
    private DisputeStatus status;

    @Lob
    private String description;

    private LocalDate openedDate;
    private LocalDate resolvedDate;

    @ManyToMany
    @JsonManagedReference
    private List<User> partiesInvolved;

    @OneToMany(mappedBy = "dispute", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Evidence> evidences;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LandParcel getLandParcel() {
        return landParcel;
    }

    public void setLandParcel(LandParcel landParcel) {
        this.landParcel = landParcel;
    }

    public DisputeStatus getStatus() {
        return status;
    }

    public void setStatus(DisputeStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(LocalDate openedDate) {
        this.openedDate = openedDate;
    }

    public LocalDate getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(LocalDate resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public List<User> getPartiesInvolved() {
        return partiesInvolved;
    }

    public void setPartiesInvolved(List<User> partiesInvolved) {
        this.partiesInvolved = partiesInvolved;
    }

    public List<Evidence> getEvidences() {
        return evidences;
    }

    public void setEvidences(List<Evidence> evidences) {
        this.evidences = evidences;
    }
}
