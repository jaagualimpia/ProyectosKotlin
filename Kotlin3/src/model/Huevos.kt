package model



open class Huevos : Alimento() {
    private val menuHuevos = """Ingresa cuales huevos deseas agregar a la receta
    |1. Huevos de Gallina
    |2. Huevos de Codorniz
    |3. Devolverse
"""
    init {
        displayList()
    }
    override fun displayList() {
        this.ingredienteReceta = ""
        do{
            println("Ingresa la cantidad de huevos")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuHuevos)
            this.opcion = readLine()?.toInt()?:0

            when(opcion){
                1 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} huevos de Gallina\n"
                2 -> this.ingredienteReceta += "Se agregan ${cantidad.toInt()} huevos de Codorniz\n"
                3 -> {}
                else -> println("Ingresa una opcion correcta")
            }
        }while (opcion != 3)
    }
}