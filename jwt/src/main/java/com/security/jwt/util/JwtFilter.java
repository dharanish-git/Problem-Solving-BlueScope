package com.security.jwt.util;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class JwtFilter implements Filter{
	private final JwtUtil jwtutil;
	public JwtFilter(JwtUtil jwtutil) {
		this.jwtutil=jwtutil;
	}
	
	@Override
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException {
		  HttpServletRequest req = (HttpServletRequest) request;
	        String header = req.getHeader("Authorization");

	        if (header != null && header.startsWith("Bearer ")) {
	            String token = header.substring(7);
	            if (jwtutil.validateToken(token)) {
	                String username = jwtutil.extractUsername(token);

	                UsernamePasswordAuthenticationToken auth =
	                        new UsernamePasswordAuthenticationToken(username, null, null);

	                auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(req));

	                SecurityContextHolder.getContext().setAuthentication(auth);
	            }
	        }
	        chain.doFilter(request, response);
		
	}
	
}