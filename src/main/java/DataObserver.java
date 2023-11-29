import java.util.List;
/**
 * @author patricio.erazo
 */
// Observer
interface DataObserver {
    void update(List<?> data);
}