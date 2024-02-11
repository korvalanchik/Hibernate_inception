package org.hibernate.dao.clien;

import org.hibernate.entity.Client;

import java.util.List;

public interface ClientDao {

    Client findById(Long clientId);

    boolean createClient(Client client);

    void createClientByName(String name);

    void deleteClientById (Long clientId);

    boolean updateClient(Client client);

}
