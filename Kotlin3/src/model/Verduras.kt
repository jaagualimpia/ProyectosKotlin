package model

class Verduras : Alimento() {

    private val menuVerduras = """ Ingresa la verdura que deseas agregar a la receta
        |1. Brocoli
        |2. Repollo
        |3. Zanahoria
        |4. Habichuelas
        |5. Lechuga
        |6. Devolverse
    """

    init {
        displayList()
    }

    override fun displayList() {
        this.ingredienteReceta = ""
        do{
            println("Ingresa la cantidad de verdura en gramos")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuVerduras)
            this.opcion = readLine()?.toInt()?:0

            when(opcion){
                1 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Brocoli\n"
                2 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Repollo\n"
                3 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Zanahoria\n"
                4 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Habichuelas\n"
                5 -> this.ingredienteReceta += "Se agregan ${cantidad} gramos de Lechuga\n"
                6 -> {}
                else -> println("Ingresa una opcion correcta")
            }
        }while (opcion != 6)
    }
}