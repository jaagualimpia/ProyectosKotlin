package model


open class Aceites() : Alimento() {
    val menuAceites = """Cual aceite deseas utilizar
    |1. Aceite de Oliva
    |2. Aceite de Oliva virgen extra
    |3. Aceite de Girasol
    |4. Devolverse
"""
    init {
        displayList()
        println(ingredienteReceta)
    }

    override fun displayList() {
        this.ingredienteReceta = ""
        do{
            println("Ingresa la cantidad de aceite a agregar en mililitros")
            this.cantidad = readLine()?.toDouble()?:0.0

            println(menuAceites)
            this.opcion = readLine()?.toInt()?:0
            when(opcion){
                1 -> this.ingredienteReceta += "Aceite de Oliva en una porcion de $cantidad ml\n"
                2 -> this.ingredienteReceta += "Aceite de Oliva virgen extra en una porcion de $cantidad ml\n"
                3 -> this.ingredienteReceta += "Aceite de Girasol en una porcion de $cantidad ml\n"
                else -> {}
            }
        }while (opcion != 4)
    }
}