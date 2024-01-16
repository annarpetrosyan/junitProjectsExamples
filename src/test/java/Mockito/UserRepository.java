package Mockito;

public interface UserRepository {

    User findByUsername(String username);
    void save(User user);
}
