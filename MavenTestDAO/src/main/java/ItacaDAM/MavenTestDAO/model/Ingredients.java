package ItacaDAM.MavenTestDAO.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ingredients {

	@SerializedName("anchoas")
	@Expose
	private Boolean anchoas;
	@SerializedName("pepperoni")
	@Expose
	private Boolean pepperoni;
	@SerializedName("extra-mozzarella")
	@Expose
	private Boolean extraMozzarella;
	@SerializedName("jamon")
	@Expose
	private Boolean jamon;
	@SerializedName("alcaparras")
	@Expose
	private Boolean alcaparras;
	@SerializedName("maiz")
	@Expose
	private Boolean maiz;

	public Ingredients(boolean anchoas, boolean pepperoni,
						boolean e_mozzarella, boolean jamon, 
						boolean  alcaparras, boolean maiz) {
		// TODO Auto-generated constructor stub
	}

	public Boolean getAnchoas() {
		return anchoas;
	}

	public void setAnchoas(Boolean anchoas) {
		this.anchoas = anchoas;
	}

	public Boolean getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Boolean pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Boolean getExtraMozzarella() {
		return extraMozzarella;
	}

	public void setExtraMozzarella(Boolean extraMozzarella) {
		this.extraMozzarella = extraMozzarella;
	}

	public Boolean getJamon() {
		return jamon;
	}

	public void setJamon(Boolean jamon) {
		this.jamon = jamon;
	}

	public Boolean getAlcaparras() {
		return alcaparras;
	}

	public void setAlcaparras(Boolean alcaparras) {
		this.alcaparras = alcaparras;
	}

	public Boolean getMaiz() {
		return maiz;
	}

	public void setMaiz(Boolean maiz) {
		this.maiz = maiz;
	}

}