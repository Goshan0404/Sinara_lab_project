package sinara_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DurationOpen {
    final String from;
    final String to;

    public DurationOpen(@Value("${duration.from:Default Undefined}") String from, @Value("${duration.to:Default Undefined}") String to) {
        this.from = from;
        this.to = to;
    }
}
