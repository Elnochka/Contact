package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Елена on 16.06.16.
 */
@RestController
public class ContactController {


        @Autowired
        private ContactRepository repository;

        @RequestMapping("/contacts/read")
        @ResponseBody
        public List<Contact> readContact() {
            List<Contact> list = new CopyOnWriteArrayList<Contact>();

            Iterable<Contact> contact = repository.findAll();
            for (Contact customer : contact) {
                list.add(customer);
            }
                return list;

        }

    @RequestMapping(value="/contacts")
    @ResponseBody
    public List<Contact> filtrContact(@RequestParam(value="nameFilter", required=false) String nameFilter) {
//        List<Contact> list = new CopyOnWriteArrayList<Contact>();

        List<Contact> contact = repository.findByNameNotContaining(nameFilter);

//        for (Contact customer : contact) {
//
//           // if (customer.getName().matches("^t.*$")) {
//                list.add(customer);
//           // }
//
//        }

        return contact;
    }
}
