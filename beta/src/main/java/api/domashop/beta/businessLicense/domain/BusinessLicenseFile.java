package api.domashop.beta.businessLicense.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "business_license_file")
public class BusinessLicenseFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_license_file_id")
    private Long businessLicenseFileId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "img_name")
    private String imgName;

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_license_id")
    private BusinessLicense businessLicense;
}
