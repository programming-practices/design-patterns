package com.trl.structure_type_patterns.adapter.solution_1;

public class App {

    public static void main(String[] args) {

        // The captain can only operate rowing boats but with adapter he is able to use fishing boats as well
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }

}
