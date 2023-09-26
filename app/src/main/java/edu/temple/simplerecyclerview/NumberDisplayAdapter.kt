package edu.temple.simplerecyclerview

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation
/* Step 3a: Provide Adapter Parent */
class NumberDisplayAdapter (_numbers: Array<int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    private val numbers = _numbers
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    //Step 3b: Complete function definitions for adapter

}