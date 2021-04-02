package model

class Cereal : Alimento() {
    private val menuCereal = """Ingresa cual cereal deseas agregar
        |1. Avena
        |2. Trigo
        |3. Arroz
        |4. Maiz
        |5. Devolverse
    """

    init {
        displayList()
    }

    override fun displayList() {
        do{
            println("Ingresa la cantidad de granos en gramos")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuCereal)
            this.opcion = readLine()?.toInt()?:0

            when(opcion){
                1 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Avena\n"
                2 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Trigo\n"
                3 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Arroz\n"
                4 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Maiz\n"
                5 -> {}
                else -> println("Ingresa una opcion correcta")
            }
        }while (opcion != 8)
    }
}