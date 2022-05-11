package interface_injection;

import org.springframework.stereotype.Service;

@Service
public class CmdService implements MyService {
    @Override
    public void execute() {
        System.out.println("CmdService execute command");
    }
}
