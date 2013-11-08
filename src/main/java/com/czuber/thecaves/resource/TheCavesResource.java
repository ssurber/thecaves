package com.czuber.thecaves.resource;

import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.eclipse.persistence.internal.jpa.parsing.StringFunctionNode;

import com.czuber.thecaves.implementation.CaveGenerator;
import com.czuber.thecaves.implementation.CaveType;
import com.czuber.thecaves.implementation.Item;
import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;

@Path("thecaves")
public class TheCavesResource {

	@GET
	@Path("/{seed}")
	@Produces("applicaton/json")
	public String seed(@PathParam("seed") int seed) {
		CaveGenerator cg = new CaveGenerator(seed);
		return toMap(cg.generateCaves());
	}

	private String toMap(CaveType[] caves) {
		StringBuilder caveMap = new StringBuilder();

		caveMap.append("[ ");
		for (int x = 0; x < caves.length; x++) {
			caveMap.append("{ ");
			caveMap.append(toCave(caves[x]));
			caveMap.append(" }");
			if(x < caves.length -1) {
				caveMap.append(", ");
			}
		}
		caveMap.append(" ]");
		return caveMap.toString();
	}

	private StringBuilder toCave(CaveType caveType) {
		StringBuilder cave = new StringBuilder();

		String templateString = "\"%s\": \"%s\"";
		String templateNumber = "\"%s\": %s";
		cave.append(String.format(templateString, "name", caveType.toString()));
		cave.append(", ");
		cave.append(String.format(templateString, "warnMessage", caveType.getWarnMessage() == null ? "" : caveType.getWarnMessage()));
		cave.append(", ");
		cave.append(String.format(templateString, "wizardSight", caveType.isWizardSight()));
		cave.append(", ");
		cave.append(String.format(templateNumber, "item", caveType.getItem() == null ? "\"\"" : toItem(caveType.getItem())));
		cave.append(", ");
		cave.append(String.format(templateNumber, "downLeft", caveType.getDownLeft()));
		cave.append(", ");
		cave.append(String.format(templateNumber,"upRight", caveType.getUpRight()));
		
		return cave;
	}

	private StringBuilder toItem(Item item) {
		StringBuilder itemMap = new StringBuilder();
		String templateString = "\"%s\": \"%s\"";
		String templateNumber = "\"%s\": %s";
		
		itemMap.append("{ ");
		itemMap.append(String.format(templateNumber, "score", item.getScore()));
		itemMap.append(", ");
		itemMap.append(String.format(templateString, "stealable", item.isStealable));
		itemMap.append(" }");
		return itemMap;
	}

}
