package com.bankingapplication.banking_app.service;


import com.bankingapplication.banking_app.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
}