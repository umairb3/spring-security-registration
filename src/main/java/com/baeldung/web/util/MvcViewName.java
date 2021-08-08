package com.baeldung.web.util;

public enum MvcViewName {

	MANAGEMENT;
	
	@Override
    public String toString() {
        return name().toLowerCase();
    }
}
