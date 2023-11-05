package com.sapq12.simpletoasterdependency

import android.content.Context
import android.widget.Toast


fun Toaster(context: Context){
    Toast.makeText(context, "Called", Toast.LENGTH_SHORT).show()
}