package com.ojtbatch10.security.bl.service.login;

import com.ojtbatch10.security.bl.dto.AccountDTO;
import com.ojtbatch10.security.bl.dto.AuthUser;
import com.ojtbatch10.security.bl.service.account.AccountService;
import com.ojtbatch10.security.persistence.entity.Account;
import com.ojtbatch10.security.persistence.repository.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {
//    @Autowired
//    AccountRepository accountRepository;

    @Autowired
    AccountService accountService;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        try{
//            Account account = accountRepository.findByUsername(username);
            // email -> user one
            AccountDTO accountDTO = accountService.getAccountbyEmail(email);
            return new AuthUser(accountDTO);
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
