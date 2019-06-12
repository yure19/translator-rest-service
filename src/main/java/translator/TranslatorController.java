package translator;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslatorController {

    @RequestMapping(value = "/translate", method = RequestMethod.POST)
    public TranslatorOutput translate(@RequestBody TranslatorInput input) {

        String enPhrase = new Translator().translate(input.getSource(), input.getTarget(), input.getEsPhrase());

        return new TranslatorOutput(enPhrase);
    }
}
