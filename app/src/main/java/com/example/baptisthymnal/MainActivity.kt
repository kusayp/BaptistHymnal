package com.example.baptisthymnal

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.room.util.TableInfo
import com.huma.room_for_asset.RoomAsset
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val db = RoomAsset.databaseBuilder(applicationContext, AppDatabse::class.java, "hymnsdb.db").build()
//        val db = RoomAsset.databaseBuilder(applicationContext, AppDatabse::class.java, "chinook.db").build()
        val employees = db.chinookDao().getCategories()
//        val employees = db.chinookDao().employees

        println("customers table = $employees")
//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
//                appBarTitle("Home")
//                val homeFragment = HomeFragment.newInstance()
//                openFragment(homeFragment)
            }
            R.id.nav_hymns -> {
//            appBarTitle("Hymns")
//            val hymnsFragment = HymnsFragment.newInstance()
//            openFragment(hymnsFragment)

            }
            R.id.nav_categories -> {
//                appBarTitle("Hymn Categories")
//                val categoriesFragment = CategoriesFragment.newInstance()
//                openFragment(categoriesFragment)

            }
            R.id.nav_favs -> {
//                appBarTitle("Favourites Hymns")
//                val favouriteFragment = FavouriteFragment.newInstance()
//                openFragment(favouriteFragment)

            }
//            R.id.nav_add_hymn -> {
//                appBarTitle("Add New Hymn")
//                val hymnAddFragment = HymnAdd.newInstance()
//                openFragment(hymnAddFragment)
//
//            }
            R.id.nav_search -> {
//                appBarTitle("Search Hymns")
//                val searchFragment = SearchFragment.newInstance()
//                openFragment(searchFragment)

            }
            R.id.nav_settings -> {
//                appBarTitle("Settings")
//                val transaction = supportFragmentManager.beginTransaction()
//                transaction.replace(R.id.container, SettingsFragment())
//                transaction.commit()

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
