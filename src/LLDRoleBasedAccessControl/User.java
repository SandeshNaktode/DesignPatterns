package LLDRoleBasedAccessControl;

import java.util.HashSet;
import java.util.Set;

class User {
    private String userId;
    private String name;
    private Set<Role> roles;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.roles = new HashSet<>();
    }

    public void assignRole(Role role) {
        roles.add(role);
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getUserId() {
        return userId;
    }
}

