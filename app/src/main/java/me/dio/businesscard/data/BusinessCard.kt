package me.dio.businesscard.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BusinessCard(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "nome") val nome: String,
    @ColumnInfo(name = "empresa") val empresa: String,
    @ColumnInfo(name = "telefone") val telefone: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "fundoPersonalizado") val fundoPersonalizado: String,
)