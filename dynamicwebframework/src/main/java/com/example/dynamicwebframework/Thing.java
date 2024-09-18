package com.example.dynamicwebframework;

import javax.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Thing {
    private int banana;
    private String robot;
    private String shark;
}
