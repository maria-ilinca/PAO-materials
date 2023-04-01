package services;
import models.Client;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class ClientService {
    // lista clienti
    private Map<Integer, Client> clients;

    // adauga client
    public void addClient(int id, Client client) {
       clients.put(id, client);
    }

    // sterge client
    public void removeClient(int id) {
        clients.remove(id);
    }

    public void getClient(int id) {
        clients.get(id);
    }


    // calculeaza valoarea maxima a cumparaturilor unor clienti
    public Integer getMaxPurchaseValue(Map<Integer,Client> clients) {
        Integer max = 0;
        for (Map.Entry<Integer, Client> entry : clients.entrySet()) {
            if (entry.getValue().getPurchaseValue() > max) {
                max = entry.getValue().getPurchaseValue();
            }
        }
        return max;
    }

    // determina numele clientilor care au facut cumparaturi in ultima luna
    public List<String> getClientsLastMonth(Map <Integer, Client> clients) {
        List<String> listClienti = new ArrayList<>();
        // determina luna dintr-o data
        int month = LocalDate.now().getMonthValue();
        for (Map.Entry<Integer, Client> entry : clients.entrySet()) {
            if (entry.getValue().getPurchaseDate().getMonth() == month) {
                listClienti.add(entry.getValue().getName());
            }
        }
        return listClienti;
    }
}
