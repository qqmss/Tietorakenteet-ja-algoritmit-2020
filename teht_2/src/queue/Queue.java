package queue;

/**
 * Tekee jonon käyttämällä pinoa. Uudet tietueet laitetaan pinon pohjalle
 * päälimmäiseksi laittamisen sijasta, jolloin pinosta otettaessa päälimmäinen
 * tietue toimii se kuin se olisi jono ensimmäinen tietue.
 */
public class Queue {

    private ListItem bottom;
    private Stack stack = new Stack();

    public void enqueue(String data) {
        ListItem listItem = new ListItem(data, null);
        if (bottom == null) {
            //Yhden tietueen pinon ainoa tietue on päälimmäisin ja alimmaisin.
            bottom = listItem;
            stack.push(bottom);
        } else {
            //Laita pinon pohjalle, jotta pinon päälimmäisin on vanhin.
            bottom.setNext(listItem);
            bottom = listItem;
        }
    }

    public String dequeue() {
        String data = stack.pop();
        if (data == null){
            //Jos pino tulee tyhjäksi on myös jono tyhjä.
            bottom = null;
        }
        return data;
    }
}
