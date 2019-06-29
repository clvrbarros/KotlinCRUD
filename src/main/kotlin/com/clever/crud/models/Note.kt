package com.clever.crud.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "usersnew", schema = "public")
class Note (val nome: String = "",
            @Id
            val emal: String =  "",
            val idade: Int = 0)