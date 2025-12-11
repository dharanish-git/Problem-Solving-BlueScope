package com.security.jwt.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil{
	private final String secret="MySecretKeyforjwtloginis1234567890";
	private final long expiry=1000*60*60;
	public String generateToken(String Username) {
		return Jwts.builder()
				.setSubject(Username)
				.setIssuer("dharanish")
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+expiry))
				.signWith(Keys.hmacShaKeyFor(secret.getBytes()))
				.compact();
				}
	public String extractUsername(String token) {
		return Jwts.parserBuilder()
				.setSigningKey(secret.getBytes())
				.build()
				.parseClaimsJws(token)
				.getBody()
				.getSubject();
		
	}
	public boolean validateToken(String token) {
		try {
			Jwts.parserBuilder().setSigningKey(secret.getBytes()).build()
			.parseClaimsJws(token);
			return true;
		}
		catch (Exception E) {
			return false;
		}
	}
}
