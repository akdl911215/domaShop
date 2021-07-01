package api.domashop.beta.user.service;

import api.domashop.beta.common.service.AbstractService;
import api.domashop.beta.security.domain.SecurityProvider;
import api.domashop.beta.user.domain.User;
import api.domashop.beta.user.domain.dto.UserDto;
import api.domashop.beta.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final SecurityProvider securityProvider;
    private final AuthenticationManager authenticationManager;

    @Transactional
    @Override
    public String signup(UserDto userDto) {
        log.info("Sign Up ServiceImpl 시작");

        User entity = dtoToEntity(userDto);
        userRepository.save(entity);

        return "Signup Success";
    }

    @Override
    public UserDto signin(UserDto uSerDto) {
        log.info("Sign In ServiceImpl 시작");

        User entity = dtoToEntity(uSerDto);
        userRepository.signin(entity.getUsername(), entity.getPassword());


        return null;
    }

    @Override
    public String save(User user) {
        userRepository.save(user);

        return (userRepository.save(user) != null) ? "Save Success":"Save Fail";
    }

    @Override
    public Optional<User> findById(Long id) {

        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Long count() {
        return userRepository.count();
    }

    @Override
    public Optional<User> getOne(Long id) {
        // .ofNullable = value가 null인 경우 비어있는 Optional을 반환
        return Optional.ofNullable(userRepository.getOne(id));
    }

    @Override
    public String delete(User user) {
        userRepository.delete(user);
        return userRepository.findById(user.getUserId()).orElse(null) == null ? "Suceess" : "Fail";
    }

    @Override
    public Boolean existsById(long id) {
        return userRepository.existsById(id);
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }


}
