package practice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Market implements MarketBehavior, QueueBehavior {
    private List<Human> actors = new ArrayList<>();
    protected LinkedList<Human> queue = new LinkedList<>();

    public String getQueue() {
        return queue.stream()
                .map(Human::toString)
                .collect(Collectors.joining(System.lineSeparator())) + "\n\n";
    }

    @Override
    public void acceptToMarket(Human actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket() {
        Iterator<Human> iterator = actors.iterator();
        while (iterator.hasNext()) {
            Human nextHuman = iterator.next();
            if (nextHuman.isMakeOrder && nextHuman.isTakeOrder) {
                iterator.remove();
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        while (!queue.isEmpty()) {
            queue.removeFirst();
        }
    }

    @Override
    public void takeInQueue(Human actor) {
        queue.addLast(actor);
    }

    @Override
    public void takeOrders() {
        for (Human actor : actors) {
            if (actor.isMakeOrder && !actor.isTakeOrder) {
                takeInQueue(actor);
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Human actorInQueue : queue) {
            actorInQueue.setTakeOrder(true);
        }

        releaseFromQueue();
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromMarket();
    }

    @Override
    public String toString() {
        return actors.stream()
                .map(Human::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}
