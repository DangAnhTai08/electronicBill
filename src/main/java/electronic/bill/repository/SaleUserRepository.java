package electronic.bill.repository;

import electronic.bill.entity.SaleUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SaleUserRepository extends JpaRepository<Integer, SaleUserEntity> {

    Optional<SaleUserEntity> findByUserName(String username);
}
