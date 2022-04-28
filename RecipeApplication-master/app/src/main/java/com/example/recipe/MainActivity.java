package com.example.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button;
    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();
            }

        });
        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Black Milk Tea","½ cup of milk" +
                "\n2 teaspoons of honey" +
                "\n2 cups of water",
                "Method",
                "Boil 2 cups of water in a pot. Once boiled, pour the water into cups and put one tea bag per cup. Pour ½ cup of milk in each cup, add 2 teaspoons of honey, and pour the boba into the cups. Enjoy!\n", R.drawable.black2));

        recipes1.add(new Recipes("Thai Milk Tea","2 tablespoons of thai iced tea mix" +
                "\n⅓ cup of sweetener/creamer","Method",
                "Boil 2 cups of water in a pot.  Put 2 tablespoons of thai iced tea mix into a coffee strainer on a cup and pour the hot water into the strainer. Once the tea is brewed, pour into cups.  Pour ⅓ cup of sweetener/creamer and pour the boba into the cups. Enjoy!\n", R.drawable.thai));

        recipes1.add(new Recipes("Taro Milk Tea","½ cup of taro milk tea powder" +
                "⅓ cup of sweetener/creamer", "Method",
                "Boil 2 cups of water in a pot. Once boiled, pour the water into cups and put one green tea tea bag per cup. Pour ⅓ cup of sweetener/creamer, add the taro milk tea powder, and pour the boba into the cups. Enjoy!\n", R.drawable.taro2));

        recipes1.add(new Recipes("Brown Sugar Milk Tea","⅔ cups of milk" +
                "½ cup of muscovado sugar" + "whipped cream (optional)", "Method",
                "In a drizzle ½ cup of muscovado sugar on the inner side of the cups. Pour ⅔ milk in each cup.  Add the boba into the cups and place whipped cream on top. Enjoy!\n", R.drawable.brown_sugar2));

        recipes1.add(new Recipes("Jasmine Green Milk Tea","½ cup of milk" +
                "2 teaspoons of honey","Method",
                "Boil 2 cups of water in a pot. Once boiled, pour the water into cups and put one green tea with jasmine tea bag per cup.  Pour ⅓ cup of milk, add 2 teaspoons of honey, and pour the boba into the cups. Enjoy!\n", R.drawable.jasmine2));

        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this,recipes1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myrecyclerView.setAdapter(myAdapter);
    }
    public void openActivity3()
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

}
