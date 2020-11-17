package springboot.chapter3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("User")
public class User {
    @Value("1")
    private long id;
    @Value("user_name_1")
    private String username;
    @Value("note_1")
    private String note;

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getId() {
        return id;
    }
}
