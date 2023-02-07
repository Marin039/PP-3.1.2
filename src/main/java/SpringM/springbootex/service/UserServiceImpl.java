package SpringM.springbootex.service;

import SpringM.springbootex.dao.UserDao;
import SpringM.springbootex.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override

    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }
}
