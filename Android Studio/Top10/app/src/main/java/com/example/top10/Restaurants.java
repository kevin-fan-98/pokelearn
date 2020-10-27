//Kevin Fan z5161205 Individual Assignment 2
//database of top 10 restaurants
package com.example.top10;

import java.util.ArrayList;

public class Restaurants {
    private String name;
    private int rank;
    private double rating;
    private String cuisine;
    private String location;
    private String cost;
    private String review;
    private String address;
    private int image;


    public Restaurants(){
    }


    public Restaurants(String name, int rank, double rating, String cuisine, String location, String cost,String review,String address, int image) {
        this.name = name;
        this.rank = rank;
        this.rating = rating;
        this.cuisine = cuisine;
        this.location = location;
        this.cost = cost;
        this.review = review;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getReview(){return review; }

    public void setReview(String Review){this.review = review; }

    public String getAddress(){return address; }

    public void setAddress(String Address){this.address = address; }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public static ArrayList<Restaurants> getRestaurants(){
        ArrayList<Restaurants> rList = new ArrayList<>();

        rList.add(new Restaurants("Quay", 1, 5, "Fine Dining, Australian, Contemporary, International", "Circular Quay", "$$$$","Why does Sydney’s preeminent fine diner still deserve the crown? Let us count the ways\n" +
                "\n" +
                "What does it take to earn the crown of Sydney’s finest diner? It’s not just a superlative location, because being a harbour city we are not deprived of beautiful places to eat by the water. Admittedly, at Quay, when the cruise ship finally pulls away from the Overseas Passenger Terminal to reveal the Opera House and a panorama that stretches from the Harbour Bridge to the CBD, it’s hard not to fall that little bit deeper for Sydney and all her aesthetic charms. \n" +
                "\n" +
                "Being number one is not just about service that’s as smooth as Italian suede and as perfectly paced as a champion race horse – though it’s certainly a foundational element to the dining experience here. And it’s important that once you have achieved the top spot on the dining dance card you don’t get complacent. Sydney is a city that thrives on the new, so if the time of double linens is over, whip the tablecloths off and embrace a new era of relaxed degustatory excess, where the collars are a little looser but the standards never drop. \n" +
                "\n" +
                "Fine dining no longer ascribes to the idea that indulgence requires being fed into a stupor, which is why you can safely opt for an elegant six courses at executive chef Peter Gilmore’s world famous restaurant. Of course, if you’re here for a little excess, there’s always ten, which adds marron, truffles, and extra desserts to the mix. \n" +
                "\n" +
                "No matter which way you steer you get to marvel at the monklike restraint in a dish of hand-harvested octopus, clams and scallops, anointed with soy and aged vinegar and dressed in seaweed for a convincing “au natural” affectation. From something barely augmented by human hands you then move onto a dish that packs the largesse of a limousine into a tiny package of intensely smoky eel cream, given textural backbone with sea cucumber crackers (the fancy cousin of the prawn cracker), walnuts and Italian caviar.\n" +
                "\n" +
                "From the sublime to the rustic, an ancient purple corn variety from Peru (guesstimates give it a 4,000-year-old legacy) is ground down and cooked into the smoothest of polentas spiked with parmesan and chicken stock. A rich and sticky oxtail broth is the final umami KO punch. An unlisted break to proceedings heralds the arrival of slow fermented poolish crumpets with cultured cream and salmon roe, but then along comes a wobbling savoury custard run through with sweet mud crab meat and bolstered by an unapologetic bouquet of sea vegetables, seaweed and young garden greens. \n" +
                "\n" +
                "There is no wrong choice between duck breast aged in-house for eight days; King George whiting fillets with butter poached squid noodles; or wobbling pork jowl as your final savoury heavyweight. However, depending on how much theatre you need with your dessert, consider the “moo”. Look, it’s no white coral (Quay’s famous, smoking, freeze-dried reef of white chocolate with feijoa ice cream and coconut) but the sweet little dish designed to look like cow hide with whipped cream and little chocolate biscuit “spots” conceals a downright delicious sundae of salt caramel dulce de leche, Jersey milk ice cream and prune purée.\n" +
                "\n" +
                "It takes a lot to be the city’s preeminent fine diner, but Quay proves again and again that they deserve the mantle. The fact that their latest iteration has only made it a better dining experience goes to show that even when you’re at the top of your game, there’s always new heights to scale. The king of Sydney fine dining still reigns supreme.","Upper Overseas Passenger Terminal, The Rocks NSW 2000", R.drawable.quay));
        rList.add(new Restaurants("Momofuku Seiobo", 2, 5, "Fine Dining, Degustation, Caribbean", "Pyrmont", "$$$$", "This Caribbean degustation is Sydney’s most singular fine dining experience\n" +
                "\n" +
                "Trends spread like grassfire in Sydney’s tight-knit dining scene. You only have to see tail flap, kimchi or ceviche on one menu before you’re seeing it everywhere, like a game of culinary punch buggy. But Momofuku Seiobo is immune. The Antipodean wing of the famous David Chang empire blazes its own trail. If you want Carribean food in Sydney, Paul Carmichael needs to be cooking it.\n" +
                "\n" +
                "The Star casino complex is the incongruous location for the the 40-seat fine diner, and when Carmichael took over the reins, the tonal shift was dramatic. Former head chef Ben Greeno had ambled along a broadly Asian-adjacent path, but Carmichael came packing the traditions of his Barbadian childhood and a whole lot of plantains, redirecting the course of the $185 degustation for the sandy shores of the West Indian archipelago.\n" +
                "\n" +
                "Welcome to smash city, where you get your own full-size, granite mortar and pestle lined in little crescents of fried plantain, pork crackling and a garlic puree that you grind together into a starchy paste. It was prettier before, but more fun to eat after you got to go full Bam-Bam on your opening act. Yes, you’re here for ten courses plus snacks, but this is fine dining stripped of starched linens and sporting the kind of cheeky swagger that ensures dish two is a full-sized plantain doughnut: fluffy, gently banana-flavoured, but distinctly unsweetened so that the unctuous pork fat icing and green onions claim it as a savoury win. They’re basically double daring you to pace yourself, confident in the knowledge you won’t stop until you’ve eaten the whole thing.\n" +
                "\n" +
                "The national dish of Barbados, cou cou, gets raised several rungs up the social ladder: the bitter pudding of polenta and okra comes red carpet-ready with a veil of Californian caviar and a creamy sweetcorn sauce that’s doing a masterful impersonation of a Hollandaise wearing a slick of bay oil like expensive, herbal cologne.\n" +
                "\n" +
                "Carmichael has a deep love of dried fruit. He will regard those who do not share his passion with some suspicion. But express your delight at his rendition of ducana, an Antiguan dumpling made with sweet potato and currants, cooked over coals in a banana leaf and then immersed in a banana leaf sauce concealing a Carribbean remix of XO made with salt cod, and you’ve passed the test.\n" +
                "\n" +
                "Interaction is at the heart of the Momofuku dining experience. The same jovial young chef who makes the pumpkin pie dessert is the one who serves it to you. The young woman roasting whole split marron is the same person who introduces you to your main course personally while they’re still kicking, and then delivers them to your setting, doused in a capsicum and onion-heavy sofrito. You’ll be needing the deep-fried bread pucks sprinkled with fresh coconut and lime zest to soak up the spicy sauce that remains after you’ve gone face first into your mud lobster shells.\n" +
                "\n" +
                "You will be very, very full by the time the final buzzer sounds in the form of a bite-sized rum cake aged in house for a year. Not oh-god-why-have-I-eaten-a-kilo-of-butter-my-heart-hurts sick, but you’ll still roll out of there with every sense reeling. Your belly will be full of the flavours of a Carribbean childhood; your mouth will be rolling around new words like mofongo and jug jug, filing them under delicious; and your brain will be calculating how much leave you have saved up and if it gets you to the West Indies.\n" +
                "\n" +
                "Momofuku Seiobo is a lone island in Sydney’s dining scene. It follows no trends, and breaks whatever rules it fancies. Such a singular experience is worth every last dollar, because eating something you’ve never had before, that you can’t get anywhere else, is the whole point of fine dining, and they hit you with it ten times over here. If you haven’t been yet, it’s time to remedy that situation, and if you haven’t been in a while, it’s time to go back. The plantains are waiting.","Level G/80 Pyrmont St, Pyrmont NSW 2009", R.drawable.momo));
        rList.add(new Restaurants("Sixpenny", 3, 5, "Fine Dining, Modern Australian, Contemporary", "Stanmore", "$$$", "Sixpenny's references to colonial Australian cookery have become more oblique in recent years, but this corner restaurant in sleepy Stanmore still manages sly nods. Gone are the pumpkin scallops and the mutton, but a kangaroo tartare, topped with a dainty sweet potato crisp and given oomph with dried cheese and malt, riffs on good old meat and potatoes in the most refined of ways. A piece of steak with onion plays on, well, steak and onions, but distils it to dark-crusted, pink-centred chuck-tail flap, charred pickled onion and a sticky mushroom-Marsala sauce. There's an ease here, and a willingness to update old favourites that rewards return visits, tomato butter coating spanner crab topped with salmon roe and purple daikon in the latest spin on a signature an example. Tomato reappears in a deep green broth where John Dory plays backup to zucchini and snow peas. Flavours are clear and bright, dishes realised with precision and delivered with enthusiasm by kitchen staff, who are ably supported by a front-of-house team that revel in pouring wine from a list that has scope, but above all emphasises quality over quantity, which, in this tiny spot, is pretty apt.","83 Percival Rd, Stanmore NSW 2048", R.drawable.sixpenny));
        rList.add(new Restaurants("Tetsuyas", 4, 5, "Fine Dining, French Japanese, Modern", "Sydney CBD", "$$$$", "The things that once made Tetsuya's such a coveted booking may no longer be as revolutionary for a national palate now more attuned to Japanese flavours, but that doesn't mean the food is any less alluring. It's still a thrill to behold the signature confit ocean trout, draped elegantly over matchsticks of green apple and witlof, to feel the pop of the unpasteurised trout roe, to savour the length of flavour in the crumbled kombu coating. Elsewhere, sharp Pacific oysters dressed with soy and rice vinegar might be $12 a pop, but this is a place where classic pleasures (extending to an elegant wine selection, lush carpet, polished service and, yes, valet parking) come first, even if they come at a price. Plates range between raw and poached, sashimi kingfish accented with dashi cream and cucamelon, perhaps, or lamb cooked sous-vide and served with watercress purée and charred leek. Sound, if a little safe. Abalone with oyster dashi and wakame is more like it, nicely to the bite and dressed up with iceplant and seablite. This is cooking rendered with as much attention as the Zen garden that anchors the restaurant. Just imagine if it could train both eyes on the future.","529 Kent St, Sydney NSW 2000", R.drawable.testsuya));
        rList.add(new Restaurants("10 William Street", 5, 4.5, "Fine Dining, Italian, Modern", "Paddington", "$$$", "The drinks have always been a draw at 10 William St, and for the vine-dedicated there's the chance to get lost in a deep list of minimal-intervention wines from Italy and from people doing exciting, preservative-free things at home and further afield. But waiting in the street out front, jostling for space between the tiny tables, and swiping the seeded pretzel through the whipped bottarga dip has become as much a necessity as ordering a glass of something fresh and juicy from the chalkboard. The few signatures – that pretzel, the ragù, the tiramisu – remain on the food front, but newly installed chef Trisha Greentree, fresh from working the kitchen garden at Brae, has made a point of befriending local growers and producers, and making their produce the defining factor of her menus. Stracciatella from Vannella in Marrickville, perhaps, spread with anchovies and blackened spigarello leaves, or white corn from Boon Luck Farm under a grating of cured egg yolk and lime. Come dessert, the flan – rich without being eggy, and covered in orange and Partida Creus vermouth caramel – is a new bitter-sweet classic that's all her own. One to savour.","10 William St, Paddington NSW 2021", R.drawable.william));
        rList.add(new Restaurants("Mr Wong", 6, 4.5, "Chinese, Modern, Fusion", "Sydney CBD", "$$$", "Mr Wong sure knows how to roast a duck. Beside the open kitchen, the birds hang raw and resplendent in a glass display, quietly awaiting the five-spice and roasting treatment. They arrive shiny and crisp-skinned, with an excellent fat-to-tender-meat ratio, primed for rolling in pancakes with cucumber and hoisin sauce. Duck is a top order at this Merivale behemoth, where the extensive menu shows a grab bag of Chinese influences under a loose Australian-Cantonese banner – there are wins in excellent fried rice and braised mushrooms that sing with Shaoxing wine sweetness, for example, or with the likes of Sichuan-style crisp battered eggplant in fish-fragrant sauce. In the seafood stakes, pipis in a vibrant XO sauce win out over steamed cod fillets for both interest and execution – a whole fish might be a better bet. There's plenty to see in the two-level dining room, from the Shanghai colonial-era accents to the glassed-in wine cellar where staff ascend a ladder to reach the bottles above. There may be a couple of draughty pockets, and the somms might steer you towards the pointier end of the Burgundy-heavy wine list, but these are small losses, because as that final, memorable deep-fried ice-cream shows, at Mr Wong, when you win, you win big.","3 Bridge Ln, Sydney NSW 2000", R.drawable.wong));
        rList.add(new Restaurants("Rockpool Bar & Grill", 7, 4.5, "Steakhouse, Fine Dining, Modern Australian", "Sydney CBD", "$$$$", "Neil Perry's flagship fine-diner has no shortage of frills and thrills, from the dramatic Art Deco building and the luxurious Riedel glassware to the 3000-plus bottle wine list and, it must be said, the hefty bill at the end. Fads, however, are in short supply, especially when it comes to the food: the entire menu works in service of a stoutly confident theme celebrating classic cooking and exceptional ingredients. Beef, which is the headline act on the carte, is sourced from sustainable producers, aged in-house and, if the dark-crusted Cape Grim Scotch is anything to go by, cooked with a trained eye and steady hands, but there's almost never a foot put wrong anywhere else either. Layers of complexity push an entrée of chicken soup far beyond the realm of simple comfort food, and a side dish of woodfired creamed corn with chipotle chilli butter and Manchego arrives hot and juicy. The clientele is one of the few surprises; the CBD power players are out in force, but there's also strong representation from more casual diners who know there's nowhere else in Sydney offering such a reliably excellent and timeless dining experience.","66 Hunter St, Sydney NSW 2000", R.drawable.rockpool));
        rList.add(new Restaurants("Automata", 8, 4, "Degustation, Modern Australian, Fine Dining", "Chippendale", "$$$", "What's in a name? Automata, as machines, function seamlessly without any hint to their inner workings. Here, in an industrial setting warmed by buzz and hum, layers of depth and nuance lie behind a veneer of simplicity. Take the beef rump cap – pink, with a dark crust – for which the accompanying grains, called Job's tears, have been inoculated with koji for added savouriness. Or the circle of raw yellowfin tuna, covered with burnt watermelon dressed with tamari, which hides a centre of cream turned sour with kefir. The 5-course prix fixe may have crept to over $100, but based on the level of skill and the speed of thought, this is still one of the best-value tasting menus around. Marvel at the delicacy of beetroot slices pinched around spheres of sheep's curd and served in a broth of crab apple and fennel, or the depth of flavour in the ink sauce underscoring arrows of cuttlefish. Add a killer drinks list with a fondness for the rare and unusual, and staff who are both switched-on and relaxed, and this is a place that's ticking over nicely. Well-oiled, and running smoothly.","5 Kensington St, Chippendale NSW 2008", R.drawable.automata));
        rList.add(new Restaurants("Cho Cho San", 9, 4, "Japanese, Izakaya, Modern", "Potts Point", "$$", "The menu at Cho Cho San is far from straight Japanese cuisine. Owners Jonathan Barthelmess and Sam Christie were inspired by the drinking culture on their recent trips to Japan. And they wanted to bring that fun, izakaya style to the dining room at Cho Cho San. There is a long dining bar, a great cocktail list and food that lends itself to this kind of environment.\n" +
                "\n" +
                "The space, designed by architect and interior designer George Livissianis, is minimal and painted cream. The only colour is from the shelves behind the bar, stocked to the hilt with spirits, sake and shochu. There aren’t many wines by the glass, but the sake list is long.\n" +
                "\n" +
                "Try raw scallops, with corn, nori puree and house-cured smoked bonito. The rich puree and umami of the bonito let the flavour of the fall-through-your-chopsticks delicate scallops sing.\n" +
                "\n" +
                "The pillowy, soft, steamed bun, filled with cucumber and duck smoked in jasmine tea, and the lightly wood-fired bread bun, filled with a spanner crab chowder, needs to be ordered by every diner. The side of dry udon noodles is rich and spicy – like a Japanese bolognese with chilli-bean paste, ginger and pork. The seafood and meat sections are a little more traditionally Japanese. Prawns cooked over the hibachi grill and chicken yakitori with pickled lime and sprinkled with spicy shichimi.\n" +
                "\n" +
                "The matcha green-tea soft serve is simple and delicious, tasting exactly like the ones found in many little outlets across Japan. The ginger custard is delicate in texture and flavour, intensely creamy, a sweet ginger glaze on top combines with the custard as you eat.","73 MacLeay St, Potts Point NSW 2011", R.drawable.cho));
        rList.add(new Restaurants("Mamak", 10, 4, "Malaysian, Asian, Authentic", "Haymarket", "$", "Mamak is the talk of the town and with good reason. It's one of the few places in Sydney to get exceptional Malaysian hawker food, still offered at an authentic price. It's no surprise that this place often has lines of eager customers stretching down the street. All I can say is: get in early, it's worth it.\n" +
                "\n" +
                "Walk in past the chefs, on full display, and bathe in the aroma of curries and fried roti. It's a long room, crammed full with wooden tables, and service is courteous but necessarily efficient. The menu is divided into Roti, variations on the warm bread served with curry dips and spicy sambal sauce, Satay, available in chicken or beef, Mains, featuring curries and fried chicken, and Noodle and Rice dishes.\n" +
                "\n" +
                "We pick two variants of the roti: the straightforward Roti Canai ($5.50) and the Roti Telur with fried egg ($6.50). Satay is available in half dozen ($9) or dozen ($16) lots. Our choice is chicken, and we decide that half a dozen will be plenty. For our main, it's hard to go past Nasi Goreng ($11.50), though we are temporarily distracted by the Maggi Goreng ($11.50) - a popular version of the Nasi Goreng made with Maggi noodles. For drinks, we both opt for Ice Milo ($3.50), done the Malaysian way - mixed with water and milk, and served in a glass with ice.\n" +
                "\n" +
                "Half an hour later, we leave dazed and satisfied. This is by far the best Malaysian food that Sydney has to offer. It won't be long before we're lining up all over again.","15 Goulburn St, Sydney NSW 2000",R.drawable.d7c920718056d1b99f8adaf09ea8bf5c_featured_v2));

        return rList;

    }

    //getting the rating as either an int or a double
    public String getAdjustedRating(){
        String adjustedRate = Double.toString(rating);
        if (rating % 1 == 0) {
            int intRate = (int) rating;
            adjustedRate = Integer.toString(intRate);
        }

        return adjustedRate;

    }


}