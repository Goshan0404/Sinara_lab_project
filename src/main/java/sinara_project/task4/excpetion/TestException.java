package sinara_project.task4.excpetion;

public class TestException extends RuntimeException {
    private final String path;

    public TestException(String message, String path) {
        super(message);
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
