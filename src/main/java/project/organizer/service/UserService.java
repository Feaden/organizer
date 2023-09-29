package project.organizer.service;

import project.organizer.data.User;

public interface UserService {
    User getById(Long id);
    User getByEmail(String email);
    User saveOrUpdate(User user);
    void delete(User user);
}
