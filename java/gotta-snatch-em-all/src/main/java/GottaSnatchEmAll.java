import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !theirCollection.containsAll(myCollection) && !myCollection.containsAll(theirCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) {
            return new HashSet<>();
        }

        Set<String> commonItems = new HashSet<>(collections.get(0));

        for (Set<String> collection: collections) {
            commonItems.retainAll(collection);
        }

        return commonItems;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.allCards() method");
    }
}
