package api.domashop.beta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Spring Audit 기능 추가 : 모든 엔티티에 공통으로 사용될 등록일시, 수정일시 기록
public class BetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaApplication.class, args);
	}

}
