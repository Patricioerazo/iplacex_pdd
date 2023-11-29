import java.util.List;
/**
 * @author patricio.erazo
 */
// Decorador para añadir, representar y agregar funcionalidades comunes a las APIs
interface Api {
    List<?> getData();
}

class ApiDecorator implements Api {
    private Api api;

    public ApiDecorator(Api api) {
        this.api = api;
    }

    @Override
    public List<?> getData() {
        List<?> data = api.getData();
        // Lógica adicional, si es necesario
        return data;
    }
}