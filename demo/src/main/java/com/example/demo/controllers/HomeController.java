package com.example.demo.controllers;

import com.example.demo.models.Response;
import com.example.demo.models.Ticket;
import com.example.demo.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class HomeController {

    private static List <Ticket> tickets;
    ReentrantLock lock = new ReentrantLock();
    public HomeController() {
        tickets = new ArrayList<Ticket>();

        for (int i = 0; i < 50; i++) {
            Ticket ticket = new Ticket(5, i+1, Boolean.FALSE);
            tickets.add(ticket);
        }

    }
    @GetMapping ("book-ticket")
    public Response bookTicket (){
        lock.lock();
        Response response = new Response(false);
        for (int i = 0; i < tickets.size(); i++) {
            if(tickets.get(i).getBought() == false){

                ReentrantLock lock = new ReentrantLock();
                tickets.get(i).setBought(true);
                response.setSuccess(true);
                break;
            };
        }
        lock.unlock();
        return response;
    }
}
