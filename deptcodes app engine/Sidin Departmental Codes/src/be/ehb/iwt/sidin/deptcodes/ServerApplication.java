package be.ehb.iwt.sidin.deptcodes;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;



public class ServerApplication extends Application{
	@Override
	public Restlet createInboundRoot(){
		Router router = new Router(getContext());
		router.attachDefault(new Directory(getContext(),"war:///"));
		router.attach("/depts",DepartmentsServerResource.class);
		router.attach("/dept", DepartmentServerResource.class);
		router.attach("/dept/{id}", DepartmentServerResource.class);
		
		return router;
	}
	

}
