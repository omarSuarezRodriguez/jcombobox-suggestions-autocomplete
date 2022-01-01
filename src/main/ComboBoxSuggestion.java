package main;

import javax.swing.JComboBox;

/**
 *
 * @author Omar
 */
public class ComboBoxSuggestion<E> extends JComboBox<E>{

    public ComboBoxSuggestion() {
        
        setUI(new ComboSuggestionUI());
        
    }
    
    
}
