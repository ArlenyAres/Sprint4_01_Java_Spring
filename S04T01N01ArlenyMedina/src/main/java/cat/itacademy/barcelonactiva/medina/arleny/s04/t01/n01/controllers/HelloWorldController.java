package cat.itacademy.barcelonactiva.medina.arleny.s04.t01.n01.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name= "nombre", defaultValue = "UNKNOWN") String nombre) {

        return "Hola " + nombre + " Estas Ejecutando un proyecto maven con Spring Boot";
    }

    @GetMapping( value = {"/HelloWorld2", "/HelloWorld2/{nombre}"})
    public String saluda2(@PathVariable(name= "nombre", required = false) String nombre) {

        if(nombre == null){
            nombre="UNKNOWN";
        }

        return "Hola " + nombre + " Estas Ejecutando un proyecto maven con Spring Boot";

    }
}
