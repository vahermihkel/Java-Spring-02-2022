package ee.mihkel.list;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController // RestController alati classi peal (annotation)
public class StringController {
    // Tellimused, Tooted, Kasutajad, Kategooriad, Pildigalerii pildid, Uudised

    // Ei saadeta staatilisi kohti

    List<String> s6nad = new ArrayList(Arrays.asList("Elas", "metsas", "mutionu")); // String[]

    @GetMapping("sonad")    // localhost:8080/sonad
    public List saaS6nad() {
        return s6nad;
    }

    @GetMapping("sona")    // localhost:8080/sona
    public String saaS6na() {
        return s6nad.get(2);
    }

    @GetMapping("lisa-sona/{uusS6na}")    // localhost:8080/lisa-sona/s
    public String lisaS6na(@PathVariable String uusS6na) { // URL muutuja
        s6nad.add(uusS6na);
        return "Edukalt sõna lisatud";
    }

    @GetMapping("saa-sona/{j2rjekorraNumber}")    // localhost:8080/saa-sona/1
    public String saaKindelS6na(@PathVariable int j2rjekorraNumber) {
        return s6nad.get(j2rjekorraNumber);
    }

    // kustutamine

}
