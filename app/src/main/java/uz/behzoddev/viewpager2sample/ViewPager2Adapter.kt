package uz.behzoddev.viewpager2sample

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.behzoddev.viewpager2sample.databinding.ImageHolderBinding

internal class ViewPager2Adapter(val ctx: Context): RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {

    // Array of images that include in drawable folder
    private val images = arrayOf(
        R.drawable.ic_north,
        R.drawable.ic_north_east,
        R.drawable.ic_north_west
    )

    // The ViewHolder class holds the view
    inner class ViewHolder(val binding: ImageHolderBinding) : RecyclerView.ViewHolder(binding.root)

    // This method returns our layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ImageHolderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    // This method binds the screen with view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.ivImage.setImageResource(images[position])
    }

    // This method returns the size of the array
    override fun getItemCount(): Int {
        return images.size
    }
}