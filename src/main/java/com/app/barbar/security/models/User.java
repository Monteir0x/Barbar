package com.app.barbar.security.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email"),
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_user", nullable = false)
    private Long id;
    @NotBlank
    @Size(max = 20)
    private String username;
    @NotBlank
    @Size(max = 120)
    private String password;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    private User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }

    //#region Getters & Setters
    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    //#endregion
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
