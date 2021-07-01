package api.domashop.beta.user.repository;

import api.domashop.beta.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from users where username=:username and password=:password", nativeQuery = true)
    User signin(@Param("username") String username, @Param("password")String password);

    Optional<User> findByUsername(@Param("username") String username);
}
