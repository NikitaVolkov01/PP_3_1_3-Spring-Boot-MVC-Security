package ru.volkov.spring.boot_security.demo.services;

import ru.volkov.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    Role getRoleByName(String role);

    Role getRoleById(Long id);

    void addRole(Role role);
}
