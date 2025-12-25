package com.oryanend.dicionario.filtro.controllers;

import com.oryanend.dicionario.filtro.services.StatusService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/status")
public class StatusController {
  @Autowired private StatusService service;

  @GetMapping
  public Map<String, Object> getStatus() {
    return service.getStatus();
  }
}
