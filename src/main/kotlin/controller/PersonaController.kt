package controller
import model.Persona
import view.PersonaView

class PersonaController {

//    •	calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), devuelve un -1 si esta por debajo de su peso ideal, un 0 si esta en su peso ideal y un 1 si tiene sobrepeso . Usa constantes para devolver estos valores.
//    •	esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
//    •	comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.

//        private var persona = Persona("",0,'H')
        private var persona = Persona()
        private var personaView = PersonaView()

     public fun calcularIMC(peso:Double, altura:Double):  Int {
        var imc = (peso/(altura*altura))
         if(imc > 24.9){// sobrepeso
            return 1
         }
         if(imc > 18.5 && imc <= 24.9){//peso ideal
            return 0
         }
        return -1 //por debajo del peso ideal
    }
    public fun esMayorDeEdad(edad : Int):Boolean{
        if(edad> 18){
            return true
        }
        else{
            return false
        }
    }
    public fun	comprobarSexo(sexo:Char): Char{
        if(sexo != 'M'){
            return 'H'
        }
        return 'M'
    }
}