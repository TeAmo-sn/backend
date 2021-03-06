package jp.co.nss.hrm.backend.api.dto;

import jp.co.nss.hrm.backend.model.ReagentAdmin;
import jp.co.nss.hrm.backend.model.ReagentResource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class AdminUserDetails implements UserDetails {
    private ReagentAdmin ReagentAdmin;
    private List<ReagentResource> resourceList;
    public AdminUserDetails(ReagentAdmin ReagentAdmin, List<ReagentResource> resourceList) {
        this.ReagentAdmin = ReagentAdmin;
        this.resourceList = resourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的角色
        return resourceList.stream()
                .map(role ->new SimpleGrantedAuthority(role.getId()+":"+role.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return ReagentAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return ReagentAdmin.getUsername();
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
        return ReagentAdmin.getStatus().equals(1);
    }
}
