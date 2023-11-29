
import java.util.List;
/**
 * @author patricio.erazo
 */
// Facade
class ControlEstadisticoFacade {
    private SlafiDecorator slafi;
    private SipenDecorator sipen;
    private ScexDecorator scex;

    public ControlEstadisticoFacade() {
        this.slafi = new SlafiDecorator(new SlafiProxy());
        this.sipen = new SipenDecorator(new SipenProxy());
        this.scex = new ScexDecorator(new ScexProxy());
    }

    void menuAfiliado() {
        List<SlafiData> data = slafi.calculateContributionsTotal();
        // Esta es la logica para traer menu afiliado con datos
    }

    void menuPensionados() {
        List<SipenData> data = sipen.listPensionados();
        // Esta es la logica para traer menu pensionados con datos
    }

    void menuExcluidos() {
        List<ScexData> dataFfaa = scex.sumExcludedPensions("FFAA");
        List<ScexData> dataEmpleados = scex.sumExcludedPensions("Empleado");
        // Esta es la logica para traer menu excluidos con datos por FFAA y Empleados
    }
}