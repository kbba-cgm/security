package com.ojtbatch10.security.persistence.repository.account;

import com.ojtbatch10.security.persistence.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query(value = "select * from account where username = :username", nativeQuery = true)
    Account findByUsername(String username);
}
