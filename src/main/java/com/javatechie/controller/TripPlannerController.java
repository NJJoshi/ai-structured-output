package com.javatechie.controller;

import com.javatechie.dto.TripPlan;
import com.javatechie.service.TripPlannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/trips")
public class TripPlannerController {

    private final TripPlannerService service;

    public TripPlannerController(TripPlannerService service) {
        this.service = service;
    }

    @GetMapping("/plan-trip")
    public TripPlan getTripPlans(@RequestParam String message) {
        return service.getTripPlans(message);
    }

    @GetMapping("/trip-spots")
    public List<String> getTripSpots(@RequestParam String message) {
        return service.getTripSpots(message);
    }

    @GetMapping("/trip-guide")
    public Map<String, Object> getTripGuide(@RequestParam String message) {
        return service.getTripGuide(message);
    }

    @GetMapping("/complete-trip-plans")
    public List<TripPlan> getCompleteTripPlans(@RequestParam String message) {
        return service.completeTripPlans(message);
    }
}
