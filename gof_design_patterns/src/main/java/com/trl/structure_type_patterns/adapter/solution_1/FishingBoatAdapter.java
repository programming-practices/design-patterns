package com.trl.structure_type_patterns.adapter.solution_1;

public class FishingBoatAdapter implements RowingBoat {

    private FishingBoat boat;

    public FishingBoatAdapter() {
        boat = new FishingBoat();
    }

    @Override
    public void row() {
        boat.sail();
    }

}
