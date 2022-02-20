import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.garzeah" }) // Determines where to start scanning for autowires
public class AppConfig {

    // Do not need these since we made use of @Service and @Repository (basically beans)
    // Moves bean logic into the files
    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        // Autowire
        SpeakerServiceImpl service = new SpeakerServiceImpl();

        // No Autowire
        // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        return service;
    };

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
