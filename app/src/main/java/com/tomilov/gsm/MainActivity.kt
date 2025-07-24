package com.tomilov.gsm

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlin.math.round



class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val eLeft:       EditText? = findViewById(R.id.eLeft)                                  // Левый борт
        eLeft?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }// Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                         // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {     // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                // Сантиметры
                val mm = s.toString().substringAfterLast('.')                             // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (s.toString() == ".") {
                        eLeft.setText("")
                    }
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                   // Только сантиметры
                            if (sm.toInt() > 188) {                                                 // Больше 188
                                sm = "188"
                                eLeft.setText(sm)
                                eLeft.setSelection(sm.length)
                            }
                        }
                        else {                                                                      // Сантиметры и милиметры
                            if (sm.toInt() == 188) {                                                // Больше 188
                                sm = "188"
                                eLeft.setText(sm)
                                eLeft.setSelection(sm.length)
                            }
                        }
                    }
                    if (mm.isNotEmpty()) {                                                          // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                    // Не больше 1 знака после точки
                                eLeft.setText(s?.substring(0, s.length - 1))
                                eLeft.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eRight:      EditText? = findViewById(R.id.eRight)                                 // Правый борт
        eRight?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }// Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                         // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {     // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                // Сантиметры
                val mm = s.toString().substringAfterLast('.')                             // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (s.toString() == ".") {
                        eRight.setText("")
                    }
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                   // Только сантиметры
                            if (sm.toInt() > 188) {                                                 // Больше 188
                                sm = "188"
                                eRight.setText(sm)
                                eRight.setSelection(sm.length)
                            }
                        }
                        else {                                                                      // Сантиметры и милиметры
                            if (sm.toInt() >= 188) {                                                // Больше 188
                                sm = "188"
                                eRight.setText(sm)
                                eRight.setSelection(sm.length)
                            }
                        }
                    }
                    if (mm.isNotEmpty()) {                                                          // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                    // Не больше 1 знака после точки
                                eRight.setText(s?.substring(0, s.length - 1))
                                eRight.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eExpense:    EditText? = findViewById(R.id.eExpense)                               // Расходка
        eExpense?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }// Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                         // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {     // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                // Сантиметры
                val mm = s.toString().substringAfterLast('.')                             // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (s.toString() == ".") {
                        eExpense.setText("")
                    }
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                   // Только сантиметры
                            if (sm.toInt() > 70) {                                                  // Больше 70
                                sm = "70"
                                eExpense.setText(sm)
                                eExpense.setSelection(sm.length)
                            }
                        }
                        else {                                                                      // Сантиметры и милиметры
                            if (sm.toInt() == 70) {                                                 // Больше 70
                                sm = "70"
                                eExpense.setText(sm)
                                eExpense.setSelection(sm.length)
                            }
                        }
                    }
                    if (mm.isNotEmpty()) {                                                          // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                    // Не больше 1 знака после точки
                                eExpense.setText(s?.substring(0, s.length - 1))
                                eExpense.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eDensity:    EditText? = findViewById(R.id.eDensity)                               // Плотность топлива
        eDensity?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }// выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                         // выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {     // выполняется во время изменения текста.
                var first = s.toString().substringBefore('.')                             // До точки
                var last = s.toString().substringAfterLast('.')                           // После точки
                if (s.toString().isNotEmpty()) {
                    if (first == s.toString()) {                                                    // Точки нету
                        if (first.toInt() != 0) {                                                   // Число больше нуля
                            last = first.toInt().toString()
                            first = "0"
                            eDensity.setText("$first.$last")
                            eDensity.setSelection(first.length + last.length + 1)
                        }
                        else {
                            if (first.length >1) {                                                  // Множество нулей
                                first = "0"
                                eDensity.setText(first)
                                eDensity.setSelection(first.length)
                            }
                        }
                    }
                    else {                                                                          // Точка присутствует
                        if (first.isEmpty() || first.toInt() != 0) {                                // Число перед точкой отсутствует или больше нуля
                            first = "0"
                            eDensity.setText("$first.$last")
                            eDensity.setSelection(first.length + last.length + 1)
                        }
                    }

                }
            }
        })


        val eOil:        EditText? = findViewById(R.id.eOil)                                   // Масло
        eOil?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }// Выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                         // Выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {     // Выполняется во время изменения текста.
                var sm = s.toString().substringBefore('.')                                // Сантиметры
                val mm = s.toString().substringAfterLast('.')                             // Милиметры
                if (s.toString().isNotEmpty()) {
                    if (s.toString() == ".") {
                        eOil.setText("")
                    }
                    if (sm.isNotEmpty()) {
                        if (sm == s.toString()) {                                                   // Только сантиметры
                            if (sm.toInt() > 70) {                                                  // Больше 70
                                sm = "70"
                                eOil.setText(sm)
                                eOil.setSelection(sm.length)
                            }
                        }
                        else {                                                                      // Сантиметры и милиметры
                            if (sm.toInt() == 70) {                                                 // Больше 70
                                sm = "70"
                                eOil.setText(sm)
                                eOil.setSelection(sm.length)
                            }
                        }
                    }
                    if (mm.isNotEmpty()) {                                                          // Только милиметры
                        if (mm != s.toString()) {
                            if (mm.length > 1) {                                                    // Не больше 1 знака после точки
                                eOil.setText(s?.substring(0, s.length - 1))
                                eOil.setSelection(s!!.length - 1)
                            }
                        }
                    }
                }
            }
        })


        val eDensityOil: EditText? = findViewById(R.id.eDensityOil)                            // Плотность масла
        eDensityOil?.addTextChangedListener(object :TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }// выполняется перед изменением текста.
            override fun afterTextChanged(s: Editable?) { }                                         // выполняется после изменения текста.
            @SuppressLint("SetTextI18n")
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {     // выполняется во время изменения текста.
                var first = s.toString().substringBefore('.')                             // До точки
                var last = s.toString().substringAfterLast('.')                           // После точки
                if (s.toString().isNotEmpty()) {
                    if (first == s.toString()) {                                                    // Точки нету
                        if (first.toInt() != 0) {                                                   // Число больше нуля
                            last = first.toInt().toString()
                            first = "0"
                            eDensityOil.setText("$first.$last")
                            eDensityOil.setSelection(first.length + last.length + 1)
                        }
                        else {
                            if (first.length >1) {                                                  // Множество нулей
                                first = "0"
                                eDensityOil.setText(first)
                                eDensityOil.setSelection(first.length)
                            }
                        }
                    }
                    else {                                                                          // Точка присутствует
                        if (first.isEmpty() || first.toInt() != 0) {                                // Число перед точкой отсутствует или больше нуля
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

            val tOutputLeft:    TextView? = findViewById(R.id.tOutputLeft)
            val tOutputRight:   TextView? = findViewById(R.id.tOutputRight)
            val tOutputExpense: TextView? = findViewById(R.id.tOutputExpense)
            val tOutputResult:  TextView? = findViewById(R.id.tOutputResult)
            val tOutputOil: TextView? = findViewById(R.id.tOutputOil)

            if (eDensity?.text.toString().isNotEmpty()) {

                val dDensity: Double = eDensity?.text.toString().toDouble()                         //Плотность
                if (dDensity > 0.6890 && dDensity < 0.9990) {
                    val a = doubleArrayOf(317.1, 636.7, 959.4, 1284.0, 1610.6, 1939.3, 2269.9, 2601.6, 2934.2, 3267.8, 3603.5, 3939.1, 4275.8, 4614.4, 4953.0, 5292.7, 5632.3, 5973.9, 6315.6, 6658.2, 7000.9, 7344.5, 7688.1, 8032.8, 8377.4, 8723.1, 9068.7, 9415.3, 9762.0, 10108.6, 10456.3, 10802.9, 11151.5, 11499.2, 11847.8, 12196.5, 12545.1, 12893.7, 13242.4, 13592.0, 13940.6, 14290.3, 14639.9, 14988.6, 15337.1, 15685.7, 16034.3, 16382.9, 16731.5, 17080.1, 17428.6, 17777.2, 18125.8, 18474.4, 18823.0, 19171.6, 19520.1, 19868.7, 20217.3, 20565.9, 20914.5, 21263.0, 21611.6, 21960.2, 22308.8, 22657.4, 23006.0, 23354.5, 23703.1, 24051.7, 24400.3, 24748.9, 25097.5, 25446.0, 25794.6, 26143.2, 26491.8, 26840.4, 27188.9, 27537.5, 27886.1, 28234.7, 28583.3, 28931.9, 29280.4, 29629.0, 29977.6, 30326.2, 30674.8, 31023.4, 31371.9, 31720.5, 32069.1, 32417.7, 32766.3, 33114.8, 33463.4, 33812.0, 34160.6, 34509.2, 34857.8, 35206.3, 35554.9, 35903.5, 36252.1, 36600.7, 36949.3, 37297.8, 37646.4, 37995.0, 38343.6, 38692.2, 39040.7, 39389.3, 39737.9, 40086.5, 40435.1, 40783.7, 41132.2, 41480.8, 41829.4, 42178.0, 42526.6, 42875.1, 43223.7, 43572.3, 43920.9, 44269.5, 44618.1, 44966.6, 45315.2, 45663.8, 46012.4, 46361.0, 46709.6, 47058.1, 47406.7, 47755.3, 48103.9, 48452.5, 48801.0, 49149.6, 49498.2, 49846.8, 50195.4, 50544.0, 50892.5, 51241.1, 51589.7, 51938.3, 52286.9, 52635.5, 52984.0, 53332.6, 53681.2, 54029.8, 54378.4, 54726.9, 55075.5, 55424.1, 55772.7, 56121.3, 56469.9, 56818.4, 57167.0, 57515.6, 57864.2, 58212.8, 58561.4, 58909.9, 59258.5, 59607.1, 59955.7, 60304.3, 60652.8, 61001.4, 61350.0, 61698.6, 62047.2, 62395.8, 62744.3, 63092.9, 63441.5, 63790.1, 64138.7, 64487.3, 64835.8, 65184.4, 65533.0, 0.0)

                    var dExpense: Double? = null                                                    // Расходка

                    if (eExpense?.text.toString().isNotEmpty()) {
                        dExpense = dDensity * eExpense?.text.toString().toDouble() * 22
                        dExpense = round(dExpense * 1000.0) / 1000.0                            // Округление 3 знака после запятой
                        tOutputExpense?.text = "$dExpense"
                    } else tOutputExpense?.text = getString(R.string.zero)


                    var dLeft: Double? = null                                                       // Левый борт

                    if (eLeft?.text.toString().isNotEmpty()) {
                        val sm = eLeft?.text.toString().substringBefore('.')              // Сантиметры
                        val mm = eLeft?.text.toString().substringAfterLast('.')           // Милиметры
                        if (mm == eLeft?.text.toString() || sm.toInt() == 188) {                    // Только сантиметры
                            val ism: Int = sm.toInt()
                            dLeft = a[ism] * dDensity
                        } else {                                                                    // Сантиметры и милиметры
                            val ism: Int = sm.toInt()
                            val imm: Int = mm.toInt()
                            dLeft = (a[ism] + ((a[ism + 1] - a[ism]) / 10) * imm) * dDensity
                        }
                        dLeft =  round(dLeft * 1000.0) / 1000.0                                 // Округление 3 знака после запятой
                        tOutputLeft?.text = "$dLeft"
                    } else tOutputLeft?.text = getString(R.string.zero)


                    var dRight: Double? = null                                                      // Правый борт

                    if (eRight?.text.toString().isNotEmpty()) {
                        val sm = eRight?.text.toString().substringBefore('.')             // Сантиметры
                        val mm = eRight?.text.toString().substringAfterLast('.')          // Милиметры
                        if (mm == eRight?.text.toString() || sm.toInt() == 188) {                   // Только сантиметры
                            val ism: Int = sm.toInt()
                            dRight = a[ism] * dDensity
                        } else {                                                                    // Сантиметры и милиметры
                            val ism: Int = sm.toInt()
                            val imm: Int = mm.toInt()
                            dRight = (a[ism] + ((a[ism + 1] - a[ism]) / 10) * imm) * dDensity
                        }
                        dRight = round(dRight * 1000.0) / 1000.0                                // Округление 3 знака после запятой
                        tOutputRight?.text = "$dRight"
                    } else tOutputRight?.text = getString(R.string.zero)

                    if (dExpense != null && dRight != null && dLeft != null) {                      // Итог
                        var dResult: Double  = (dRight + dLeft) / 2 + dExpense
                        dResult = round(dResult * 1000.0) / 1000.0                              // Округление 3 знака после запятой
                        tOutputResult?.text = "$dResult"
                    } else tOutputResult?.text = getString(R.string.zero)
                } else {
                    tOutputLeft?.text = getString(R.string.zero)
                    tOutputRight?.text = getString(R.string.zero)
                    tOutputExpense?.text = getString(R.string.zero)
                    tOutputResult?.text = getString(R.string.zero)
                }
            } else {
                tOutputLeft?.text = getString(R.string.zero)
                tOutputRight?.text = getString(R.string.zero)
                tOutputExpense?.text = getString(R.string.zero)
                tOutputResult?.text = getString(R.string.zero)

            }

            if (eDensityOil?.text.toString().isNotEmpty()) {                                        // Масло
                val dDensityOil: Double = eDensityOil?.text.toString().toDouble()                   //Плотность масла
                if (dDensityOil > 0.7490 && dDensityOil < 0.9990) {
                    if (eOil?.text.toString() .isNotEmpty()) {
                        var dOil: Double = eOil?.text.toString().toDouble() * dDensityOil * 22
                        dOil = round(dOil * 1000.0) / 1000.0
                        tOutputOil?.text = "$dOil"
                    } else tOutputOil?.text = getString(R.string.zero)
                } else tOutputOil?.text = getString(R.string.zero)
            } else tOutputOil?.text = getString(R.string.zero)
        }

        val bSend:      Button?  = findViewById(R.id.bSend)
        bSend?.setOnClickListener {
            val tOutputResult:  TextView? = findViewById(R.id.tOutputResult)
            val tOutputOil:     TextView? = findViewById(R.id.tOutputOil)
            val fuel: Double = tOutputResult?.text.toString().toDouble()
            val fuelOut: Int = round(fuel).toInt()
            val oil: Double = tOutputOil?.text.toString().toDouble()
            val oilOut: Int = round(oil).toInt()

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, getString(R.string.fuel) + ": " + fuelOut + "  " + getString(R.string.oil) + ": " + oilOut )
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}