package be.ehb.iwt.sidin.deptcodes;

import org.restlet.resource.Get;

public interface IDeptsResource {
	
	@Get
	public DeptList retrieve();

}
