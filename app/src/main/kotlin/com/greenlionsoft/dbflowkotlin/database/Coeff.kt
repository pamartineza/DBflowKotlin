package com.greenlionsoft.dbflowkotlin.database

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

@Table(database = AppDatabase::class)
class Coeff : BaseModel(), ICoeff {

    @PrimaryKey(autoincrement = true) var id: Int = 0
    @Column var day: Int? = null
    @Column var month: Int? = null
    @Column var year: Int? = null
    @Column var c0: String? = null
    @Column var c12: String? = null

    override fun getDayInt(): Int? {
        return day
    }

    override fun getMonthInt(): Int? {
        return month
    }

    override fun getYearInt(): Int? {
        return year
    }

    override fun getC0String(): String? {
        return c0
    }

    override fun getC12String(): String? {
        return c12
    }

}