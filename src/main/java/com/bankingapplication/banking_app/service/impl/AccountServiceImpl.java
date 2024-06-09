package com.bankingapplication.banking_app.service.impl;

import com.bankingapplication.banking_app.dto.AccountDto;
import com.bankingapplication.banking_app.entity.Account;
import com.bankingapplication.banking_app.mapper.AccountMapper;
import com.bankingapplication.banking_app.repository.AccountRepository;
import com.bankingapplication.banking_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {



    private AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount =  accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
