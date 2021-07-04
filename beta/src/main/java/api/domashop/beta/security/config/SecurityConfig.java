package api.domashop.beta.security.config;

import api.domashop.beta.security.aop.SecurityFilter;
import api.domashop.beta.security.domain.SecurityProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


// SecurityConfigurerAdapter : SecurityConfigurer를 사용하고 구성중인 SecurityBuilder에 액세스 할 수 있도로 한다.
@RequiredArgsConstructor
public class SecurityConfig extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final SecurityProvider securityProvider;

    public void configure(HttpSecurity http) throws Exception {
        SecurityFilter securityFilter = new SecurityFilter(securityProvider);
        http.addFilterBefore(securityFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
