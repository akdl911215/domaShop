package api.domashop.beta.businessLicense.domain.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessLicenseDto {

    private Long businessLicenseId;
    private String title;
    private String content;
    private String writer;
    private String password;

}
