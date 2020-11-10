package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import javax.inject.Named;

import com.sun.faces.facelets.tag.jsf.core.ViewHandler;

@Named
@SessionScoped
public class CadastroBean implements Serializable {
	private Usuario usuario = new Usuario();
	private List<Usuario> listaUsuarios = new ArrayList<>();

	public CadastroBean() {
		this.listaUsuarios.add(new Usuario("arlete", "arletesantos", "1234"));
		this.listaUsuarios.add(new Usuario("Arlete", "Arletesantos", "1234"));

	}

	public String addUsuario() {
		listaUsuarios.add(usuario);

		usuario = new Usuario();

		return "Questao1.xhtml";

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {

		return listaUsuarios;
	}
}
