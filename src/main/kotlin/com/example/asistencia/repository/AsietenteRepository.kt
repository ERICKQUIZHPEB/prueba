package com.example.asistencia.repository

import com.example.asistencia.model.Asistente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AsietenteRepository:JpaRepository<Asistente, Long> {
    fun findById(id: Long?): Asistente?
}