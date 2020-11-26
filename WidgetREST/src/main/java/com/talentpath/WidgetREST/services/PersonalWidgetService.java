package com.talentpath.WidgetREST.services;

import com.talentpath.WidgetREST.daos.PersonalWidgetRepository;
import com.talentpath.WidgetREST.daos.UserRepository;
import com.talentpath.WidgetREST.models.PersonalWidget;
import com.talentpath.WidgetREST.models.Role;
import com.talentpath.WidgetREST.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalWidgetService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    PersonalWidgetRepository repo;

    public List<PersonalWidget> getAllWidgetsFor(String name) {

        User currentUser = userRepo.findByUsername(name).get();


        currentUser.getRoles().stream().forEach( r-> System.out.println(r.getName()) );
        //not working?!??????????
        //it's an enum not a string, stupid...

        boolean isAdmin = currentUser.getRoles()
                .stream()
                .anyMatch(
                    roleToCheck -> roleToCheck.getName() == Role.RoleName.ROLE_ADMIN);

        //boolean isAdmin = currentUser.getRoles().stream().filter( r->r.getName().equals("ROLE_ADMIN") ).findAny().isPresent();

       // boolean isAdmin = false;

//        Role[] allRoles = currentUser.getRoles().toArray( new Role[currentUser.getRoles().size()]);
//
//        for( int i = 0; i < allRoles.length; i++ ){
//            if( allRoles[i].)
//        }






        if( isAdmin ){
            return repo.findAll();
        } else {
            return repo.findAllByAssociatedUser_Id( currentUser.getId() );
        }

    }

    public PersonalWidget getWidgetByIdFor(Integer id, String name) {
        throw new UnsupportedOperationException();
    }

    public PersonalWidget addWidgetFor(PersonalWidget toAdd, String name) {
        throw new UnsupportedOperationException();

    }

    public PersonalWidget editWidgetFor(PersonalWidget updated, String name) {
        throw new UnsupportedOperationException();

    }
}
