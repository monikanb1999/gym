package com.example.gymapplication

import android.view.View
import com.example.gymapplication.ui.home.HomeViewModel

interface Handler {
   fun onAddClicked(view: View)

}
interface LogHandler
{
    fun onSaveClicked(view: View)
//    fun onResetClicked(view: View)
}
interface RegisterHandler{
    fun onRegisterSavedClicked(view: View)
    fun onRegRadiofemaleButtonClicked(view: View)
    fun onRegRadiomaleButtonClicked(view: View)
    fun onRegRadiootherButtonClicked(view:View)
}
interface HomeDetails
{
    fun onDoneClicked(view: View)
    fun onRadioButtonClicked(view: View)
    fun onRadiofemaleButtonClicked(view: View)
    fun onRadiomaleButtonClicked(view: View)
    fun onRadiootherButtonClicked(view:View)
}

interface FoodDetails

{
    fun onFoodClick(daynumber:Int)
    fun onFoodDetailsClicked(view: View)

}