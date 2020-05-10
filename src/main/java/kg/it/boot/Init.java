package kg.it.boot;

import kg.it.entity.less;
import kg.it.service.LessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Init implements CommandLineRunner {
    @Autowired
    private LessService lessService;
    @Override
    public void run(String... args) throws Exception {
        lessService.create(new less("First task","Create ",true));
        lessService.create(new less("2nd task","Create 2",false));
        lessService.create(new less("3st task","Create 3",true));
        lessService.create(new less("4th task","Create 4",false));
    }
}
