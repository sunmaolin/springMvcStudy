package mapper;

import org.springframework.stereotype.Repository;
import pojo.Role;

@Repository
public interface RoleMapper {

    Role getRole(int roleId);

}
