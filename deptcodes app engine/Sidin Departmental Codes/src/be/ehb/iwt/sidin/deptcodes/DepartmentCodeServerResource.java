package be.ehb.iwt.sidin.deptcodes;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class DepartmentCodeServerResource extends ServerResource implements IDeptResource{

	@Override
	@Get
	public Department retrieve() {
		Long value = Long.parseLong((String) getRequest().getAttributes().get("id"));
		Department t = OfyService.ofy().load().type(Department.class).id(value).get();
		return t;
	}

	@Override
	@Post
	public void store(Department t) {
		OfyService.ofy().save().entities(t).now();
		
	}

	@Override
	@Delete
	public void remove() {
		Long value  = Long.parseLong((String)getRequest().getAttributes().get("id"));
		Department e = OfyService.ofy().load().type(Department.class).id(value).get();
		OfyService.ofy().delete().entity(e);
		
	}

}
