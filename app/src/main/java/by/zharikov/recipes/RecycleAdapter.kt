package by.zharikov.recipes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_recipes.view.*

class RecycleAdapter(
    private val recipeSet: List<Recipe>,
    private val onItemClick: (Recipe) -> Unit
) :
    RecyclerView.Adapter<RecycleAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipes, parent, false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount() = recipeSet.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.recipe_name.text = recipeSet[position].name
        Picasso.get().load(recipeSet[position].urlPicture).into(holder.itemView.pictureImageView)
        holder.itemView.setOnClickListener {
            onItemClick.invoke(recipeSet[position])
        }
    }
}