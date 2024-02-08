package org.hibernate.dao.clien;

import org.hibernate.entity.Client;

public interface ClientDao {

    Client findById(Long clientId);

    boolean createClient(Client client);

    void deleteClientById (Long clientId);
}
