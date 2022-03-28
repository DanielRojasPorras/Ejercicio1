package model

class Persona {
    var nombre: String = ""
    var edad : Int = 0
    var cedula : String
    var sexo : Char = '\u0000'
    var peso : Double = 0.0
    var altura : Double = 0.0

    init{
    cedula = ""
    }

    constructor(nombre: String, edad : Int, cedula : String, sexo : Char, peso : Double, altura : Double){
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

    constructor(nombre: String, edad: Int, sexo: Char) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }

    constructor()

    //•	toString(): devuelve toda la información del objeto.
    //•	correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.


    override fun toString(): String {
        return "Persona(nombre='$nombre', edad=$edad, cedula='$cedula', sexo=$sexo, peso=$peso, altura=$altura)"
    }

}