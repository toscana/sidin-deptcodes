package be.ehb.iwt.sidin.deptcodes;

import org.restlet.resource.Get;



public interface IDeptCodeResource {
	@Get
	public String retrieve();
}
