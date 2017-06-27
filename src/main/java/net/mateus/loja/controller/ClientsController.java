package net.mateus.loja.controller;

import br.com.caelum.vraptor.Controller;
import java.util.List;
import javax.inject.Inject;
import net.mateus.loja.model.Client;
import net.mateusgabi.loja.dao.ClientDao;

/**
 *
 * @author Mateus Gabi
 */
@Controller
public class ClientsController {

    private ClientDao dao;

    /**
     * @deprecated CDI eyes only
     */
    protected ClientsController() {
        this(null);
    }

    public ClientsController(ClientDao dao) {
        this.dao = dao;
    }

    public void form() {

    }

    public void add(Client custom) {
        dao.save(custom);
    }

    public List<Client> list() {
        return dao.listAll();
    }

    public Client view(Long id) {
        return dao.load(id);
    }

}
