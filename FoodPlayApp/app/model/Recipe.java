package model;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Recipe extends Model
{

	private String name;

	public Recipe(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}
