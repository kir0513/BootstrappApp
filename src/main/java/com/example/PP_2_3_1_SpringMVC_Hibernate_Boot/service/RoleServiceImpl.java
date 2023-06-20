package com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.service;

import com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.dao.RoleDao;
import com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.model.Role;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService{
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Set<Role> getAllRoles() {
       return roleDao.getAllRoles();
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
}
