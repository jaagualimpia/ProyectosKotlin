package model

open class Leche: Alimento(){
    val menuLeches = """Cual leche deseas utilizar
    |1. Leche de Almendras
    |2. Leche de soya
    |3. Leche deslactosada
    |4. Leche descremada
    |5. Leche entera
    |6. Devolverse
"""

    init {
        displayList()
    }

    override fun displayList() {
        this.ingredienteReceta = ""
        do{
            println("Ingresa la cantidad de leche a agregar en mililitros")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuLeches)
            this.opcion = readLine()?.toInt()?:0

            when(opcion){
                1 -> this.ingredienteReceta += "Leche de Almendras en una porcion de $cantidad ml\n"
                2 -> this.ingredienteReceta += "Leche de Soya en una porcion de $cantidad ml\n"
                3 -> this.ingredienteReceta += "Leche deslactosada en una porcion de $cantidad ml\n"
                4 -> this.ingredienteReceta += "Leche descremada en una porcion de $cantidad ml\n"
                5 -> this.ingredienteReceta += "Leche entera en una porcion de $cantidad ml\n"
                else -> println("Ingresa una opcion correcta")
            }
        }while (opcion != 6)
    }
}