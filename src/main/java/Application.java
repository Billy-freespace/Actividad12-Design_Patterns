
class Application {
    private Dialog dialog;

    void initialize() throws Exception{

        String config_os = "Windows"; // MDIFICAR

        if(config_os == "Windows"){
            dialog = new WindowsDialog();
        }
        else if (config_os == "Web"){
            dialog = new WebDialog();
        }
        else {
            throw new Exception("Error! SO desconocido.");
        }
    }

    public Dialog getDialog() { // VER OTRO MANERA
        return dialog;
    }

    public static void main(String[] args){
        Application app = new Application();
        try {
            app.initialize();
            app.getDialog().render();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
}