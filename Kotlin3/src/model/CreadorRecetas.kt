package model



class CreadorRecetas {
    private var recetaFinal = """"""
    private var opcion = 0
    private val menuIngredientes = """ingresa que tipo de alimento quieres agregar a la receta
        |1.Agua
        |2.Leche
        |3.Carne
        |4.Verduras
        |5.Frutas
        |6.Cereal
        |7.Huevos
        |8.Aceites
        |0.Salir
        """

    fun recibirRecetaFinal(){
        recetaFinal = ""
        do{
            println(menuIngredientes)
            opcion = readLine()?.toInt()?:0
            when(opcion){
                1 ->{
                    recetaFinal += "Agua en 500ml\n"
                }
                2 ->{
                    val nuevoIngredienteleche = Leche()
                    this.recetaFinal += nuevoIngredienteleche.getIngredientesReceta()
                }
                3 ->{
                    val nuevoIngredienteCarnes = Carnes()
                    this.recetaFinal += nuevoIngredienteCarnes.getIngredientesReceta()
                }
                4 ->{
                    val nuevoIngredienteVerduras = Verduras()
                    this.recetaFinal += nuevoIngredienteVerduras.getIngredientesReceta()
                }
                5 ->{
                    val nuevoIngredienteFrutas = Frutas()
                    this.recetaFinal += nuevoIngredienteFrutas.getIngredientesReceta()
                }
                6 ->{
                    val nuevoIngredienteCereal = Cereal()
                    this.recetaFinal += nuevoIngredienteCereal.getIngredientesReceta()
                }
                7 ->{
                    val nuevoIngredienteHuevos = Huevos()
                    this.recetaFinal += nuevoIngredienteHuevos.getIngredientesReceta()
                }
                8 ->{
                    val nuevoIngredienteAceites = Aceites()
                    this.recetaFinal += nuevoIngredienteAceites.getIngredientesReceta()
                }
                else -> {
                    println("Numero no valido")}
            }
        }while(opcion != 0)
    }

    fun getRecetaFinal(): String{
        return recetaFinal
    }


}