package net.mateus.loja.model;

/**
 *
 * @author Mateus Gabi
 */
public class Client {

    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public Client setAddress(String address) {
        this.address = address;
        return this;
    }
}