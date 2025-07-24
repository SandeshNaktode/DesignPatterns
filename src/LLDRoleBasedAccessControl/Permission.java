package LLDRoleBasedAccessControl;

import LLDRoleBasedAccessControl.Enums.PermissionType;

import java.util.Objects;

public class Permission {
    private String resource;
    private PermissionType permissionType; // e.g., "READ", "WRITE", "DELETE"

    public Permission(String resource, PermissionType permissionType) {
        this.resource = resource;
        this.permissionType = permissionType;
    }

    public String getResource() {
        return resource;
    }

    public PermissionType getPermissionType() {
        return permissionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Permission that)) return false;
        return resource.equals(that.resource) && permissionType.equals(that.permissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, permissionType);
    }
}
