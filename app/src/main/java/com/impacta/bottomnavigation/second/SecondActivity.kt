package com.impacta.bottomnavigation.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.impacta.bottomnavigation.R

class SecondActivity : AppCompatActivity() {

//    TODO (6) Pegue a referencia dos componentes criados no layout
//    TODO (7) Instancie os fragments que serão usados para evitar inicializações desnecessarias

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        TODO (8) Crie uma função auxilar para navegar entre os fragments
//        TODO (9) Adicione o listener ao BottomNavigation para navegar entre os fragments de acordo com o item selecionado
    }
}