package com.example.rainbowsixselector;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Random;

public class CharacterSelectionActivity extends AppCompatActivity {

    private ArrayList<String> selectedCharacters;
    private TextView tvCharacterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_selection);

        tvCharacterName = findViewById(R.id.tv_character_name);

        selectedCharacters = getIntent().getStringArrayListExtra("characters_list");

        Button btnSelectRandom = findViewById(R.id.btn_select_random);
        btnSelectRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectRandomCharacter();
            }
        });
    }

    private void selectRandomCharacter() {
        int randomIndex = new Random().nextInt(selectedCharacters.size());
        String randomCharacter = selectedCharacters.get(randomIndex);
        tvCharacterName.setText(randomCharacter);
    }
}
