package br.com.abreu;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/frutas")
public class FrutasResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Fruta> list() {
    return Fruta.listAll();
  }

  @POST
  @Transactional
  public void create() {
    Fruta fruta = new Fruta();
    fruta.nome = "Banana";
    fruta.quantidade = 10;
    fruta.persistAndFlush();
  }


}