package com.example.myapplication

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//tipos de variables/**/
        //Se utiliza para declarar variables inmutables
        val nombre:String= "juan"
       // nombre="pedro"
        var nombre1:String="pedro"
        nombre1="juan"


        // ejemplo("juan", "perez",24)
        //ejemploWhen(5)
       //ejemploArrays("juan", "perez",24)
        //ejemploWhile(5)
        ejemploNull(null)

        val persona = Person(null,null)
        Log.e(TAG,"nombre ${persona.nombre} edad ${persona.edad}" )
        val persona1 = Person("juan",40)
        Log.e(TAG,"nombre ${persona1.nombre} edad ${persona1.edad}" )

        val programador = Programador("kotlin",3000,"juan",34)

        Log.e(TAG," Programador ---- nombre ${programador.nombre}" +
                " edad ${programador.edad}" +
                " lenguaje ${programador.lenguaje}" +
                " salario ${programador.salario}" )
    }

}

fun ejemplo(nombre:String, apellido:String, edad:Int){
    Log.e(TAG, "nombre: $nombre apellido $apellido  edad $edad ")
}

fun ejemploWhen(nota:Int){
    when(nota){

        1 ->Log.e(TAG,"la nota es uno")
        2 ->Log.e(TAG,"la nota es dos")
        3 ->Log.e(TAG,"la nota es tres")
        else-> Log.e(TAG,"no se encontro la nota")
    }

}

fun ejemploArrays(name:String,apellido: String,edad: Int){

    //agregar uno por uno
    val arreglo = arrayListOf<String>()
    arreglo.add(name)
    arreglo.add(apellido)
    arreglo.add(edad.toString())

    Log.e(TAG,arreglo.toString() + " print arreglo completo")
//agregar todos juntos
    arreglo.addAll(listOf(name,apellido,edad.toString()))
    //ver por indice
    Log.e(TAG,arreglo[0] +" print por indice")

    //remover
    arreglo.removeAt(0)

    Log.e(TAG,arreglo.toString() +" print luego de remorver un indice")

    //recorrer con foreach
    arreglo.forEach {
        Log.v(TAG, it +  " arreglo en el forEach")
    }
    // recorrer con for

    for ( aux in arreglo){
        Log.d(TAG,aux + " recorriendo for")
    }

    val myMap : MutableMap<String,Int> = mutableMapOf("augusto" to 1, "juan" to 2, "pedro" to 14)

    Log.e(TAG,myMap.toString() + " map!")

    for (it:MutableMap.MutableEntry<String,Int> in myMap){
        Log.e(TAG,("llave: ${it.key}, valor: ${it.value} " ))
    }

}

fun ejemploWhile( numero:Int){

    var x = numero

    while (x<10){
        x++
        Log.e(TAG, x.toString() + " iterando en while.")
    }
}

fun ejemploNull(nombre:String?){

    Log.e(TAG,nombre!!)


    //Log.e(TAG, nombre!!)
   // nombre="juan"
    if (!nombre.isNullOrEmpty()){

        Log.e(TAG, nombre)

    }else{
        Log.e(TAG,"no tiene nombre")


    }
    Log.e(TAG, nombre?.length.toString())
}


