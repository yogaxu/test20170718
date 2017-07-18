package controllers;

import javax.inject.Inject;

import models.VillageInfo;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
	private FormFactory formFactory;
	
	@Inject
	public HomeController(FormFactory formFactory){
		this.formFactory = formFactory;
	}
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    
    public Result get_data(){
    	DynamicForm in = formFactory.form().bindFromRequest();
    	int village_no = Integer.valueOf(in.get("village_no"));
    	VillageInfo vi = VillageInfo.finder.byId(village_no);
    	return ok(Json.toJson(vi));
    }
}
