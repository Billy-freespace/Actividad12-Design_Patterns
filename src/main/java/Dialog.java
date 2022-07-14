
public abstract class Dialog {
    abstract Button createButton();
    public void render(){
        Button okButton = createButton();

        okButton.onClick(); // REVISAR PARAMETRO
        okButton.render();
    }
}