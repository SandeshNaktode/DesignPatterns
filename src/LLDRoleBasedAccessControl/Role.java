package LLDRoleBasedAccessControl;

import LLDRoleBasedAccessControl.Enums.UserType;

import java.util.HashSet;
import java.util.Set;

class Role {
    private String roleId;
    private UserType userType;
    private Set<Permission> permissions;

    public Role(String roleId, UserType userType) {
        this.roleId = roleId;
        this.userType = userType;
        this.permissions = new HashSet<>();
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public UserType getUserType() {
        return userType;
    }
}

