package com.ojtbatch10.security.web.form;

import com.ojtbatch10.security.bl.dto.AccountDTO;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountForm {
    private String username;
    private String email;
    private String password;

    public AccountForm(AccountDTO accountDTO) {
        this.username = accountDTO.getUsername();
        this.email = accountDTO.getEmail();
        this.password = accountDTO.getPassword();
    }
}
