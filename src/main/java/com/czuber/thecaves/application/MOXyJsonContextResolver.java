package com.czuber.thecaves.application;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

@Provider
public class MOXyJsonContextResolver implements ContextResolver<MoxyJsonConfig> {

	private final MoxyJsonConfig config;

	public MOXyJsonContextResolver() {
		
		final Map<String, String> namespacePrefixMapper = new HashMap<String, String>();
        namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");

		config = new MoxyJsonConfig()
				.setAttributePrefix("")
				.setValueWrapper("value")
				.property(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME,
						true)
				.setNamespacePrefixMapper(namespacePrefixMapper)
			    .setNamespaceSeparator(':');
	}

	@Override
	public MoxyJsonConfig getContext(Class<?> objectType) {
		return config;
	}
}
