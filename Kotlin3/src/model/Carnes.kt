package model

class Carnes : Alimento(){
    private val menuCarnes = """Ingresa cual carne deseas agregar
        |1. Carne de cerdo
        |2. Carne de pollo
        |3. Carne de res
        |4. Devolverse
    """

    init {
        displayList()
    }

    override fun displayList() {
        this.ingredienteReceta = ""
        do{
            println("Ingresa la cantidad de carne en gramos")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuCarnes)
            this.opcion = readLine()?.toInt()?:0

            when(opcion){
                1 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de carne de cerdo\n"
                2 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de carne de pollo\n"
                3 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de carne de res\n"
                4 -> {}
                else -> println("Ingresa una opcion correcta")
            }
        }while (opcion != 4)
    }
}