package com.example.rainbowsixselector;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import com.example.rainbowsixselector.Characters;
import com.example.rainbowsixselector.Character;
import com.example.rainbowsixselector.Role;


public class MainActivity extends AppCompatActivity {

    public static final String SIDE_KEY = "side_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAttack = findViewById(R.id.btn_attack);
        Button btnDefense = findViewById(R.id.btn_defense);

        btnAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCharacterSelectionActivity(Role.ATTACK);
            }
        });

        btnDefense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCharacterSelectionActivity(Role.DEFENSE);
            }
        });
    }

    private void startCharacterSelectionActivity(Role role) {
        List<Character> filteredCharacters = new ArrayList<>();

        for (Character character : Characters.allCharacters) {
            if (character.getRole() == role) {
                filteredCharacters.add(character);
            }
        }

        ArrayList<String> characterNames = new ArrayList<>();
        for (Character character : filteredCharacters) {
            characterNames.add(character.getName());
        }

        Intent intent = new Intent(this, CharacterSelectionActivity.class);
        intent.putStringArrayListExtra("characters_list", characterNames);
        startActivity(intent);
    }
}
