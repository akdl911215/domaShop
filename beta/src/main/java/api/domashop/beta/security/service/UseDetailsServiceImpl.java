package api.domashop.beta.security.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // 초기화되지 않은 final 필드나, @Nonnull 이 붙은 필드에 대해 생성자를 생성
public class UseDetailsServiceImpl implements UserDetailsService {

    private final

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
