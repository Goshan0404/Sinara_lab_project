package sinara_project.task4.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Info {
    private long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
