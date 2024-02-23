package codefinity.service.impl;

import codefinity.dao.RoleDao;
import codefinity.dao.impl.RoleDaoImpl;
import codefinity.model.Role;
import codefinity.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao = new RoleDaoImpl();

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getById(int id) {
        return roleDao.getById(id);
    }

    @Override
    public List<Role> getAll() {
        return roleDao.getAll();
    }

    @Override
    public Role updateRole(int id, Role newRole) {
        return roleDao.updateRole(id, newRole);
    }
}
