package com.example.projectbp_2691

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectbp_2691.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    lateinit var binding: ActivityBookKidBinding

    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)


        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFairy.setOnClickListener{
            replaceFragment(FairyFragment())

            // Recycler View Fairy
            val rvBuku:RecyclerView = findViewById(R.id.recyclerViewFragmentBook)
            rvBuku.layoutManager = LinearLayoutManager(this)
            val data = ArrayList<BukuModel>()

            data.add(
                BukuModel(R.drawable.book1,"Emi's Beach Advneture","Lorem Ipsum Dolor " +
                        "Sit Amet ")
            )
            data.add(
                BukuModel(R.drawable.book2,"Ade's Adventure","Lorem Ipsum Dolor " +
                        "Sit Amet ")
            )
            data.add(
                BukuModel(R.drawable.book4,"Mermaid To REscue","Lorem Ipsum Dolor " +
                        "Sit Amet ")
            )

            val adapter = AdapterHome(data)
            rvBuku.adapter = adapter

        }


        binding.buttonFable.setOnClickListener{
            replaceFragment(FableFragment())

                // Recycler View Fable
                val rvBuku:RecyclerView = findViewById(R.id.recyclerViewFragmentBook)
                rvBuku.layoutManager = LinearLayoutManager(this)
                val data = ArrayList<BukuModel>()

                data.add(
                    BukuModel(R.drawable.aesop,"Ajapa The Tortoise","Lorem Ipsum Dolor " +
                            "Sit Amet ")
                )
                data.add(
                    BukuModel(R.drawable.ajapa,"Ajapa The Tortoise","Lorem Ipsum Dolor " +
                            "Sit Amet ")
                )
                data.add(
                    BukuModel(R.drawable.koala,"Why Koala has a Stumpy Tail","Lorem Ipsum Dolor " +
                            "Sit Amet ")
                )

                val adapter = AdapterHome(data)
                rvBuku.adapter = adapter
            }


            binding.buttonScience.setOnClickListener{
                replaceFragment(ScienceFragment())

                // Recycler View Science
                val rvBuku:RecyclerView = findViewById(R.id.recyclerViewFragmentBook)
                rvBuku.layoutManager = LinearLayoutManager(this)
                val data = ArrayList<BukuModel>()

                data.add(
                    BukuModel(R.drawable.glow,"Glow: A Family Guide to the Night Sky",
                        "Lorem Ipsum Dolor Sit Amet ")
                )
                data.add(
                    BukuModel(R.drawable.themagic,"The Magic and Mystery of Trees ",
                        "Lorem Ipsum Dolor Sit Amet ")
                )
                data.add(
                    BukuModel(R.drawable.planet,"My First Book of Planets",
                        "Lorem Ipsum Dolor Sit Amet ")
                )

                val adapter = AdapterHome(data)
                rvBuku.adapter = adapter

            }

        }

    }


