package config;

import org.aeonbits.owner.Config;
@Config.Sources("classpath:config.fr.properties")
public interface configuration extends Config {
	@Key("timeout")
	int getTimeout();
	
	
	@Key("username")
	String getusername();
	
	@Key("password")
	String getpassword();
	
	
	@Key("leadslink")
	String leadslink();
	
	@Key("createleadlink")
	String createleadlink();
}
