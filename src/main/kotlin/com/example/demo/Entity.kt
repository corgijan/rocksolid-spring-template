package com.example.demo


import jakarta.persistence.*;
import jakarta.persistence.Entity

@Entity
class Entity {
    @Id
    @GeneratedValue
    @Column
    private val id: Long? = null

    @Column
    private var name: String? = null

    public constructor() {}

    public constructor(name: String?) {
        this.name = name
    }
}
