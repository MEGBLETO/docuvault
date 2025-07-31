package com.nelzer.docuvault.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "stored_files")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoredFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(nullable = false)
    private String originalFileName;

    @NonNull
    @Column(nullable = false, unique = true)
    private String storageKey;

    private String s3Url;
    private Long size;
    private String contentType;

    private LocalDateTime uploadedAt = LocalDateTime.now();

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}