package com.example.asistencia.service
import com.example.asistencia.model.Asistente
import com.example.asistencia.repository.AsietenteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AsistenteService {
    @Autowired
    lateinit var asistenteRepository:AsietenteRepository

    fun list ():List<Asistente>{
        return asistenteRepository.findAll()
    }

    fun save (asistente: Asistente):Asistente{
        return asistenteRepository.save(asistente)
    }
}