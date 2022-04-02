package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("final")
public class Final  implements Exam{
    @Value("${final.date}")
    private String date;

    @Override
    public String exam() {
        return date + ": final exam going On";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
