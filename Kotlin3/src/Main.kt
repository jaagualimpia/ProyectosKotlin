import com.sun.xml.internal.fastinfoset.util.StringArray
import model.Aceites
import model.CreadorRecetas


fun main(args: Array<String>) {
    var opcion: Int = 0
    val librorecetas = mutableListOf<String>()
    val receta = CreadorRecetas()
    var recetaNueva:String

    val menuIngredientes = """Bienvenido a tu libro de recetas
Ingresa que accion deseas realizar
    |1. Agregar receta
    |2. Ver recetas creadas
    |3. Salir"""

    do {
        println(menuIngredientes)
        opcion = readLine()?.toInt()?:0

        when(opcion){
            1 -> {
               receta.recibirRecetaFinal()
               librorecetas.add(receta.getRecetaFinal())
            }
            2 ->{
                for ((index, receta:String) in librorecetas.withIndex()){
                    println("Receta #${index+1}")
                    println("$receta")
                }
            }
            3 -> println("Cerrando el libro de recetas")
        }
    }while (opcion != 3)
}
