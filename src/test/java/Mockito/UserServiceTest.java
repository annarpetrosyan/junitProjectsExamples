package Mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testRegisterUser() {
        UserRepository userRepositoryMock = mock(UserRepository.class);

        UserService userService = new UserService(userRepositoryMock);


        when(userRepositoryMock.findByUsername("existing")).thenReturn(new User());
        when(userRepositoryMock.findByUsername("newUser")).thenReturn(null);

        //  case 1: register an existing username
        try {
            userService.registerUser("existingUser", "existingUser@example.com");
            fail("Expected IllegalArgumentException, but it was not thrown");
        } catch (IllegalArgumentException e) {
            // exception
        }

        // case 2: Register new user
        userService.registerUser("newUser", "newUser@example.com");


        verify(userRepositoryMock).save(argThat(user -> "newUser".equals(user.getUsername()) && "newUser@example.com".equals(user.getEmail())));
    }

}
