package controllers;
import play.mvc.*;
import views.html.*;

public class HomeController extends Controller {

    public Result index(String name) {
        return ok(index.render("Welcome to the Home page", name));
    }

    public Result about() {
        return ok(about.render());
    }

    public Result products() {
        return ok(products.render());
    }

}


