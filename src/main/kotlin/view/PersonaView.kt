package view
import controller.PersonaController
import model.Persona

class PersonaView {




fun seguimiento () {

    var pController = PersonaController()

    print("Digite su nombre: ")
    var nombre : String = readLine().toString()

    print("Digite su edad: ")
    var edad : Int = readLine()?.toInt()!!

    print("Digite su sexo: ")
    var sexo : Char = readLine()!![0]
    sexo = pController.comprobarSexo(sexo)

    print("Digite su peso: ")
    var peso : Double= readLine()?.toDouble()!!

    print("Digite su altura: ")
     var altura : Double= readLine()?.toDouble()!!

     var persona1 = Persona(nombre,edad,"207730237",sexo,peso,altura)
     var persona2 = Persona(nombre,edad,sexo)

     var persona3 = Persona()
     persona3.nombre = "Maria"
     persona3.edad = 55
     persona3.sexo = 'M'
     persona3.peso = 98.2
     persona3.altura = 1.70

    println(pController.calcularIMC(persona1.peso,persona1.altura))
    println(pController.calcularIMC(persona2.peso,persona2.altura))
    println(pController.calcularIMC(persona3.peso,persona3.altura))

    println(pController.esMayorDeEdad(persona1.edad))
    println(pController.esMayorDeEdad(persona2.edad))
    println(pController.esMayorDeEdad(persona3.edad))

    println(persona1.toString())
    println(persona2.toString())
    println(persona3.toString())
}

}
