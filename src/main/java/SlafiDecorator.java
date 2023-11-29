import java.util.List;
/**
 * @author patricio.erazo
 */
// Decoradores aplicados para cada API
class SlafiDecorator extends ApiDecorator {
    public SlafiDecorator(Api api) {
        super(api);
    }

    List<SlafiData> calculateContributionsTotal() {
        // aqui entonces el codigo para calcular contribuciones de Slafi
        return null;
    }
}