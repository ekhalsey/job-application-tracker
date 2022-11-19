package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.JobsRepository;
import org.launchcode.codingevents.models.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("jobs")
public class JobController {

    @Autowired
    private JobsRepository jobsRepository;

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Jobs");
        model.addAttribute("jobs", jobsRepository.findAll());
        return "jobs/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Job");
        return "jobs/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute Job newJob) {
        jobsRepository.save(newJob);
        return "redirect:";
    }

}
