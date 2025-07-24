package LLDRoleBasedAccessControl;

import LLDRoleBasedAccessControl.Enums.PermissionType;

public class AccessControlService {
    public boolean checkAccess(User user, String resource, PermissionType permissionType) {
        for (Role role : user.getRoles()) {
            for (Permission permission : role.getPermissions()) {
                if (permission.getResource().equals(resource)
                        && permission.getPermissionType().equals(permissionType)) {
                    return true;
                }
            }
        }
        return false;
    }
}
