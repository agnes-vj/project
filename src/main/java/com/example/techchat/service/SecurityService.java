package com.example.techchat.service;

/** method for finding already added user ! */
public interface SecurityService {
    /** {@inheritDoc}} ! */
    String findLoggedInUsername();

    void autologin(String username, String password);
}
