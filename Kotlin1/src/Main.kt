const val MENU = """Bienvenido a la guia de recetas ¿Que quieres hacer?
    |1. Agregar una recetas 
    |2. Consultar  mis recetas 
    |3. Salir del programa
"""
const val MENUINGREDIENTES = """¿Que ingrediente quieres agregar?
    |1. Agua
    |2. Leche 
    |3. Carne 
    |4. Verduras 
    |5. Frutas
    |6. Cereal
    |7. Huevos
    |8. Aceite
    |9. Terminar de agregar
"""

fun main(args: Array<String>) {
    var opcion: Int
    var receta:String = ""
    var listaRecetas = mutableListOf<String>()
    var numeroReceta = 0
    
    do {
        println(MENU)
        opcion = readLine()?.toInt()?:0
        when(opcion) {
            1 -> {
                receta = ingresoReceta()
                listaRecetas.add(receta)
            }
            2 -> {
                for (i in listaRecetas){
                    numeroReceta = numeroReceta.inc()
                    println("La receta #${numeroReceta} es $i")
                    println("\n")
                }
                numeroReceta = 0
            }
            3 -> {}
            else -> println("Por favor ingresa un numero valido")
        }
    }while (opcion != 3)
}

fun ingresoReceta():String{
    var ingredienteAgregado: String = ""
    var opcionIngrediente: Int


    do{
        println("Ingresa el numero del ingrediente que quieres agregar\n $MENUINGREDIENTES")
        opcionIngrediente = readLine()?.toInt()?:0

        if ((opcionIngrediente < 0) and (opcionIngrediente > 9)){
            println("Ingresa el numero del ingrediente que quieres agregar\n $MENUINGREDIENTES")
            opcionIngrediente = readLine()?.toInt()?:0
        }

        when(opcionIngrediente){
            1 ->{
                println("El ingrediente agregado ha sido Agua")
                ingredienteAgregado += "\nAgua"
            }
            2 -> {
                println("El ingrediente agregado ha sido Leche")
                ingredienteAgregado += "\nLeche"
            }
            3 -> {
                println("El ingrediente agregado ha sido Carne")
                ingredienteAgregado += "\nCarne"
            }
            4 -> {
                println("El ingrediente agregado ha sido Verduras")
                ingredienteAgregado += "\nVerduras"
            }
            5 -> {
                println("El ingrediente agregado ha sido Frutas")
                ingredienteAgregado += "\nFrutas"
            }
            6 -> {
                println("El ingrediente agregado ha sido Cereal")
                ingredienteAgregado += "\nCereal"
            }
            7 -> {
                println("Los ingredientes agregados han sido huevos")
                ingredienteAgregado += "\nHuevos"
            }
            8 -> {
                println("El ingrediente agregado ha sido Aceite")
                ingredienteAgregado += "\nAceite"
            }
            9 -> {}
            else -> println("Por favor ingresa un numero valido")
        }
    }while (opcionIngrediente != 9)

    return ingredienteAgregado
}