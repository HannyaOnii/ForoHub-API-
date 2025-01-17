package com.aluracursos.challengeForoHub.infra.security;
import com.aluracursos.challengeForoHub.domain.usuarios.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Service
public class TokenService {

private String apiSecret;


    public String generarToken(Usuario usuario) {
        try{
            Algorithm algorithm = Algorithm.HMAC256(apiSecret);
            return JWT.create()
                    .withIssuer("forohubchallenge")
                    .withSubject(usuario.getLogin())
                    .withClaim("id", usuario.getId())
                    .withExpiresAt(generarFechaDeExpiracion())
                    .sign(algorithm);
        } catch (JWTCreationException exception){
            throw new RuntimeException();
        }
    }
    private Instant generarFechaDeExpiracion(){
    return LocalDateTime.now().plusHours(350).toInstant(ZoneOffset.of("-05.00"));
    }
}
