package interface_injection;

import org.springframework.stereotype.Service;

@Service
public class SqlService implements MyService {
    @Override
    public void execute() {
        System.out.println("SqlService execute command");
    }
}
