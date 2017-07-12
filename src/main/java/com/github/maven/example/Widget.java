package com.github.maven.example;

/**
 * Simple wigdet class that can be enabled or disabled
 */
public class Widget {

	private boolean enabled;

	/**
	 * Create new enabled widget
	 */
	public Widget() {
		enabled = true;
	}

        
        
	/**
	 * Is the widget currently enabled?
	 * 
	 * @return true if enabled, false otherwise
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * Set the widget enable state
	 * 
	 * @param enabled
	 * @return this widget
	 */
	public Widget setEnabled(boolean enabled) {
		this.enabled = enabled;
		return this;
	}
        
        /**
         * Probando estos ejercicios putitos
         */
        
        
        /**
         * dicen que soy muy joven pra amar :V
         */
        
        /**
         * hola
         */
         
        public void mensaje()
        {
            System.out.println("Version 23.0  sera q si");
            System.out.println("otra vez");
            System.out.println("otra vez :v");
            System.out.println("4ta linea");
            System.out.println("quinta linea");
        }
        public void vicky(){
            System.out.println("holi");
        }
        public void jhonathan()
        {
            System.out.println("mi rama j");
        }
}
