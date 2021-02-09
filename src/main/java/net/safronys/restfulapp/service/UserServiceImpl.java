package net.safronys.restfulapp.service;

import lombok.extern.slf4j.Slf4j;
import net.safronys.restfulapp.model.User;
import net.safronys.restfulapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Long id) {
        log.info("IN UserServiceImpl getById {}", id);
        return userRepository.getOne(id);
    }

    @Override
    public void save(User user) {
        log.info("IN UserServiceImpl save {}", user);
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        log.info("IN UserServiceImpl delete {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        log.info("IN UserServiceImpl getAll ");
        return userRepository.findAll();
    }
}
