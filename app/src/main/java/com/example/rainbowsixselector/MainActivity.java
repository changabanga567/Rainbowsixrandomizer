package com.example.rainbowsixselector;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String SIDE_KEY = "side_key";
    private ArrayList<String> attackCharacters;
    private ArrayList<String> defenseCharacters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize character lists
        attackCharacters = new ArrayList<>();
        defenseCharacters = new ArrayList<>();

        // Dummy data: You can replace these with your characters
        for (int i = 1; i <= 30; i++) {
            attackCharacters.add("Attack Character " + i);
            defenseCharacters.add("Defense Character " + i);
        }

        Button btnAttack = findViewById(R.id.btn_attack);
        Button btnDefense = findViewById(R.id.btn_defense);

        btnAttack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCharacterSelectionActivity("Attack");
            }
        });

        btnDefense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCharacterSelectionActivity("Defense");
            }
        });
    }

    public ArrayList<String> getAttackCharacters() {
        return attackCharacters;
    }

    public ArrayList<String> getDefenseCharacters() {
        return defenseCharacters;
    }


    private void startCharacterSelectionActivity(String side) {
        Intent intent = new Intent(this, CharacterSelectionActivity.class);
        intent.putExtra(SIDE_KEY, side);
        if ("Attack".equals(side)) {
            intent.putStringArrayListExtra("characters_list", attackCharacters);
        } else {
            intent.putStringArrayListExtra("characters_list", defenseCharacters);
        }
        startActivity(intent);
    }}

