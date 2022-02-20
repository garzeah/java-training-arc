import com.garzeah.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]) {
        // This is loading spring and loading configuration files
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);
        System.out.println(service2);
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
