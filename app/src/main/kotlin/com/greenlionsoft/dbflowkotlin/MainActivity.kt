package com.greenlionsoft.dbflowkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.greenlionsoft.dbflowkotlin.database.Coeff
import com.greenlionsoft.dbflowkotlin.database.Coeff_Table
import com.raizlabs.android.dbflow.sql.language.SQLite

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coeff: Coeff? = SQLite.select().from(Coeff::class.java)
                .where(Coeff_Table.day.`is`(1))
                .and(Coeff_Table.month.`is`(1))
                .and(Coeff_Table.year.`is`(2016)).querySingle()

        Log.d("COEFF", coeff?.c0 + " " + coeff?.c12)
    }
}
