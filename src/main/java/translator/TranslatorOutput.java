package translator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranslatorOutput {

    private final String enPhrase;

    public TranslatorOutput(String enPhrase){
        this.enPhrase = enPhrase;
    }

    @JsonProperty("Translated to English")
    public String getEnPhrase() {
        return enPhrase;
    }
}
