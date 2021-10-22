package com.upgradehub.loja.service;

import com.upgradehub.loja.exception.ClientNotFoundException;
import com.upgradehub.loja.model.Client;
import com.upgradehub.loja.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client findById(Long id) throws ClientNotFoundException {
        Client client = clientRepository.findById(id).orElseThrow(
                () -> new ClientNotFoundException("client not found with that id")
        );
        return client;

    }


}