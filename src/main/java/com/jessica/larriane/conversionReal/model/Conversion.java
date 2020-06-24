package com.jessica.larriane.conversionReal.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Conversion {

    @Getter @Setter
    private double value;

    public double conversionDollar(){
        return value * 5.31;
    }
    public double conversionEuro(){
        return value * 5.95;
    }


}



