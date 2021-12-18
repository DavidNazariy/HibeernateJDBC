import app.Init;
import app.config.AppConfig;
import app.repository.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class Application {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Init init = context.getBean(Init.class);
        init.init();
    }
}
