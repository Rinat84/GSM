package com.tomilov.gsm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


    val eLeft:       EditText? = findViewById(R.id.eLeft)                                           // Левый борт
    eLeft?.addTextChangedListener(object :TextWatcher {
      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }      // Выполняется перед изменением текста.
      override fun afterTextChanged(s: Editable?) { }                                               // Выполняется после изменения текста.
      @SuppressLint("SetTextI18n")
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {           // Выполняется во время изменения текста.
        var sm = s.toString().substringBefore('.')                                          // Сантиметры
        val mm = s.toString().substringAfterLast('.')                                       // Милиметры
        if (s.toString().isNotEmpty()) {
          if (sm.isNotEmpty()) {
            if (sm == s.toString()) {                                                               // Только сантиметры
              if (sm.toInt() > 188) {                                                               // Больше 188
                sm = "188"
                eLeft.setText(sm)
                eLeft.setSelection(sm.length)
              }
              if (sm.toInt() == 0 && before == 0) {                                                 // Нуль вначале
                sm = "0"
                eLeft.setText("$sm.")
                eLeft.setSelection(sm.length + 1)
              }
            }
            else {                                                                                  // Сантиметры и милиметры
              if (sm.toInt() > 188) {                                                               // Больше 188
                sm = "188"
                eLeft.setText("$sm.$mm")
                eLeft.setSelection(sm.length + mm.length + 1)
              }
            }
          }
          else {
            if (mm.isEmpty() && before == 0) {                                                      // Точка вначале
              sm = "0"
              eLeft.setText("$sm.")
              eLeft.setSelection(sm.length + 1)
            }
          }
          if (mm.isNotEmpty()) {                                                                    // Только милиметры
            if (mm != s.toString()) {
              if (mm.length > 1) {                                                                  // Не больше 1 знака после точки
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
      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }      // Выполняется перед изменением текста.
      override fun afterTextChanged(s: Editable?) { }                                               // Выполняется после изменения текста.
      @SuppressLint("SetTextI18n")
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {           // Выполняется во время изменения текста.
        var sm = s.toString().substringBefore('.')                                          // Сантиметры
        val mm = s.toString().substringAfterLast('.')                                       // Милиметры
        if (s.toString().isNotEmpty()) {
          if (sm.isNotEmpty()) {
            if (sm == s.toString()) {                                                               // Только сантиметры
              if (sm.toInt() > 188) {                                                               // Больше 188
                sm = "188"
                eRight.setText(sm)
                eRight.setSelection(sm.length)
              }
              if (sm.toInt() == 0 && before == 0) {                                                 // Нуль вначале
                sm = "0"
                eRight.setText("$sm.")
                eRight.setSelection(sm.length + 1)
              }
            }
            else {                                                                                  // Сантиметры и милиметры
              if (sm.toInt() > 188) {                                                               // Больше 188
                sm = "188"
                eRight.setText("$sm.$mm")
                eRight.setSelection(sm.length + mm.length + 1)
              }
            }
          }
          else {
            if (mm.isEmpty() && before == 0) {                                                      // Точка вначале
              sm = "0"
              eRight.setText("$sm.")
              eRight.setSelection(sm.length + 1)
            }
          }
          if (mm.isNotEmpty()) {                                                                    // Только милиметры
            if (mm != s.toString()) {
              if (mm.length > 1) {                                                                  // Не больше 1 знака после точки
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
      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }      // Выполняется перед изменением текста.
      override fun afterTextChanged(s: Editable?) { }                                               // Выполняется после изменения текста.
      @SuppressLint("SetTextI18n")
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {           // Выполняется во время изменения текста.
        var sm = s.toString().substringBefore('.')                                          // Сантиметры
        val mm = s.toString().substringAfterLast('.')                                       // Милиметры
        if (s.toString().isNotEmpty()) {
          if (sm.isNotEmpty()) {
            if (sm == s.toString()) {                                                               // Только сантиметры
              if (sm.toInt() > 70) {                                                                // Больше 70
                sm = "70"
                eExpense.setText(sm)
                eExpense.setSelection(sm.length)
              }
              if (sm.toInt() == 0 && before == 0) {                                                 // Нуль вначале
                sm = "0"
                eExpense.setText("$sm.")
                eExpense.setSelection(sm.length + 1)
              }
            }
            else {                                                                                  // Сантиметры и милиметры
              if (sm.toInt() > 70) {                                                                // Больше 70
                sm = "70"
                eExpense.setText("$sm.$mm")
                eExpense.setSelection(sm.length + mm.length + 1)
              }
            }
          }
          else {
            if (mm.isEmpty() && before == 0) {                                                      // Точка вначале
              sm = "0"
              eExpense.setText("$sm.")
              eExpense.setSelection(sm.length + 1)
            }
          }
          if (mm.isNotEmpty()) {                                                                    // Только милиметры
            if (mm != s.toString()) {
              if (mm.length > 1) {                                                                  // Не больше 1 знака после точки
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
      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }      // выполняется перед изменением текста.
      override fun afterTextChanged(s: Editable?) { }                                               // выполняется после изменения текста.
      @SuppressLint("SetTextI18n")
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {           // выполняется во время изменения текста.
        var first = s.toString().substringBefore('.')                                       // До точки
        var last = s.toString().substringAfterLast('.')                                     // После точки
        if (s.toString().isNotEmpty()) {
          if (first == s.toString()) {                                                              // Точки нету
            if (first.toInt() != 0) {                                                               // Число больше нуля
              last = first.toInt().toString()
              first = "0"
              eDensity.setText("$first.$last")
              eDensity.setSelection(first.length + last.length + 1)
            }
            else {
              if (first.length >1) {                                                                // Множество нулей
                first = "0"
                eDensity.setText(first)
                eDensity.setSelection(first.length)
              }
            }
          }
          else {                                                                                    // Точка присутствует
            if (first.isEmpty() || first.toInt() != 0) {                                            // Число перед точкой отсутствует или больше нуля
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
      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }      // Выполняется перед изменением текста.
      override fun afterTextChanged(s: Editable?) { }                                               // Выполняется после изменения текста.
      @SuppressLint("SetTextI18n")
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {           // Выполняется во время изменения текста.
        var sm = s.toString().substringBefore('.')                                          // Сантиметры
        val mm = s.toString().substringAfterLast('.')                                       // Милиметры
        if (s.toString().isNotEmpty()) {
          if (sm.isNotEmpty()) {
            if (sm == s.toString()) {                                                               // Только сантиметры
              if (sm.toInt() > 70) {                                                                // Больше 70
                sm = "70"
                eOil.setText(sm)
                eOil.setSelection(sm.length)
              }
              if (sm.toInt() == 0 && before == 0) {                                                 // Нуль вначале
                sm = "0"
                eOil.setText("$sm.")
                eOil.setSelection(sm.length + 1)
              }
            }
            else {                                                                                  // Сантиметры и милиметры
              if (sm.toInt() > 70) {                                                                // Больше 70
                sm = "70"
                eOil.setText("$sm.$mm")
                eOil.setSelection(sm.length + mm.length + 1)
              }
            }
          }
          else {
            if (mm.isEmpty() && before == 0) {                                                      // Точка вначале
              sm = "0"
              eOil.setText("$sm.")
              eOil.setSelection(sm.length + 1)
            }
          }
          if (mm.isNotEmpty()) {                                                                    // Только милиметры
            if (mm != s.toString()) {
              if (mm.length > 1) {                                                                  // Не больше 1 знака после точки
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
      override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }      // выполняется перед изменением текста.
      override fun afterTextChanged(s: Editable?) { }                                               // выполняется после изменения текста.
      @SuppressLint("SetTextI18n")
      override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {           // выполняется во время изменения текста.
        var first = s.toString().substringBefore('.')                                       // До точки
        var last = s.toString().substringAfterLast('.')                                     // После точки
        if (s.toString().isNotEmpty()) {
          if (first == s.toString()) {                                                              // Точки нету
            if (first.toInt() != 0) {                                                               // Число больше нуля
              last = first.toInt().toString()
              first = "0"
              eDensityOil.setText("$first.$last")
              eDensityOil.setSelection(first.length + last.length + 1)
            }
            else {
              if (first.length >1) {                                                                // Множество нулей
                first = "0"
                eDensityOil.setText(first)
                eDensityOil.setSelection(first.length)
              }
            }
          }
          else {                                                                                    // Точка присутствует
            if (first.isEmpty() || first.toInt() != 0) {                                            // Число перед точкой отсутствует или больше нуля
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
        val dDensity: Double = sDensity.toDouble()                                                  //Плотность
        if (dDensity > 0.8600 || dDensity < 0.8000) {
          tOutputLeft?.text = "0"
          tOutputRight?.text = "0"
          tOutputExpense?.text = "0"
          tOutputResult?.text = "0"
          return@setOnClickListener                                                                 // Если не правильно возвращаемся
        }

        val a = doubleArrayOf(0.0, 326.0, 652.0, 977.0, 1303.0, 1629.0, 1955.0, 2281.0, 2606.0, 2932.0, 3258.0, 3584.0, 3910.0, 4235.0, 4561.0, 4887.0, 5213.0, 5526.0, 5854.0, 6182.0, 6510.0, 6838.0, 7166.0, 7494.0, 7821.0, 8149.0, 8477.0, 8805.0, 9133.0, 9461.0, 9789.0, 10116.0, 10444.0, 10772.0, 11100.0, 11428.0, 11756.0, 12084.0, 12411.0, 12739.0, 13067.0, 13395.0, 13723.0, 14051.0, 14379.0, 14706.0, 15034.0, 15378.0, 15726.0, 16075.0, 16423.0, 16771.0, 17119.0, 17467.0, 17815.0, 18163.0, 18511.0, 18860.0, 19208.0, 19556.0, 19904.0, 20252.0, 20600.0, 20948.0, 21296.0, 21644.0, 21993.0, 22341.0, 22689.0, 23037.0, 23385.0, 23733.0, 24081.0, 24429.0, 24778.0, 25126.0, 25474.0, 25822.0, 26170.0, 26518.0, 26866.0, 27214.0, 27563.0, 27911.0, 28259.0, 28607.0, 28955.0, 29303.0, 29651.0, 29999.0, 30347.0, 30696.0, 31044.0, 31392.0, 31740.0, 32088.0, 32436.0, 32784.0, 33132.0, 33481.0, 33829.0, 34177.0, 34525.0, 34873.0, 35221.0, 35569.0, 35917.0, 36265.0, 36614.0, 36962.0, 37310.0, 37658.0, 38006.0, 38354.0, 38702.0, 39050.0, 39369.0, 39747.0, 40095.0, 40443.0, 40792.0, 41140.0, 41489.0, 41837.0, 42186.0, 42534.0, 42883.0, 43231.0, 43579.0, 43928.0, 44276.0, 44625.0, 44973.0, 45322.0, 45670.0, 46018.0, 46367.0, 46715.0, 47064.0, 47412.0, 47761.0, 48109.0, 48457.0, 48806.0, 49154.0, 49503.0, 49851.0, 50200.0, 50548.0, 50897.0, 51245.0, 51593.0, 51942.0, 52290.0, 52639.0, 52987.0, 53336.0, 53684.0, 54032.0, 54381.0, 54729.0, 55078.0, 55426.0, 55775.0, 56123.0, 56471.0, 56820.0, 57168.0, 57517.0, 57865.0, 58214.0, 58562.0, 58911.0, 59259.0, 59607.0, 59956.0, 60304.0, 60653.0, 61001.0, 61350.0, 61698.0, 62046.0, 62395.0, 62743.0, 63092.0, 63440.0, 63789.0, 64137.0, 64486.0)
        val b = doubleArrayOf(0.0, 32.7, 65.4, 98.1,  130.7, 163.4, 196.1, 228.8, 261.5, 294.2)
        val c = doubleArrayOf(0.0, 34.8, 69.6, 104.4, 139.2, 174.1, 208.9, 243.7, 278.5, 313.3)
        val d = doubleArrayOf(0.0, 34.8, 69.7, 104.5, 139.4, 174.2, 209.1, 243.9, 278.7, 313.6)


        var dExpense: Double? = null                                                                // Расходка
        val sExpense = eExpense?.text.toString()
        if (sExpense.isNotEmpty()) {
          dExpense = dDensity * sExpense.toDouble() * 22
          dExpense =
            round(dExpense * 1000.0) / 1000.0                                                    // Округление 3 знака после запятой
          tOutputExpense?.text = "$dExpense"
        }
        else tOutputExpense?.text = "0"


        var dLeft: Double? = null                                                                   // Левый борт
        val sLeft = eLeft?.text.toString()
        if (sLeft.isNotEmpty()) {
          val sm = sLeft.substringBefore('.')                                               // Сантиметры
          val mm = sLeft.substringAfterLast('.')                                            // Милиметры
          if (mm == sLeft){                                                                         // Только сантиметры
            val ism: Int = sm.toInt()
            dLeft = a[ism] * dDensity
          }
          else {                                                                                    // Сантиметры и милиметры
            val ism: Int = if (sm == "") 0
            else sm.toInt()
            val imm: Int = if (mm == "") 0
            else mm.toInt()
            when (ism) {
              in 0..46    -> dLeft = (a[ism] + b[imm]) * dDensity                             // Уровень 0 - 46.9
              in 47..117  -> dLeft = (a[ism] + c[imm]) * dDensity                             // Уровень 47 - 117.9
              in 118..188 -> dLeft = (a[ism] + d[imm]) * dDensity                             // Уровень 118 - 188.9
            }
          }
          if (dLeft != null) {
            dLeft = round(dLeft * 1000.0) / 1000.0                                               // Округление 3 знака после запятой
            tOutputLeft?.text = "$dLeft"
          }
        }
        else tOutputLeft?.text = "0"


        var dRight: Double? = null                                                                  // Правый борт
        val sRight = eRight?.text.toString()
        if (sRight.isNotEmpty()) {
          val sm = sRight.substringBefore('.')                                              // Сантиметры
          val mm = sRight.substringAfterLast('.')                                           // Милиметры
          if (mm == sRight){                                                                        // Только сантиметры
            val ism: Int = sm.toInt()
            dRight = a[ism] * dDensity
          }
          else {                                                                                    // Сантиметры и милиметры
            val ism: Int = if (sm == "") 0
            else sm.toInt()
            val imm: Int = if (mm == "") 0
            else mm.toInt()
            when (ism) {
              in 0..46    -> dRight = (a[ism] + b[imm]) * dDensity                            // Уровень 0 - 46.9
              in 47..117  -> dRight = (a[ism] + c[imm]) * dDensity                            // Уровень 47 - 117.9
              in 118..188 -> dRight = (a[ism] + d[imm]) * dDensity                            // Уровень 118 - 188.9
            }
          }
          if (dRight != null) {
            dRight = round(dRight * 1000.0) / 1000.0                                             // Округление 3 знака после запятой
            tOutputRight?.text = "$dRight"
          }
        }
        else tOutputRight?.text = "0"


        var dResult: Double? = null                                                                 // Итог
        if (dExpense != null) {
          if (dRight != null) {
            if (dLeft != null) {
              dResult = (dRight + dLeft) / 2 + dExpense
            }
          }
        }
        if (dResult != null) {
          dResult = round(dResult * 1000.0) / 1000.0                                             // Округление 3 знака после запятой
          tOutputResult?.text = "$dResult"
        }
        else tOutputResult?.text = "0"
      }
      else {
        tOutputLeft?.text = "0"
        tOutputRight?.text = "0"
        tOutputExpense?.text = "0"
        tOutputResult?.text = "0"
      }


      val sDensityOil = eDensityOil?.text.toString()
      if (sDensityOil.isNotEmpty()) {
        val tOutputOil:     TextView? = findViewById(R.id.tOutputOil)
        val dDensityOil: Double = sDensityOil.toDouble()                                            //Плотность масла
        if (dDensityOil < 0.8900 || dDensityOil > 0.9300) {
          tOutputOil?.text = "0"
          return@setOnClickListener                                                                 // Если не правильно возвращаемся
        }

        val sOil = eOil?.text.toString()                                                            // Масло
        if (sOil.isNotEmpty()) {
          var dOil: Double = sOil.toDouble() * dDensityOil * 22
          dOil = round(dOil * 1000.0) / 1000.0
          tOutputOil?.text = "$dOil"
        } else tOutputOil?.text = "0"
      }
    }
  }
}
