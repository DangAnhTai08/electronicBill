package electronic.bill.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Table(name = "sale_user")
public class SaleUserEntity {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_email")
    private String userPhone;

    @Column(name = "user_address")
    private String userAddress;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_status")
    private Integer userStatus;

    @Column(name = "user_created")
    private Timestamp userCreated;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "sale_user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<SaleRoleEntity> roles = new HashSet<>();
}
