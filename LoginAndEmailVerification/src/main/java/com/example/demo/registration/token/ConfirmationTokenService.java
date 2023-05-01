package com.example.demo.registration.token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepostiory;

    public void saveConfirmaionToken(ConfirmationToken token) {
        confirmationTokenRepostiory.save(token);
    }

    public Optional<ConfirmationToken> getToken(String token) {
        return confirmationTokenRepostiory.findByToken(token);
    }

    public int setConfirmedAt(String token) {
        return confirmationTokenRepostiory.updateConfirmedAt(
                token, LocalDateTime.now());
    }
}
