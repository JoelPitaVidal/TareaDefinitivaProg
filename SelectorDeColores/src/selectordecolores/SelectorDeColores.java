package selectordecolores;

import javax.swing.SwingUtilities;


public class SelectorDeColores {


    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SelectorCodigo().setVisible(true);
            }
        });
    }
    }
    

