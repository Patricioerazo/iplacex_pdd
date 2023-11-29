import java.util.List;
/**
 * @author patricio.erazo
 */
class ScexDecorator extends ApiDecorator {
    public ScexDecorator(Api api) {
        super(api);
    }

    List<ScexData> sumExcludedPensions(String exclusionType) {
        // En este sector sumar pensiones excluidas de SCex por tipo
        return null;
    }
}
