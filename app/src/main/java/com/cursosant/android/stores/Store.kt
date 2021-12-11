package com.cursosant.android.stores

/****
 * Proyecto: Stores
 *
 *
 * Daniel Fernandez Guarneros 4°A
 *
 * Desarrollo de Software Multiplataforma
 *
 * Diseño para Apps
 ***/
data class Store(var id: Long = 0,
                 var name: String,
                 var phone: String = "",
                 var website: String = "",
                 var isFavorite: Boolean = false)
