package ru.netology.domain.constructots;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NewConditioner {
    private int id;
    private String name = "noname";
    private int maxTemperature = 32;
    private int minTemperature = 13;
    private int currentTemperature = 22;
    private boolean on;
}
