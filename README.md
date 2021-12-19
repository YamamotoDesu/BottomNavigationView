# BottomNavigationView

<img width="348" alt="Android_Emulator_-_Nexus_6_API_30_5554" src="https://user-images.githubusercontent.com/47273077/146671844-3aea8399-5a5c-40f9-af6d-70795e40d862.png">

## Add the library to the dependencies section:
build.gradle(app)
```
    implementation 'com.google.android.material:material:1.5.0-alpha04'

```

## Set BottomNavigationView
activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

     <FrameLayout
         android:id="@+id/fragment_layout"
         android:layout_width="match_parent"
         android:layout_height="0dp"
         app:layout_constraintBottom_toTopOf="@+id/bottomNavigationview"
         app:layout_constraintStart_toStartOf="parent"
         app:layout_constraintTop_toTopOf="parent"></FrameLayout>

     <com.google.android.material.bottomnavigation.BottomNavigationView
         android:id="@+id/bottomNavigationview"
         android:layout_width="match_parent"
         android:layout_height="70dp"
         app:layout_constraintBottom_toBottomOf="parent"
         app:layout_constraintEnd_toEndOf="parent"
         app:layout_constraintStart_toStartOf="parent"
         app:menu="@menu/menu2" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

<img width="283" alt="Bottom_Navigation_View_–_menu2_xml__Bottom_Navigation_View_app_" src="https://user-images.githubusercontent.com/47273077/146672025-3793c155-b5cd-409a-9241-aa8b51a906bc.png">

menu2
```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/item1"
        android:title="Home"
        android:icon="@mipmap/ic_launcher"/>

    <item
        android:id="@+id/item2"
        android:title="Acievements"
        android:icon="@mipmap/ic_launcher"/>

    <item
        android:id="@+id/item3"
        android:title="Settings"
        android:icon="@mipmap/ic_launcher"/>

</menu>
```

## Set SelectedListener
```java
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Bottom nav
        binding.bottomNavigationview.setOnItemSelectedListener(onNavigationItemSelectedListener)
    }

    private val onNavigationItemSelectedListener =  NavigationBarView.OnItemSelectedListener { item ->
        when (item.itemId) {
            R.id.item1 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, Item1Fragment())
                    .commit()
                return@OnItemSelectedListener true
            }
            R.id.item2 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, Item2Fragment())
                    .commit()
                return@OnItemSelectedListener true
            }
            R.id.item3 -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_layout, Item3Fragment())
                    .commit()
                return@OnItemSelectedListener true
            }
        }
        false
    }
}
```

