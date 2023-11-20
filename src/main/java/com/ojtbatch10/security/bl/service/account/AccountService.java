package com.ojtbatch10.security.bl.service.account;

import com.ojtbatch10.security.bl.dto.AccountDTO;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    void registerAccount(AccountDTO accountDTO);

    AccountDTO getAccountbyUsername(String username);
}
