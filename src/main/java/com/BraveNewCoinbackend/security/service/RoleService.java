package com.BraveNewCoinbackend.security.service;

import com.BraveNewCoinbackend.security.entity.Role;
import com.BraveNewCoinbackend.security.enums.RoleName;
import com.BraveNewCoinbackend.security.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRolName(RoleName roleName){
        return roleRepository.findByRolName(roleName);
    }

    public void save(Role role){
        roleRepository.save(role);
    }
}
