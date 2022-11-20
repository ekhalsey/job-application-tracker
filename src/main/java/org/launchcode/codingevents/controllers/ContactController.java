package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.ContactRepository;
import org.launchcode.codingevents.models.Job;
import org.launchcode.codingevents.models.NetworkingContact;
import org.launchcode.codingevents.models.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("contacts")
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("")
    public String displayAllContacts(Model model) {
        model.addAttribute("title", "All Contacts");
        model.addAttribute("contacts", contactRepository.findAll());
        return "contacts/index";
    }

    @GetMapping("create")
    public String displayCreateContactForm(Model model) {
        model.addAttribute("title", "Add a Contact");
        model.addAttribute(new NetworkingContact());
        return "contacts/create";
    }

    @PostMapping("create")
    public String processCreateContactForm(@ModelAttribute @Valid NetworkingContact contact, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add a Contact");
            return "contacts/create";
        }
        contactRepository.save(contact);
        return "redirect:";
    }
}
