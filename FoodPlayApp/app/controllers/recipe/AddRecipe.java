package controllers.recipe;

import model.Recipe;
import play.data.validation.Required;
import play.mvc.Controller;

public class AddRecipe extends Controller
{
	public static void index()
	{
		render();
	}
	
	public static void addRecipe(@Required String name)
	{
		if (validation.hasErrors())
		{
			flash.error("Oops, please enter your name!");
			render();

		}
		else
		{
			System.out.println("Saving Recipe: " + name);
			new Recipe(name).save();
			redirect("/myRecipes");
		}

	}
}
