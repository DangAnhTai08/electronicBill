package electronic.bill.user;

import electronic.bill.constant.UserActive;
import electronic.bill.entity.SaleRoleEntity;
import electronic.bill.entity.SaleUserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CustomUserDetails implements UserDetails {

    private SaleUserEntity saleUserEntity;

    public CustomUserDetails(SaleUserEntity saleUserEntity) {
        this.saleUserEntity = saleUserEntity;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<SaleRoleEntity> roleEntitySet = saleUserEntity.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        for (SaleRoleEntity saleRole : roleEntitySet) {
            authorities.add(new SimpleGrantedAuthority(saleRole.getRoleName()));
        }

        return authorities;
    }

    @Override
    public String getPassword() {
        return saleUserEntity.getUserPassword();
    }

    @Override
    public String getUsername() {
        return saleUserEntity.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return saleUserEntity.getUserStatus() == UserActive.USER_ACTIVE.getStatus();
    }
}
