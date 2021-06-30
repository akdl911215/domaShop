package api.domashop.beta.businessLicense.domain;

import api.domashop.beta.common.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "business_license")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessLicense extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_license_id", unique = true, nullable = false)
    private Long businessLicenseId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "wrtier")
    private String writer;

    @Column(name = "password")
    private String password;
}
