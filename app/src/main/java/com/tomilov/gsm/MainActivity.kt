package com.tomilov.gsm

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.round


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val eLeft:       EditText? = findViewById(R.id.eLeft)                                           // Левый борт
        eLeft?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }    // Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                             // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {         // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                      // Сантиметры
                val mm = s.toString().substringAfterLast('.')                                   // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                       // Только сантиметры
                            if (sm.toInt() > 188) {                                                     // Больше 188
                                sm = "188"
                                eLeft.setText(sm)
                                eLeft.setSelection(sm.length)
                            }
                            if (sm.toInt() == 0 && before == 0) {                                       // Нуль вначале
                                sm = "0"
                                eLeft.setText("$sm.")
                                eLeft.setSelection(sm.length + 1)
                            }
                        }
                        else {                                                                          // Сантиметры и милиметры
                            if (sm.toInt() > 188) {                                                     // Больше 188
                                sm = "188"
                                eLeft.setText("$sm.$mm")
                                eLeft.setSelection(sm.length + mm.length + 1)
                            }
                        }
                    }
                    else {
                        if (mm.isEmpty() && before == 0) {                                              // Точка вначале
                            sm = "0"
                            eLeft.setText("$sm.")
                            eLeft.setSelection(sm.length + 1)
                        }
                    }
                    if (mm.isNotEmpty()) {                                                              // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                        // Не больше 1 знака после точки
                                eLeft.setText(s?.substring(0, s.length - 1))
                                eLeft.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eRight:      EditText? = findViewById(R.id.eRight)                                          // Правый борт
        eRight?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }    // Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                             // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {         // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                      // Сантиметры
                val mm = s.toString().substringAfterLast('.')                                   // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                       // Только сантиметры
                            if (sm.toInt() > 188) {                                                     // Больше 188
                                sm = "188"
                                eRight.setText(sm)
                                eRight.setSelection(sm.length)
                            }
                            if (sm.toInt() == 0 && before == 0) {                                       // Нуль вначале
                                sm = "0"
                                eRight.setText("$sm.")
                                eRight.setSelection(sm.length + 1)
                            }
                        }
                        else {                                                                          // Сантиметры и милиметры
                            if (sm.toInt() > 188) {                                                     // Больше 188
                                sm = "188"
                                eRight.setText("$sm.$mm")
                                eRight.setSelection(sm.length + mm.length + 1)
                            }
                        }
                    }
                    else {
                        if (mm.isEmpty() && before == 0) {                                              // Точка вначале
                            sm = "0"
                            eRight.setText("$sm.")
                            eRight.setSelection(sm.length + 1)
                        }
                    }
                    if (mm.isNotEmpty()) {                                                              // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                        // Не больше 1 знака после точки
                                eRight.setText(s?.substring(0, s.length - 1))
                                eRight.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eExpense:    EditText? = findViewById(R.id.eExpense)                                        // Расходка
        eExpense?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }    // Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                             // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {         // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                      // Сантиметры
                val mm = s.toString().substringAfterLast('.')                                   // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                       // Только сантиметры
                            if (sm.toInt() > 70) {                                                      // Больше 70
                                sm = "70"
                                eExpense.setText(sm)
                                eExpense.setSelection(sm.length)
                            }
                            if (sm.toInt() == 0 && before == 0) {                                       // Нуль вначале
                                sm = "0"
                                eExpense.setText("$sm.")
                                eExpense.setSelection(sm.length + 1)
                            }
                        }
                        else {                                                                          // Сантиметры и милиметры
                            if (sm.toInt() > 70) {                                                      // Больше 70
                                sm = "70"
                                eExpense.setText("$sm.$mm")
                                eExpense.setSelection(sm.length + mm.length + 1)
                            }
                        }
                    }
                    else {
                        if (mm.isEmpty() && before == 0) {                                              // Точка вначале
                            sm = "0"
                            eExpense.setText("$sm.")
                            eExpense.setSelection(sm.length + 1)
                        }
                    }
                    if (mm.isNotEmpty()) {                                                              // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                        // Не больше 1 знака после точки
                                eExpense.setText(s?.substring(0, s.length - 1))
                                eExpense.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eDensity:    EditText? = findViewById(R.id.eDensity)                                        // Плотность топлива
        eDensity?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }    // выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                             // выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {         // выполняется во время изменения текста.
                var first = s.toString().substringBefore('.')                                   // До точки
                var last = s.toString().substringAfterLast('.')                                 // После точки
                if (s.toString().isNotEmpty()) {
                    if (first == s.toString()) {                                                        // Точки нету
                        if (first.toInt() != 0) {                                                       // Число больше нуля
                            last = first.toInt().toString()
                            first = "0"
                            eDensity.setText("$first.$last")
                            eDensity.setSelection(first.length + last.length + 1)
                        }
                        else {
                            if (first.length >1) {                                                      // Множество нулей
                                first = "0"
                                eDensity.setText(first)
                                eDensity.setSelection(first.length)
                            }
                        }
                    }
                    else {                                                                              // Точка присутствует
                        if (first.isEmpty() || first.toInt() != 0) {                                    // Число перед точкой отсутствует или больше нуля
                            first = "0"
                            eDensity.setText("$first.$last")
                            eDensity.setSelection(first.length + last.length + 1)
                        }
                    }

                }
            }
        })


        val eOil:        EditText? = findViewById(R.id.eOil)                                            // Масло
        eOil?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }    // Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                             // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {         // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                      // Сантиметры
                val mm = s.toString().substringAfterLast('.')                                   // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                       // Только сантиметры
                            if (sm.toInt() > 70) {                                                      // Больше 70
                                sm = "70"
                                eOil.setText(sm)
                                eOil.setSelection(sm.length)
                            }
                            if (sm.toInt() == 0 && before == 0) {                                       // Нуль вначале
                                sm = "0"
                                eOil.setText("$sm.")
                                eOil.setSelection(sm.length + 1)
                            }
                        }
                        else {                                                                          // Сантиметры и милиметры
                            if (sm.toInt() > 70) {                                                      // Больше 70
                                sm = "70"
                                eOil.setText("$sm.$mm")
                                eOil.setSelection(sm.length + mm.length + 1)
                            }
                        }
                    }
                    else {
                        if (mm.isEmpty() && before == 0) {                                              // Точка вначале
                            sm = "0"
                            eOil.setText("$sm.")
                            eOil.setSelection(sm.length + 1)
                        }
                    }
                    if (mm.isNotEmpty()) {                                                              // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                        // Не больше 1 знака после точки
                                eOil.setText(s?.substring(0, s.length - 1))
                                eOil.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eDensityOil: EditText? = findViewById(R.id.eDensityOil)                                     // Плотность масла
        eDensityOil?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }    // выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                             // выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {         // выполняется во время изменения текста.
                var first = s.toString().substringBefore('.')                                   // До точки
                var last = s.toString().substringAfterLast('.')                                 // После точки
                if (s.toString().isNotEmpty()) {
                    if (first == s.toString()) {                                                        // Точки нету
                        if (first.toInt() != 0) {                                                       // Число больше нуля
                            last = first.toInt().toString()
                            first = "0"
                            eDensityOil.setText("$first.$last")
                            eDensityOil.setSelection(first.length + last.length + 1)
                        }
                        else {
                            if (first.length >1) {                                                      // Множество нулей
                                first = "0"
                                eDensityOil.setText(first)
                                eDensityOil.setSelection(first.length)
                            }
                        }
                    }
                    else {                                                                              // Точка присутствует
                        if (first.isEmpty() || first.toInt() != 0) {                                    // Число перед точкой отсутствует или больше нуля
                            first = "0"
                            eDensityOil.setText("$first.$last")
                            eDensityOil.setSelection(first.length + last.length + 1)
                        }
                    }

                }
            }
        })


        val bCount:      Button?  = findViewById(R.id.bCount)
        bCount?.setOnClickListener {
            val sDensity = eDensity?.text.toString()
            val tOutputLeft:    TextView? = findViewById(R.id.tOutputLeft)
            val tOutputRight:   TextView? = findViewById(R.id.tOutputRight)
            val tOutputExpense: TextView? = findViewById(R.id.tOutputExpense)
            val tOutputResult:  TextView? = findViewById(R.id.tOutputResult)

            if (sDensity.isNotEmpty()) {
                val dDensity: Double = sDensity.toDouble()                                              //Плотность
                if (dDensity > 0.8600 || dDensity < 0.8000) {
                    tOutputLeft?.text = getString(R.string.zero)
                    tOutputRight?.text = getString(R.string.zero)
                    tOutputExpense?.text = getString(R.string.zero)
                    tOutputResult?.text = getString(R.string.zero)
                    return@setOnClickListener                                                           // Если не правильно возвращаемся
                }

                val a = doubleArrayOf(354.2, 697.2, 1040.2, 1383.2, 1726.2, 2069.2, 2412.2, 2755.2, 3098.2, 3441.2, 3784.2, 4127.2, 4470.2, 4813.2, 5156.2, 5499.2, 5842.2, 6185.2, 6528.2, 6871.2, 7214.2, 7557.2, 7900.2, 8243.2, 8586.2, 8929.2, 9272.2, 9615.2, 9958.2, 10301.2, 10644.2, 10987.2, 11330.2, 11673.2, 12016.2, 12359.2, 12702.2, 13045.2, 13388.2, 13731.2, 14074.2, 14417.2, 14760.2, 15103.2, 15446.2, 15789.2, 16134.2, 16479.2, 16824.2, 17169.2, 17514.2, 17859.2, 18204.2, 18549.2, 18894.2, 19239.2, 19584.2, 19929.2, 20274.2, 20619.2, 20964.2, 21309.2, 21654.2, 21999.2, 22344.2, 22689.2, 23034.2, 23379.2, 23724.2, 24069.2, 24414.2, 24759.2, 25104.2, 25449.2, 25794.2, 26139.2, 26484.2, 26829.2, 27174.2, 27519.2, 27864.2, 28209.2, 28554.2, 28899.2, 29244.2, 29589.2, 29934.2, 30279.2, 30624.2, 30969.2, 31314.2, 31659.2, 32004.2, 32349.2, 32694.2, 33039.2, 33384.2, 33729.2, 34074.2, 34419.2, 34764.2, 35109.2, 35454.2, 35799.2, 36144.2, 36489.2, 36834.2, 37179.2, 37524.2, 37869.2, 38214.2, 38559.2, 38904.2, 39249.2, 39594.2, 39939.2, 40284.2, 40629.2, 40974.2, 41319.2, 41664.2, 42009.2, 42354.2, 42699.2, 43044.2, 43389.2, 43734.2, 44079.2, 44424.2, 44769.2, 45114.2, 45459.2, 45804.2, 46149.2, 46494.2, 46839.2, 47184.2, 47529.2, 47874.2, 48219.2, 48564.2, 48909.2, 49254.2, 49599.2, 49944.2, 50289.2, 50634.2, 50979.2, 51324.2, 51669.2, 52014.2, 52359.2, 52704.2, 53049.2, 53394.2, 53739.2, 54084.2, 54429.2, 54774.2, 55119.2, 55464.2, 55809.2, 56154.2, 56499.2, 56844.2, 57189.2, 57534.2, 57879.2, 58224.2, 58569.2, 58914.2, 59259.2, 59604.2, 59949.2, 60294.2, 60639.2, 60984.2, 61329.2, 61674.2, 62019.2, 62364.2, 62709.2, 63054.2, 63399.2, 63744.2, 64089.2, 64434.2, 64779.2, 65124.2)
                val b = doubleArrayOf(0.0, 34.3, 68.6, 102.9, 137.2, 171.5, 205.8, 240.1, 274.4, 308.7)
                val c = doubleArrayOf(0.0, 34.5, 69.0, 103.5, 138.0, 172.5, 207.0, 241.5, 276.0, 310.5)


                var dExpense: Double? = null                                                            // Расходка
                val sExpense = eExpense?.text.toString()
                if (sExpense.isNotEmpty()) {
                    dExpense = dDensity * sExpense.toDouble() * 22
                    dExpense =
                        round(dExpense * 1000.0) / 1000.0                                            // Округление 3 знака после запятой
                    tOutputExpense?.text = "$dExpense"
                }
                else tOutputExpense?.text = getString(R.string.zero)


                var dLeft: Double? = null                                                               // Левый борт
                val sLeft = eLeft?.text.toString()
                if (sLeft.isNotEmpty()) {
                    val sm = sLeft.substringBefore('.')                                         // Сантиметры
                    val mm = sLeft.substringAfterLast('.')                                      // Милиметры
                    if (mm == sLeft){                                                                   // Только сантиметры
                        val ism: Int = sm.toInt()
                        dLeft = a[ism] * dDensity
                    }
                    else {                                                                              // Сантиметры и милиметры
                        val ism: Int = if (sm == "") 0
                        else sm.toInt()
                        val imm: Int = if (mm == "") 0
                        else mm.toInt()
                        when (ism) {
                            in 0..45    -> dLeft = (a[ism] + b[imm]) * dDensity                   // Уровень 0 - 45.9
                            in 46..188  -> dLeft = (a[ism] + c[imm]) * dDensity                   // Уровень 46 - 188.9
                        }
                    }
                    if (dLeft != null) {
                        dLeft = round(dLeft * 1000.0) / 1000.0                                       // Округление 3 знака после запятой
                        tOutputLeft?.text = "$dLeft"
                    }
                }
                else tOutputLeft?.text = getString(R.string.zero)


                var dRight: Double? = null                                                              // Правый борт
                val sRight = eRight?.text.toString()
                if (sRight.isNotEmpty()) {
                    val sm = sRight.substringBefore('.')                                        // Сантиметры
                    val mm = sRight.substringAfterLast('.')                                     // Милиметры
                    if (mm == sRight){                                                                  // Только сантиметры
                        val ism: Int = sm.toInt()
                        dRight = a[ism] * dDensity
                    }
                    else {                                                                              // Сантиметры и милиметры
                        val ism: Int = if (sm == "") 0
                        else sm.toInt()
                        val imm: Int = if (mm == "") 0
                        else mm.toInt()
                        when (ism) {
                            in 0..45    -> dRight = (a[ism] + b[imm]) * dDensity                  // Уровень 0 - 45.9
                            in 46..188  -> dRight = (a[ism] + c[imm]) * dDensity                  // Уровень 46 - 188.9
                        }
                    }
                    if (dRight != null) {
                        dRight = round(dRight * 1000.0) / 1000.0                                     // Округление 3 знака после запятой
                        tOutputRight?.text = "$dRight"
                    }
                }
                else tOutputRight?.text = getString(R.string.zero)


                var dResult: Double? = null                                                             // Итог
                if (dExpense != null) {
                    if (dRight != null) {
                        if (dLeft != null) {
                            dResult = (dRight + dLeft) / 2 + dExpense
                        }
                    }
                }
                if (dResult != null) {
                    dResult = round(dResult * 1000.0) / 1000.0                                       // Округление 3 знака после запятой
                    tOutputResult?.text = "$dResult"
                }
                else tOutputResult?.text = getString(R.string.zero)
            }
            else {
                tOutputLeft?.text = getString(R.string.zero)
                tOutputRight?.text = getString(R.string.zero)
                tOutputExpense?.text = getString(R.string.zero)
                tOutputResult?.text = getString(R.string.zero)
            }


            val sDensityOil = eDensityOil?.text.toString()
            if (sDensityOil.isNotEmpty()) {
                val tOutputOil:     TextView? = findViewById(R.id.tOutputOil)
                val dDensityOil: Double = sDensityOil.toDouble()                                        //Плотность масла
                if (dDensityOil < 0.8900 || dDensityOil > 0.9300) {
                    tOutputOil?.text = getString(R.string.zero)
                    return@setOnClickListener                                                           // Если не правильно возвращаемся
                }

                val sOil = eOil?.text.toString()                                                        // Масло
                if (sOil.isNotEmpty()) {
                    var dOil: Double = sOil.toDouble() * dDensityOil * 22
                    dOil = round(dOil * 1000.0) / 1000.0
                    tOutputOil?.text = "$dOil"
                } else tOutputOil?.text = getString(R.string.zero)
            }
        }
    }
}
