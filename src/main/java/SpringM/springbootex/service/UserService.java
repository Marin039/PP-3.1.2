package SpringM.springbootex.service;



import SpringM.springbootex.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUser(Long id);
    public void save(User user);
    public void delete(Long id);
    public void update(User user);
}
