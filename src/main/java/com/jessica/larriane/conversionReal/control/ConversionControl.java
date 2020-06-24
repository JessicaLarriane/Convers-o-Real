package com.jessica.larriane.conversionReal.control;

import com.jessica.larriane.conversionReal.model.Conversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionControl {

    @GetMapping("/")
    public String index(){
        return "Bem Vindo";
    }
    @GetMapping("/conversao")
    public String showConversion(){
        Conversion c1 = new Conversion();

        c1.setValue(5.00);

            return
                    "Valor em R$: " + c1.getValue() +
                            "\nValor em dolár $: " + c1.conversionDollar()+
                            "\nValor em euro ¢: " + c1.conversionEuro() ;
        }

    }





