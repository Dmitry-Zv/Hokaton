package by.zharikov.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_all_recipes.*

class AllRecipesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_recipes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = RecycleAdapter(RecipeSet.getRecipe()) { recipe ->
            findNavController().navigate(AllRecipesFragmentDirections.fromAllRecipeShowFourthFragment(recipe))
        }
        allRecipesRecycle.adapter = adapter
        allRecipesRecycle.layoutManager = LinearLayoutManager(context)
        allRecipesRecycle.hasFixedSize()
    }
}