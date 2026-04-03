package com.strucify.projects.Lovable_clone.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String passwordHash;
    String avatarUrl;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

    @Override
    public int hashCode() {
        return  getClass().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof User user)) return false;
        return id != null && id.equals(user.id);
    }
}
