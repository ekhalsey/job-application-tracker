package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.JobsRepository;
import org.launchcode.codingevents.models.Job;
import org.launchcode.codingevents.models.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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
        model.addAttribute(new Job());
        model.addAttribute("statuses", StatusEnum.values());
        return "jobs/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@ModelAttribute @Valid Job newJob, Errors errors, Model model) {
        if (errors.hasErrors()){
            model.addAttribute("title", "Create Job");
            return"jobs/create";
        }
        jobsRepository.save(newJob);
        return "redirect:";
    }

    @PostMapping(value = "/redirect")
    public RedirectView redirect(Model model, @RequestParam String id){
        Integer number = Integer.valueOf(id);
        //        System.out.println(link);
        System.out.println(number);
        Optional<Job> result = jobsRepository.findById(number);
        Job job = result.get();

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(job.getLink());

        return redirectView;

    }

}
