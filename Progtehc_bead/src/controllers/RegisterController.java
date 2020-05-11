//Regisztráció

package com.controllers;

import com.models.Models.RegisterModel;
import com.models.db_models.Users;
import com.views.RegisterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Logger;
 
public class RegisterController {
    private static final Logger LOGGER = Logger.getLogger(RegisterController.class.getName());

    private RegisterView view;
    private RegisterModel model;

    public RegisterController(RegisterView view, RegisterModel model) {
        this.view = view;
        this.model = model;

        view.setRegisterActionListener(new RegisterListener());
    }

    class RegisterListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Users user = new Users(
                            view.getUsername(),
                            view.getPassword(),
                            view.getEmail(),
                            view.getFirstName(),
                            view.getLastName(),
                            view.getAddress()
                    );
                    model.register(user);
                    LOGGER.info("Új felhasználó: " + user.getUsername() + "-névvel sikeresen registrálva");
                    view.setResult("Sikeres regisztráció.");

            } catch (SQLException e1) {
                LOGGER.info("A regisztráció nem sikerült, mert: " + e1.getMessage());
                view.setResult("Sikertelen regisztráció.");
            } catch (ClassNotFoundException e1) {
            }

        }
    }
}
