//package app.configs;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    private MyUserDetailsService userDetailsService;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(userDetailsService)
//                .passwordEncoder(bCryptPasswordEncoder);
//    }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/home").permitAll()
//                .antMatchers("/register").permitAll()
//                .antMatchers("/file/**").permitAll()
//                .antMatchers("/test/**").permitAll()
//                .antMatchers("/admin/**").hasAuthority("ADMIN").anyRequest()
//                .authenticated().and().csrf().disable().formLogin()
//                .loginPage("/login")
//                .failureUrl("/login?error=true")
//                .defaultSuccessUrl("/home")
//                .usernameParameter("user_name")
//                .passwordParameter("password")
//                .and().logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/login").and().exceptionHandling()
//                .accessDeniedPage("/access-denied");
//    }
//
//    @Override
//    public void configure(WebSecurity web)  {
//        web
//                .ignoring()
//                .antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");
//    }
//}
