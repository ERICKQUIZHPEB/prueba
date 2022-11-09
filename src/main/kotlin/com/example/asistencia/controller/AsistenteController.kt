package com.example.asistencia.controller


import com.example.asistencia.model.Asistente
import com.example.asistencia.service.AsistenteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/asistente")

class AsistenteController {
    @Autowired
    lateinit var asistenteService:AsistenteService

    @GetMapping
    fun list():List<Asistente>{
        return asistenteService.list()
    }

    @PostMapping
    fun save(@RequestBody client: Asistente): Asistente?{
        return asistenteService.save(client)

    }
}