package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("mid")
public class Mid  implements Exam{
    @Value("${mid.date}")
    private String date;

    @Override
    public String exam() {
        return date + ": Mid exam going On";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
