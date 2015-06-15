package be.ehb.iwt.sidin.deptcodes;

import java.util.List;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class DepartmentCodeServerResource extends ServerResource implements IDeptCodeResource{

	@Override
	@Get
	public String retrieve() {
		String pass = (String)getRequest().getAttributes().get("id");
		
		List<Department> t = OfyService.ofy().load().type(Department.class).list();
		
		for(Department d:t){
			if(d.getCode().equals(pass))
				return d.getUrl();
		}
		
		return "";
	}


}
