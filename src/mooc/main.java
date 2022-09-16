package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

    public class main {

        public static void main(String[] args) {
            UserInterface ui = new TextUserInterface();
            new ApplicationLogic(ui).execute(3);
        }
    }
