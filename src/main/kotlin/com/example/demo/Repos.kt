package com.example.demo

import org.springframework.data.repository.CrudRepository

interface EntityRepository : CrudRepository<Entity?, Long?> {

}
