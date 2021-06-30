package api.domashop.beta.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class User {

    // JPA는 직접할당과 자동생성으로 기본키를 매핑
    @Id // 직접할당
    @GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY : 데이터베이스에 위임(MYSQL)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "companyName", nullable = false)
    private String companyName;

    @Column(name = "companyNumber", nullable = false)
    private String companyNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "phoneNumber")
    private String phoneNumber;

//    @ElementCollection(fetch = FetchType.EAGER)
//    List<Role> roles;
}
