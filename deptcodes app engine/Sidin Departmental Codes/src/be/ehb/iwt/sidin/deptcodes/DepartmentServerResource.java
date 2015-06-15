package be.ehb.iwt.sidin.deptcodes;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class DepartmentServerResource extends ServerResource implements IDeptCodeResource{

	@Override
	@Get
	public String retrieve() {
		Long value = Long.parseLong((String) getRequest().getAttributes().get("id"));
		Department t = OfyService.ofy().load().type(Department.class).id(value).get();
		if(t != null)
			return t.getUrl();
		else
			return "";
	}


}
