package com.corhuila11.electiva111.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state", nullable = false)
    private Boolean state;

    @Schema(description = "Fecha de creación del dato", example = "")
    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    @Schema(description = "Fecha de actualización del dato", example = "")
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Schema(description = "Fecha de eliminación del dato", example = "")
    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }
}
