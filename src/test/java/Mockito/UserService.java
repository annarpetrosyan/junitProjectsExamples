package Mockito;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username, String email) {
        if (userRepository.findByUsername(username) == null) {
            User newUser = new User();
            newUser.setUsername(username);
            newUser.setEmail(email);
            userRepository.save(newUser);
        } else {
            throw new IllegalArgumentException("Username already exists");
        }
    }
}
