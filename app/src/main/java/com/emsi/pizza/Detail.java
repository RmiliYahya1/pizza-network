package com.emsi.pizza;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView imageProduit=findViewById(R.id.imageProduit);
        TextView nom=findViewById(R.id.nom);
        TextView description=findViewById(R.id.description);
        TextView ingredient=findViewById(R.id.ingredient);
        TextView preparation=findViewById(R.id.preparation);

        imageProduit.setImageResource(getIntent().getIntExtra("photo",0));
        nom.setText(getIntent().getStringExtra("nom"));
        description.setText(getIntent().getStringExtra("description"));
        ingredient.setText(getIntent().getStringExtra("ingredient"));
        preparation.setText(getIntent().getStringExtra("preparation"));

    }
}