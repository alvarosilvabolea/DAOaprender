package ItacaDAM.MavenTestDAO.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("ingredientes")
	@Expose
	private Ingredients ingredientes;
	@SerializedName("precio")
	@Expose
	private Double precio;
	
	public Order(Integer id, Ingredients ingredients) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ingredients getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredients ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}