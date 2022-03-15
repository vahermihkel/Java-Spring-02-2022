package ee.mihkel.klassid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class KlassideKontroller {
    List<Tellimus> tellimused = new ArrayList<>();

    @GetMapping("klass")  // localhost:8080/klass
    public String saaKlass() {
        return new Tellimus("Kaarel",10,false).toString();
    }

    @GetMapping("saa-tellimused")  // localhost:8080/saa-tellimused
    public String saaTellimused() {
        return String.valueOf(tellimused);
    }

    @GetMapping("lisa-tellimus/{summa}")  // localhost:8080/lisa-tellimus/99
    public String lisaTellimus(@PathVariable int summa) {
        tellimused.add(new Tellimus("Kaarel",summa, false));
        return String.valueOf(tellimused);
    }

    @GetMapping("lisa-tellimus2/{isik}/{summa}")  // localhost:8080/lisa-tellimus2/Malle/99
    public String lisaTellimus2(@PathVariable String isik,@PathVariable int summa) {
        tellimused.add(new Tellimus(isik,summa, false));
        return String.valueOf(tellimused);
    }

    @GetMapping("saa-tellimused/{isik}")  // localhost:8080/saa-tellimused/Kaarel
    public String saaTellimusedIsik(@PathVariable String isik) {
        List<Tellimus> isikuTellimused = new ArrayList<>(); // Tellimus []
        for (int i = 0; i < tellimused.size(); i++) { // eesmärgiks kõik tellimused läbi käia
            if (tellimused.get(i).tellija.equals(isik)) { // 1  - 3 Tõnu  -- Kaarel
                 isikuTellimused.add(tellimused.get(i)) ;
            }
        }
        return String.valueOf(isikuTellimused); // Stringiks tegemine, et saaks välja kuvada
    }

    // tellimused === [{tellija: Tõnu}, {tellija: Kaarel}, {tellija: Malle}] -- tellimused.size=3
//    List<Tellimus> isikuTellimused = new ArrayList<>(); // Tellimus []
//        for (int i = 0; i < tellimused.size(); i++) {
//        if (tellimused.get(i).tellija.equals(isik)) { // 1 - 4 Tõnu  -- Kaarel
//            isikuTellimused.add(tellimused.get(i)) ;
//        }
//    }
}
