package translator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TranslatorInput {

    @JsonProperty("from")
    private final String source;

    @JsonProperty("to")
    private final String target;

    @JsonProperty("toTranslate")
    private final String esPhrase;

    public TranslatorInput(String source, String target, String esPhrase) {
        this.source = source;
        this.target = target;
        this.esPhrase = esPhrase;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public String getEsPhrase() {
        return esPhrase;
    }
}