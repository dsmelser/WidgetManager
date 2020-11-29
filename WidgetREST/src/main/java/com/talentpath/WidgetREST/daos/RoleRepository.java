package com.talentpath.WidgetREST.daos;

import com.talentpath.WidgetREST.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName( Role.RoleName name );

}
