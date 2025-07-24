package LLDRoleBasedAccessControl;

import LLDRoleBasedAccessControl.Enums.PermissionType;
import LLDRoleBasedAccessControl.Enums.UserType;

public class RBACMain {

    private static final String FILE = "FILE";

    public static void main(String[] args) {
        User user = new User("U1", "Alice");
        Role adminRole = new Role("R1", UserType.ADMIN);

        adminRole.addPermission(new Permission(FILE, PermissionType.READ));
        adminRole.addPermission(new Permission(FILE, PermissionType.WRITE));

        user.assignRole(adminRole);

        AccessControlService acs = new AccessControlService();

        System.out.println(acs.checkAccess(user, FILE, PermissionType.READ));  // true
        System.out.println(acs.checkAccess(user, FILE, PermissionType.DELETE));  // false
    }
}
