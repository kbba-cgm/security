package com.ojtbatch10.security.bl.service.account.Impl;

import com.ojtbatch10.security.bl.dto.AccountDTO;
import com.ojtbatch10.security.bl.service.account.AccountService;
import com.ojtbatch10.security.persistence.entity.Account;
import com.ojtbatch10.security.persistence.repository.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    AccountRepository accountRepository;
    @Override
    public void registerAccount(AccountDTO accountDTO) {
        var account = new Account(accountDTO);
        account.setPassword(encoder.encode(account.getPassword()));
        account.setRole("ADMIN");
        accountRepository.save(account);
    }

    @Override
    public AccountDTO getAccountbyUsername(String username) {
        Account account = accountRepository.findByUsername(username);
        return new AccountDTO(account);
    }

    @Override
    public AccountDTO getAccountbyEmail(String email) {
        Account account = accountRepository.findByEmail(email);
        return new AccountDTO(account);
    }
}
