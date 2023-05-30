package com.fatec.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.client.entities.Client;
import com.fatec.client.services.ClientService;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;
    


    @GetMapping("client")
    public Client getClient(){
        Client c = new Client(1,"joao@gmail.com", "João Silva");
        return c;
    }

    @GetMapping("clients")
    public List<Client> getClients(){
        return clientService.getClients();
    }





    
}




