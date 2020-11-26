package com.talentpath.WidgetREST.daos;

import com.talentpath.WidgetREST.models.PersonalWidget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalWidgetRepository extends JpaRepository<PersonalWidget, Integer> {
    List<PersonalWidget> findAllByAssociatedUser_Id(Integer id );

}
