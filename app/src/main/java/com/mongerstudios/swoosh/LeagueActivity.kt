package com.mongerstudios.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun LeagueNextClicked(view: View){
        //transition to Next View
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Select a League first",Toast.LENGTH_SHORT).show()
        }
    }

    //Togle button logic functions
    fun OnMensClicked(view: View){
        //btnMens.isChecked = true
        btnWomens.isChecked = false
        btnCoed.isChecked = false
        selectedLeague = "Mens"
    }

    fun OnWomensClicked(view:View){
        btnMens.isChecked = false
        //btnWomens.isChecked = true
        btnCoed.isChecked = false
        selectedLeague = "Womens"
    }

    fun OnCoedClicked(view: View){
        btnMens.isChecked = false
        btnWomens.isChecked = false
        //btnCoed.isChecked = true
        selectedLeague = "Co-Ed"
    }
}
