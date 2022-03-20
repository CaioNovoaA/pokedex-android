package br.com.caio.pokedex_android.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.caio.pokedex_android.api.domain.Pokemon

class PokemonAdapter(
    val items: List<Pokemon>
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>( ) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() =  items.size



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindView(){

        }

    }




}