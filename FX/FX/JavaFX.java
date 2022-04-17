package FX;

import java.awt.*;

public class JavaFX {
    public static void main(String[] args) {
        System.out.println("Teste");
        screenSplash();
    }

    private static void screenSplash() {
        Label label = new Label("Label",1);
        label.setSize(300, 250);
    }
}