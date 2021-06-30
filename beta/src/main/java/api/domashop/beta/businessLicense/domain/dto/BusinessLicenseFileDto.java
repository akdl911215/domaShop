package api.domashop.beta.businessLicense.domain.dto;

import api.domashop.beta.businessLicense.domain.BusinessLicense;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusinessLicenseFileDto {

    private Long businessLicenseFileId;
    private String uuid;
    private String imgName;
    private String path;
    private BusinessLicense businessLicense;

}
