package com.ojtbatch10.security.bl.dto;

import com.ojtbatch10.security.persistence.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthUser implements UserDetails {
    private String username;
    private String email;
    private String password;
    private String role;

    public AuthUser(Account account){
        this.username = account.getUsername();
        this.email = account.getEmail();
        this.password = account.getPassword();
        this.role = account.getRole();
    }

    public AuthUser(AccountDTO accountDTO){
        this.username = accountDTO.getUsername();
        this.email = accountDTO.getEmail();
        this.password = accountDTO.getPassword();
        this.role = accountDTO.getRole();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority(this.role));
        return authorityList;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
