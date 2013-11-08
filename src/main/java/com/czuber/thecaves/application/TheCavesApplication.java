package com.czuber.thecaves.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import com.czuber.thecaves.resource.TheCavesResource;

public class TheCavesApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(TheCavesResource.class);
        return s;
	}

}
