package services;
import models.Client;

import repository.ClientRepository;

public class ClientService {
    private ClientRepository clients = new ClientRepository();
    // adauga client
    public void addClient(Client client) {
        clients.addClient(client);
    }

    // sterge client
    public void removeClient(int id) {
        clients.removeClient(id);
    }

    public void getClient() {
        clients.getClient();
    }

    public void updateClientPurchase() {
        clients.updateClientPurchase();
    }

    // determina numele clientilor care au facut cumparaturi in ultima luna
    public void getClientLastMonth() {
        clients.getClientLastMonth();
    }
}
