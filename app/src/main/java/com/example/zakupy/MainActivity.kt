package com.example.zakupy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)
        val checkBox5 = findViewById<CheckBox>(R.id.checkBox5)
        val checkBox6 = findViewById<CheckBox>(R.id.checkBox6)
        val checkBox7 = findViewById<CheckBox>(R.id.checkBox7)
        val checkBox8 = findViewById<CheckBox>(R.id.checkBox8)
        val checkBox9 = findViewById<CheckBox>(R.id.checkBox9)
        val checkBox10 = findViewById<CheckBox>(R.id.checkBox10)
        val checkBox11 = findViewById<CheckBox>(R.id.checkBox11)
        val checkBox12 = findViewById<CheckBox>(R.id.checkBox12)
        val checkBox13 = findViewById<CheckBox>(R.id.checkBox13)
        val checkBox14 = findViewById<CheckBox>(R.id.checkBox14)
        val checkBox15 = findViewById<CheckBox>(R.id.checkBox15)

        checkBox1.visibility = View.GONE
        checkBox2.visibility = View.GONE
        checkBox3.visibility = View.GONE
        checkBox4.visibility = View.GONE
        checkBox5.visibility = View.GONE
        checkBox6.visibility = View.GONE
        checkBox7.visibility = View.GONE
        checkBox8.visibility = View.GONE
        checkBox9.visibility = View.GONE
        checkBox10.visibility = View.GONE
        checkBox11.visibility = View.GONE
        checkBox12.visibility = View.GONE
        checkBox13.visibility = View.GONE
        checkBox14.visibility = View.GONE
        checkBox15.visibility = View.GONE

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId == R.id.addRadio) {
                checkBox1.visibility = View.VISIBLE
                checkBox2.visibility = View.VISIBLE
                checkBox3.visibility = View.VISIBLE
                checkBox4.visibility = View.VISIBLE
                checkBox5.visibility = View.VISIBLE
                checkBox6.visibility = View.VISIBLE
                checkBox7.visibility = View.VISIBLE
                checkBox8.visibility = View.VISIBLE
                checkBox9.visibility = View.VISIBLE
                checkBox10.visibility = View.VISIBLE
                checkBox11.visibility = View.VISIBLE
                checkBox12.visibility = View.VISIBLE
                checkBox13.visibility = View.VISIBLE
                checkBox14.visibility = View.VISIBLE
                checkBox15.visibility = View.VISIBLE

            } else if (checkedId == R.id.removeRadio) {
                checkBox1.visibility = View.GONE
                checkBox2.visibility = View.GONE
                checkBox3.visibility = View.GONE
                checkBox4.visibility = View.GONE
                checkBox5.visibility = View.GONE
                checkBox6.visibility = View.GONE
                checkBox7.visibility = View.GONE
                checkBox8.visibility = View.GONE
                checkBox9.visibility = View.GONE
                checkBox10.visibility = View.GONE
                checkBox11.visibility = View.GONE
                checkBox12.visibility = View.GONE
                checkBox13.visibility = View.GONE
                checkBox14.visibility = View.GONE
                checkBox15.visibility = View.GONE
                if (checkBox1.isChecked) {
                    checkBox1.visibility = View.VISIBLE
                }
                if (checkBox2.isChecked) {
                    checkBox2.visibility = View.VISIBLE
                }
                if (checkBox3.isChecked) {
                    checkBox3.visibility = View.VISIBLE
                }
                if (checkBox4.isChecked) {
                    checkBox4.visibility = View.VISIBLE
                }
                if (checkBox5.isChecked) {
                    checkBox5.visibility = View.VISIBLE
                }
                if (checkBox6.isChecked) {
                    checkBox6.visibility = View.VISIBLE
                }
                if (checkBox7.isChecked) {
                    checkBox7.visibility = View.VISIBLE
                }
                if (checkBox8.isChecked) {
                    checkBox8.visibility = View.VISIBLE
                }
                if (checkBox9.isChecked) {
                    checkBox9.visibility = View.VISIBLE
                }
                if (checkBox10.isChecked) {
                    checkBox10.visibility = View.VISIBLE
                }
                if (checkBox11.isChecked) {
                    checkBox11.visibility = View.VISIBLE
                }
                if (checkBox12.isChecked) {
                    checkBox12.visibility = View.VISIBLE
                }
                if (checkBox13.isChecked) {
                    checkBox13.visibility = View.VISIBLE
                }
                if (checkBox14.isChecked) {
                    checkBox14.visibility = View.VISIBLE
                }
                if (checkBox15.isChecked) {
                    checkBox15.visibility = View.VISIBLE
                }
            }
        }






    }

}
