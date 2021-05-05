package electronic.bill.service;

import electronic.bill.entity.SaleUserEntity;
import electronic.bill.repository.SaleUserRepository;
import electronic.bill.user.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Objects;

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SaleUserRepository saleUserRepository;

    public UserDetailServiceImpl() {
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SaleUserEntity userEntity = saleUserRepository.findByUserName(username);

        if (Objects.isNull(userEntity))
            throw new UsernameNotFoundException("Could not find user");

        return new CustomUserDetails(userEntity);
    }
}
