/**
 * @author patricio.erazo
 */
public class Main {
    public static void main(String[] args) {
        // Uso del patrón
        ControlEstadisticoFacade facade = new ControlEstadisticoFacade();
        facade.menuAfiliado();
        facade.menuPensionados();
        facade.menuExcluidos();
    }
}