package com.ojtbatch10.security.bl.dto;

import com.ojtbatch10.security.persistence.entity.Account;
import com.ojtbatch10.security.web.form.AccountForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    private String username;
    private String email;
    private String password;

    public AccountDTO(Account account) {
        this.username = account.getUsername();
        this.email = account.getEmail();
        this.password = account.getPassword();
    }

    public AccountDTO(AccountForm accountForm) {
        this.username = accountForm.getUsername();
        this.email = accountForm.getEmail();
        this.password = accountForm.getPassword();
    }
}
