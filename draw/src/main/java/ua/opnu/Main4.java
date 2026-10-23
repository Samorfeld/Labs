package ua.opnu;

import ua.opnu.view.DrawFrame;

import javax.swing.*;

public class Main4 {

    public static void main(String[] args) {

        // Створення GUI в окремому потоці
        // Для ознайомлення з додатком, див. вміст класу DrawFrame
        SwingUtilities.invokeLater(() -> new DrawFrame("Програма Draw"));
    }
}