package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {

    void save(User user);

    List<User> listUsers();

    User getById(Long id);

    void delete(Long id);

    void update(Long id, User user);
}
