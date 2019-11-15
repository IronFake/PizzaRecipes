package com.example.pizzarecipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {


    public static final String PIZZA1_TITTLE = "Next level Margherita pizza";
    public static final String PIZZA1_DESCRIPTION = "Forget takeaways – you can’t beat a homemade Margherita pizza topped with fresh tomato sauce and melted cheese.";
    public static final String PIZZA1_COOKTIME = "1 HOUR AND 40 MINS";
    public static final String PIZZA1_RECIPE = "First, make the dough. Tip the flour into a bowl and add 300ml tepid water. Mix together and set aside at room temperature for 1 hr." + "" +
            "Dissolve the yeast in 2 tbsp water and mix this and 15g of salt through the dough. Cover with cling film and leave somewhere warm to double in size for a few hours." +
            "For a sourer flavour, leave in the fridge for at least 8 hrs and up to 24 hrs – the longer you leave it the sourer it will be.";
    public static final ArrayList<String> PIZZA1_RECIPE_STEPS = new ArrayList<>(Arrays.asList("First, make the dough. Tip the flour into a bowl and add 300ml tepid water. Mix together and set aside at room temperature for 1 hr. Dissolve the yeast in 2 tbsp water and mix this and 15g of salt through the dough. Cover with cling film and leave somewhere warm to double in size for a few hours. For a sourer flavour, leave in the fridge for at least 8 hrs and up to 24 hrs – the longer you leave it the sourer it will be.",
            "When the dough is ready, tip it onto a lightly floured surface and divide into four. Roll into balls and leave to rest, covered with a tea towel or cling film for another hour.",
            "Now make the tomato sauce. Drain some of the juice from the can and tip the rest into a bowl with the olive oil, oregano and a generous pinch of salt, then either scrunch everything together with your fingers for a chunky sauce or blitz with a stick blender if you want it smooth. Tie the basil stalks together, bruise with the back of a knife and place in the sauce. Leave the sauce at room temperature until needed.",
            "To make the pizza, heat a grill to its highest setting and get a heavy frying pan. On a floured surface push and stretch one of the balls of dough out into a circle roughly the same size as the frying pan. Slip the round onto a floured baking sheet and top with a quarter of the sauce, a scattering of cheese, a few basil leaves and a quarter of the mozzarella."));

    public static final String PIZZA2_TITTLE = "Gluten-free pizza";
    public static final String PIZZA2_DESCRIPTION = "Make our gluten-free version of a classic pizza. The base is easy, spread over rich homemade tomato sauce, then finish with buffalo mozzarella and fresh basil";
    public static final String PIZZA2_COOKTIME = "55 MINS";

    public static final String PIZZA3_TITTLE = "Superhealthy pizza";
    public static final String PIZZA3_DESCRIPTION = "The quantities for this are generous, so if you have any leftovers, pop a wedge of cold pizza into your lunchbox the next day";
    public static final String PIZZA3_COOKTIME = "50 MINS";

    public static final String PIZZA4_TITTLE = "Frying pan pizza";
    public static final String PIZZA4_DESCRIPTION = "Not good for you? Think again, this easy to make pizza is low fat and full of calcium";
    public static final String PIZZA4_COOKTIME = "45 MINS";

    public static final String PIZZA5_TITTLE = "Egg & rocket pizzas";
    public static final String PIZZA5_DESCRIPTION = "Use seeded tortillas as pizza bases for a quick and healthy lunch - crack an egg in the centre and bake to boost protein intake";
    public static final String PIZZA5_COOKTIME = "30 MINS";

    public static final String PIZZA6_TITTLE = "Rainbow pizzas";
    public static final String PIZZA6_DESCRIPTION = "Forget takeaway pizzas, encourage kids to eat a rainbow every day with this colourful recipe full of fresh flavours – " +
            "guaranteed to please even fussy eaters...";
    public static final String PIZZA6_COOKTIME = "40 MINS";

    private static ArrayList<String> init(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("1");
        return arrayList;
    }


}
