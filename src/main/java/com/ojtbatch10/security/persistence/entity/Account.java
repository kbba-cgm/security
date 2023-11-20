package com.ojtbatch10.security.persistence.entity;

import com.ojtbatch10.security.bl.dto.AccountDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity(name = "\'user\'") limit
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;

    public Account(AccountDTO accountDTO) {
        this.username = accountDTO.getUsername();
        this.email = accountDTO.getEmail();
        this.password = accountDTO.getPassword();
    }
}
