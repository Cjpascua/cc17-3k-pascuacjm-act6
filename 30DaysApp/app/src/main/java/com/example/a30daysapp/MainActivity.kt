package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val creativenessNumberOfDays = listOf(
            DataClass("Day 1", "Doodle for 10 minutes", "Let your hand wander on paper, no rules and just draw whatever comes to mind.", R.drawable.sample_image),
            DataClass("Day 2", "Listen to a new podcast or audiobook", "Experiment with different styles like haiku, free verse, or rhymes.", R.drawable.day2) ,
            DataClass("Day 3", "Take 5 unique photos", "Capture interesting things around you, focusing on angles, light, or textures.", R.drawable.day3),
            DataClass("Day 4", "Create a mood board", "Collect magazine clippings, photos, or online images that reflect a theme or feeling.", R.drawable.day4),
            DataClass("Day 5", "Try a new recipe", "Get creative in the kitchen by making something new or tweaking a recipe.", R.drawable.day5),
            DataClass("Day 6", "Make a handmade card", "Use paper, markers, or stickers to design a card for a friend or family member.", R.drawable.day6),
            DataClass("Day 7", "Paint or color a mandala", "Tap into your artistic side by coloring a pre-made mandala or drawing your own.", R.drawable.day7),
            DataClass("Day 8", "Write a 5-minute short story", "Set a timer and let your imagination flow without overthinking", R.drawable.day8),
            DataClass("Day 9", "Create an origami figure", "Learn how to fold paper into a simple shape like a crane, heart, or flower.", R.drawable.day9),
            DataClass("Day 10", "Design your ideal room", "Sketch out or use software to create a blueprint or visual of your dream room.", R.drawable.day10),
            DataClass("Day 11", "Make a vision board", "Gather images or words that represent your goals and dreams for the future.", R.drawable.day11),
            DataClass("Day 12", "Create a comic strip", "Draw a simple comic with stick figures or more detailed characters.", R.drawable.day12),
            DataClass("Day 13", "Redesign a logo or brand", "Pick a brand you like and try redesigning its logo or branding elements.", R.drawable.day13),
            DataClass("Day 14", "Start a journal entry with a drawing", "Illustrate how you're feeling or something from your day, then add words.", R.drawable.day14),
            DataClass("Day 15", "Do a blind contour drawing", "Without looking at the paper, draw an object by focusing only on the subject.", R.drawable.day15),
            DataClass("Day 16", "Create a collage", "Use magazine clippings, old photos, or any other materials to create a visual mash-up.", R.drawable.day16),
            DataClass("Day 17", "Make a DIY project", "Find a simple DIY project and make it yourself.", R.drawable.day17),
            DataClass("Day 18", "Write a song or lyrics", "Challenge yourself to come up with a song or some creative lyrics.", R.drawable.day18),
            DataClass("Day 19", "Design a poster", "Pick a favorite quote, event, or topic and design a poster around it.", R.drawable.day19),
            DataClass("Day 20", "Draw your dream vacation spot", "Visualize and draw a place you'd love to visit someday", R.drawable.day20),
            DataClass("Day 21", "Recreate a famous artwork", "Put your own spin on a famous painting or sculpture by drawing or using digital tools.", R.drawable.day21),
            DataClass("Day 22", "Create a new character", "Write a brief description and sketch a character with a unique trait and backstory", R.drawable.day22),
            DataClass("Day 23", "Redesign an everyday object", "Imagine how an everyday item could be improved or redesigned", R.drawable.day23),
            DataClass("Day 24", "Do a watercolor painting", "Experiment with watercolor paints, focusing on blending colors and creating abstract forms", R.drawable.day24),
            DataClass("Day 25", "Write a flash fiction story", "Tell a complete story in 200 words or less", R.drawable.day25),
            DataClass("Day 26", "Create a typography design", "Use a quote or word and design it using creative typography or hand lettering", R.drawable.day26),
            DataClass("Day 27", "Make a stop-motion video", "Use simple objects like toys or paper to create a short stop-motion video", R.drawable.day27),
            DataClass("Day 28", "Decorate something in your home", "Personalize a plain object in your house, like a mug or notebook", R.drawable.day28),
            DataClass("Day 29", "Write a scene for a movie or play", "Draft a scene with a dialogue between two characters in a specific setting", R.drawable.day29),
            DataClass("Day 30", "Try new art medium", "Experiment with something you've never used before", R.drawable.day30),
        )
        val adapter = Adapter(creativenessNumberOfDays)
        recyclerView.adapter = adapter
    }
}
