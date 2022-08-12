package com.rcastrucci.dev.singleton;

import java.io.IOException;
import java.util.Properties;

public class ComissaoProperties {
	
	
	private static Properties props;
	private static String configFilePath = "/resources/comissao.properties";
	
	
	/**
	 * Private constructor for a Singleton
	 */
	private ComissaoProperties() {}
	
	
	public static Properties getInstance() {
		if (props == null) {
			props = new Properties();
			try {
				props.load(ComissaoProperties.class.getResourceAsStream(configFilePath));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}

}