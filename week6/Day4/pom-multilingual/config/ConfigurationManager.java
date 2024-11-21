package config;

import org.aeonbits.owner.ConfigCache;

public class ConfigurationManager {
	
	public static config.configuration configuration() {
		 return ConfigCache.getOrCreate(configuration.class);
		
	}

}
