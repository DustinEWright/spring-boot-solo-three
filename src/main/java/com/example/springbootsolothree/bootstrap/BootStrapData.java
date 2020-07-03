package com.example.springbootsolothree.bootstrap;
import com.example.springbootsolothree.domain.Widget;
import com.example.springbootsolothree.repositories.WidgetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final WidgetRepository widgetRepository;

    public BootStrapData(WidgetRepository widgetRepository) {
        this.widgetRepository = widgetRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Widget fred = new Widget("Fred", "orange");
        Widget dave = new Widget();
        dave.setName("Dave");
        dave.setColor("White");

        widgetRepository.save(fred);
        widgetRepository.save(dave);

        System.out.println("\nBootstrap starting...\n manual output");
        System.out.println("Number of widgets: " + widgetRepository.count());
        System.out.println("Widget 01: " + fred.toString());
        System.out.println("Widget 02: " + dave.toString());
        System.out.println("\nFor loop attempt");

        for (int i = 0; i < widgetRepository.count(); i++) {
            System.out.printf("Test : " + widgetRepository.findById(Long.valueOf(i)).toString());
        }

        System.out.println("\n\nBootstrap ending....");
    }
}
