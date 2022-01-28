package com.example.Ejercicio1BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties
public class Controlador {
    @Value("${VAR1}")
    private String propiedad1;

    @Value("${My.VAR2}")
    private String propiedad2;

    //@Value("${VAR3}")
    private String propiedad3;

    @GetMapping("/valores")
    public String retPropiedades(){
        return "valor de var1 es: "+ propiedad1+" valor de my.var2 es: "+propiedad2;
    }

    @GetMapping("/var3")
    public String var3(){
        return "valor de var3 es: "+propiedad3;
    }
}
