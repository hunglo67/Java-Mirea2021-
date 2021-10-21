package pr7;

import java.util.Queue;

public class Creat_Queue{
    public static String play(Queue cards_1, Queue cards_2){
        for (int i=0; i<106; i++){
            if (cards_1.size() == 0){
                System.out.println("The number of steps is: " + i);
                return "second " +i;
            } else if (cards_2.size() == 0){
                System.out.println("The number of steps is: " + i);
                return "first " +i ;
            } else {
                Integer card_1 = (int) cards_1.peek();
                Integer card_2 = (int) cards_2.peek();
                if (card_1 != 0 && card_2!=0){
                    if (card_1 > card_2){
                        cards_1.remove();
                        cards_2.remove();
                        cards_1.add(card_1);
                        cards_1.add(card_2);
                    } else if (card_1 < card_2){
                        cards_1.remove();
                        cards_2.remove();
                        cards_2.add(card_2);
                        cards_2.add(card_1);
                    }
                } else if(card_1 == 9 || card_2==9){
                    if (card_1 == 0){
                        cards_1.remove();
                        cards_2.remove();
                        cards_1.add(card_1);
                        cards_1.add(card_2);
                    } else if (card_2 == 0){
                        cards_1.remove();
                        cards_2.remove();
                        cards_2.add(card_2);
                        cards_2.add(card_1);
                    }
                }
            }
        }
        return "bolda";
    }
}
