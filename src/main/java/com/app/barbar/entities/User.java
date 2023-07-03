package com.app.barbar.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_user", nullable = false)
    private Long id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private Role role;

    public User() {
    }

    private User(Long id, String name, String password, String email, String phone, String address, Role role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }
    public User.UserBuilder builder(){
        return new UserBuilder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Role getRole() {
        return role;
    }

    public static final class UserBuilder{
        private Long id;
        private String name;
        private String password;
        private String email;
        private String phone;
        private String address;
        private Role role;

        public UserBuilder(){}
        public static UserBuilder builder(){
            return new UserBuilder();
        }
        public UserBuilder id(Long id){
            this.id= id;
            return this;
        }
        public UserBuilder name(String name){
            this.name = name;
            return this;
        }
        public UserBuilder password(String password){this.password = password;
        return this;}
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        public UserBuilder role(Role role){
            this.role = role;
            return this;
        }

        public User build(){
           return new User(id,name,password, email, phone, address, role);
        }
    }

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
