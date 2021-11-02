/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thuypm.demo.helper;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.*;
import com.thuypm.demo.dto.UserDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author THUY PHAM
 */
@Component
public class JWTUtils {
    @Value("demo.app.jwtSecret")
    private String jwtSecret;
    @Value("demo.app.jwtExpirationMs")
    private int jwtExpiration;

    public String generateToken(UserDto user) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + this.jwtExpiration);

        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, this.jwtSecret)
                .compact();
    }

    public String getUsernameFromJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(this.jwtSecret)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(this.jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (MalformedJwtException ex) {

        } catch (ExpiredJwtException ex) {

        } catch (UnsupportedJwtException ex) {

        } catch (IllegalArgumentException ex) {

        }
        return false;
    }

}
