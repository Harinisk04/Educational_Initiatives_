import java.util.*;

public interface ChatMediator {
    void sendMessage(String msg, User sender);
    void addUser(User user);
}
