package com.mongerstudios.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mongerstudios.swoosh.R
import com.mongerstudios.swoosh.utilities.EXTRA_LEAGUE
import com.mongerstudios.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        Log.d("Passed League: ",league )
        Log.d("Passed Skill: ",skill )

        txtLookingFor.text = "Looking for a $league $skill league near you"
    }
}
