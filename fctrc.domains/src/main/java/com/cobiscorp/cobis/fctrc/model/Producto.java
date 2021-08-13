package com.cobiscorp.cobis.fctrc.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Producto {

	public static final String EN_PRODUCTOO_821 = "EN_PRODUCTOO_821";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Producto";
	
	
	public static final Property<Double> PRECIO = new Property<Double>("precio", Double.class, false);
	
	public static final Property<String> NOMBRE = new Property<String>("nombre", String.class, false);
	
	public static final Property<String> CODIGO = new Property<String>("codigo", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
