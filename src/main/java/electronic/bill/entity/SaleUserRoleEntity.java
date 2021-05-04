package electronic.bill.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@Table(name = "sale_user_role")
public class SaleUserRoleEntity {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "role_id")
    private int roleId;
}
