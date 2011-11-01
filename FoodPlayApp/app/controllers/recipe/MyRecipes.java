package controllers.recipe;

import java.util.List;

import model.Recipe;
import play.mvc.Controller;

public class MyRecipes extends Controller
{

	public static void index()
	{
		List<Recipe> recipes = Recipe.findAll();
		render(recipes);
	}

}
