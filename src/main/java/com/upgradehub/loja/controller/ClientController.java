package com.upgradehub.loja.controller;

import com.upgradehub.loja.exception.ClientNotFoundException;
import com.upgradehub.loja.model.Client;
import com.upgradehub.loja.service.ClientService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ControllerAdvice
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/get-all/client")
    @ApiOperation(value= "Getting all registers/client")
    public List<Client> getAllClient() {
        return clientService.getAllClient();
    }

    @GetMapping("/get-client/{id}")
    @ApiOperation(value="get register by client-id")
    public Client getClientById(@PathVariable Long id) throws ClientNotFoundException {
        return clientService.findById(id);
    }

    //question 4.3
    @PostMapping("/add-client")
    @ApiOperation(value= "Add/register client")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }
    @ExceptionHandler(value= ClientNotFoundException.class)
    public ResponseEntity<String> clientNotFound(ClientNotFoundException exception) {
        return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}