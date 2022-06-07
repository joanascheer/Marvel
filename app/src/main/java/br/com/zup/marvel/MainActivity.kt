package br.com.zup.marvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.marvel.adapter.AdapterPersonagem
import br.com.zup.marvel.databinding.ActivityMainBinding
import br.com.zup.marvel.model.Personagem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        val navControler = this.findNavController(R.id.myNavHostFragment)

        setContentView(binding.root)



    }


}