package models;

import java.util.HashMap;
import java.util.Map;

public class Shop {

    Map<Integer, Angajat> angajati = new HashMap<>();
    Map<Integer, Client> clienti = new HashMap<>();
    Map <Integer, Product> products = new HashMap<>();

    private String name;
    private String address;

    private Integer id;

    public Shop(String name, String address, Integer id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getId() {return id;}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Integer id) {this.id = id;}

    public Angajat getAngajati() {
        for (Map.Entry<Integer, Angajat> entry : angajati.entrySet()) {
            System.out.println(entry.getValue());
        }
        return null;
    }

    public void getClienti() {
        for (Map.Entry<Integer, Client> entry : clienti.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void setAngajati(Angajat angajat) {
        angajati.put(angajat.getId(), angajat);
    }

    public void setClienti(Client client) {
        clienti.put(client.getId(), client);
    }

    public void setProducts(Product product) {
        products.put(product.getId(), product);
    }


    // returneaza clientii
    public Map<Integer, Client> getClients() {
        return clienti;
    }

    // returneaza produsele
    public Map<Integer, Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Shop{" + "name=" + name + ", address=" + address + ", id=" + id +'}';
    }
}
