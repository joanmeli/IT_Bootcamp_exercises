package idade.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Controller
public class Endpoints {
    @GetMapping("/{dia}/{mes}/{ano}")
    @ResponseBody
    public String converter(
            @PathVariable int dia,
            @PathVariable int mes,
            @PathVariable int ano
    ) {
        LocalDate data_nacimento = LocalDate.of(ano, mes, dia);
        int anos = AgeCalculator.calculateAge(data_nacimento);
        return String.valueOf(anos);
    }
}
