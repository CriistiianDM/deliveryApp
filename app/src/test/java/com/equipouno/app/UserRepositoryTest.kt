package com.equipouno.app

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import org.junit.Assert
import org.junit.Test


class UserRepositoryTest {

    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2)
    }

//    @Test
//    fun test() {
//        val email = "test@gmail.com"
//        val db = Firebase.firestore
//        val userCollection = db.collection("person")
//
//        var success = false
//
//        userCollection.whereEqualTo("email", email)
//            .get()
//            .addOnSuccessListener { querySnapshot ->
//                if (!querySnapshot.isEmpty) {
//                    val document = querySnapshot.documents[0]
//                    success = true
//                }
//            }
//            .addOnFailureListener { exception ->
//                // Aquí puedes manejar el fallo si es necesario
//                success = false
//            }
//
//        // Asegúrate de que la prueba espere a que se complete la operación asíncrona
//        Thread.sleep(1000)
//
//        // Verifica si la operación fue exitosa
//        Assert.assertTrue(success)
//    }
}

