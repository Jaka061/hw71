package kg.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.
                inMemoryAuthentication()
                .withUser("admin").password("{noop}6767").roles("ADMIN").and()
                .withUser("user").password("{noop}5656").roles("USER").and()
                .withUser("login").password("{noop}4545").roles("USER").and()
                .withUser("moderator").password("{noop}6528").roles("MODERATOR");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/task").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,"/api/task").hasRole("USER")
                .antMatchers(HttpMethod.GET,"/api/task").hasRole("MODERATOR")
                .antMatchers(HttpMethod.POST,"/api/task").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/task").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/api/task").hasRole("MODERATOR")
                .antMatchers(HttpMethod.DELETE, "/api/task").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/api/check-admin ").hasRole("ADMIN")
                .antMatchers(HttpMethod.GET, "/api/check-user").hasRole("USER")
                .antMatchers(HttpMethod.GET, "/api/check-moder").hasRole("MODERATOR")
                .and().csrf().disable();
    }

}
