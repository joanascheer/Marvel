package br.com.zup.marvel.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.marvel.R
import br.com.zup.marvel.model.Personagem

class AdapterPersonagem(private val context: Context, private val personagens: MutableList<Personagem>): RecyclerView.Adapter<AdapterPersonagem.PersongemViewHolder>() {

    //cria visualizacao de tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersongemViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.personagem_item, parent, false)
        val holder = PersongemViewHolder(itemLista)
        return holder
    }

    //exibe visualizacoes para usuario
    override fun onBindViewHolder(holder: PersongemViewHolder, position: Int) {
        holder.foto.setImageResource(personagens[position].foto)
        holder.nome.text = personagens[position].nomePersonagem
    }

    override fun getItemCount(): Int = personagens.size

    inner class PersongemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.ivPersonagem)
        val nome = itemView.findViewById<TextView>(R.id.nomePersonagem)
    }
}