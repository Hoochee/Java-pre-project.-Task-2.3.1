package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }
    @Transactional
    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return repository.listUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void delete(Long id) {

    }
}
