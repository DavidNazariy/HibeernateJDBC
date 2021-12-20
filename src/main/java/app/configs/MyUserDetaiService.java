//package app.configs;
//
//import app.dao.User;
//import app.repository.user.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(userName);
//        return getByUser(user);
//    }
//
//    private Principle getByUser(User user) {
//        return new Principle(user.getName(), user.getAdult(), user.getEmail(), user.getPassword(), user.getAge(), user.getRole());
//    }
//
////    private UserDetails buildUserForAuthentication(User user, List<SimpleGrantedAuthority> authorities) {
////        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
////                true, true, true, true, authorities);
////    }
//}
//
