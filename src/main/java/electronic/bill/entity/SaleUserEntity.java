package electronic.bill.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

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
    private String userStatus;

    @Column(name = "user_created")
    private Timestamp userCreated;
}
