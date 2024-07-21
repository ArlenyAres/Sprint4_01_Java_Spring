package cat.itacademy.barcelonactiva.medina.arleny.s04.t01.n02.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saludo(@RequestParam(value = "name", defaultValue = "UNKNOWN") String nombre) {

        return "Hola, " + nombre + ". Estas ejecutando un proyecto Gradle con Spring Boot.";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saludo2(@PathVariable(value = "name", required = false) String nombre) {

        if(nombre == null){
            nombre = "UNKNOWN";
        }
        return "Hola, " + nombre + ". Estas ejecutando un proyecto Gradle con Spring Boot.";
    }
}
