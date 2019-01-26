package com.gpcoder.patterns.creational.dependencyinjection.ioc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.management.InstanceNotFoundException;

public class Injector {

	private static final String IOC_CONFIGURATION_FILE_NAME = "ioc.properties";

	private Injector() {
		throw new UnsupportedOperationException();
	}

	public static Object getInstance(String key) throws InstanceNotFoundException {
		try (InputStream input = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
			// load a properties file
			Properties prop = new Properties();
			prop.load(input);

			// get the property value
			String className = prop.getProperty(key);
			return Class.forName(className).newInstance();
		} catch (IOException | InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new InstanceNotFoundException(
					"Can't create instance of " + key + " base on the configuration of " + IOC_CONFIGURATION_FILE_NAME);
		}
	}
}
