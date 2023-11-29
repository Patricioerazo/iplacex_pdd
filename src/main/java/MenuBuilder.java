/**
 * @author patricio.erazo
 */
// El builder para hacer los menus
class MenuBuilder {
    private Menu menu;

    public MenuBuilder(String title) {
        this.menu = new Menu(title);
    }

    public void addOption(String option) {
        // Aqui para agregar las opciones al menu
    }

    public Menu getMenu() {
        return menu;
    }
}