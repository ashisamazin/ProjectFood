package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RecipeTest
{

	@Test
	public void basicTest()
	{
		String recipeName = "Spag Bol";
		Recipe r = new Recipe(recipeName);
		r.save();
		//
		Recipe recipe = Recipe.find("byName", recipeName).first();
		assertNotNull(recipe);
		assertEquals(recipeName, recipe.getName());

	}
}
