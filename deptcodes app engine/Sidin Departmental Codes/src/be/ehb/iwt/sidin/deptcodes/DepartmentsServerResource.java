package be.ehb.iwt.sidin.deptcodes;

import java.util.List;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class DepartmentsServerResource extends ServerResource implements IDeptsResource{

	@Override
	@Get
	public DeptList retrieve() {
		List<Department> departments = OfyService.ofy().load().type(Department.class).list();
		DeptList list = new DeptList();
		list.setDepartments(departments);
		return list;
	}

}
