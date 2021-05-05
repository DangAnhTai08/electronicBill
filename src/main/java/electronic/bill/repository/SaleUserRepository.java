package electronic.bill.repository;

import electronic.bill.entity.SaleUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleUserRepository extends JpaRepository<Integer, SaleUserEntity> {

    SaleUserEntity findByUserName(String username);
}
