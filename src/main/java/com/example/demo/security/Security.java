package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {

    @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/* add {noop} when dont use PasswordEncoder Ej password("{noop}admin123") */
		auth.inMemoryAuthentication()
			.withUser("admin").password(passwordEncoder().encode("D@rkNight87")).roles("ADMIN") // admin
			.and()
			.withUser("api").password(passwordEncoder().encode("JNubs8!YS")).roles("USER")
		;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/* .antMatchers(HttpMethod.GET, "/ApiLogin/**").hasRole("ADMIN") */
		http.cors()
		.and()
		.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/actuator/**").permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.csrf()
		.disable()
		.formLogin().disable();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(Boolean.valueOf(true));
		// corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.addAllowedOriginPattern("*");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfiguration);
		return (CorsConfigurationSource) source;
	}
    
}
